import csv
from datetime import datetime, timedelta

arquivo = "coletas-dados.csv"
linhas = []

# Lendo o CSV
with open(arquivo, newline="", encoding="utf-8") as arquivoLer:
    leitor = csv.DictReader(arquivoLer)

    print("Colunas detectadas:", leitor.fieldnames)  # debug para você ver

    for linha in leitor:
        try:
            linha["timesnap"] = datetime.strptime(linha["timesnap"], "%d-%m-%Y %H:%M:%S")
            linha["cpu"] = float(linha["cpu"])
            linha["ram"] = float(linha["ram"])
            linha["disco"] = float(linha["disco"])
            linhas.append(linha)
        except ValueError:
            continue

repeticao = True
while repeticao:
    resposta = input(
        "\nDigite o número do que deseja ver: \n"
        "1 - Exibir o uso médio de RAM da última hora. \n"
        "2 - Exibir o pico de uso de CPU em determinado período. \n"
        "3 - Exibir a média de uso de disco nos últimos N minutos.\n"
        "0 - Sair\n"
    )

    try:
        resposta = int(resposta)
    except ValueError:
        print("Digite apenas números válidos.")
        continue

    if resposta == 1:
        agora = datetime.now()
        limite = agora - timedelta(hours=1)

        soma = qtd = 0
        for linha in linhas:
            if linha["timesnap"] >= limite:
                soma += linha["ram"]
                qtd += 1

        print(f"Média de RAM da última hora: {soma/qtd:.2f}%" if qtd > 0 else "Nenhum dado na última hora.")

    elif resposta == 2:
        inicio_txt = input("Digite o início (DD-MM-YYYY HH:MM:SS): ")
        fim_txt = input("Digite o fim (DD-MM-YYYY HH:MM:SS): ")

        try:
            inicio = datetime.strptime(inicio_txt, "%d-%m-%Y %H:%M:%S")
            fim = datetime.strptime(fim_txt, "%d-%m-%Y %H:%M:%S")
        except ValueError:
            print("Formato de data/hora inválido.")
            continue

        pico = None
        quando_pico = None

        for linha in linhas:
            tempo = linha["timesnap"]
            if inicio <= tempo <= fim:
                if pico is None or linha["cpu"] > pico:
                    pico = linha["cpu"]
                    quando_pico = tempo

        print(f"Pico de CPU no período: {pico:.2f}% em {quando_pico}" if pico is not None else "Nenhum dado no período.")

    elif resposta == 3:
        try:
            n = int(input("Digite quantos minutos quer analisar: "))
        except ValueError:
            print("Digite apenas números inteiros.")
            continue

        agora = datetime.now()
        limite = agora - timedelta(minutes=n)

        soma = qtd = 0
        for linha in linhas:
            if linha["timesnap"] >= limite:
                soma += linha["disco"]
                qtd += 1

        print(f"Média de disco nos últimos {n} min: {soma/qtd:.2f}%" if qtd > 0 else f"Sem dados nos últimos {n} minutos.")

    elif resposta == 0:
        print("Saindo...")
        repeticao = False

    else:
        print("Opção inválida.")
