print("""
  ____      _            _           _                             _      
 / ___|__ _| | ___ _   _| | __ _  __| | ___  _   _ _ __ __ _    __| | ___ 
| |   / _` | |/ __| | | | |/ _` |/ _` |/ _ \| | | | '__/ _` |  / _` |/ _ |
| |__| (_| | | (__| |_| | | (_| | (_| | (_) | |_| | | | (_| | | (_| |  __/
 \____\__,_|_|\___|\__,_|_|\__,_|\__,_|\___/ \__,_|_|  \__,_|  \__,_|\___|
 ___ __  __  ____                                                         
|_ _|  \/  |/ ___|                                                        
 | || |\/| | |                                                            
 | || |  | | |___                                                         
|___|_|  |_|\____|                                                                                                                   
""")
resposta = 's'


while resposta == 's':

    peso = float(input("Digite seu peso (kg): "))
    altura = float(input("Digite sua altura (m): "))
    imc = round(peso/(altura ** 2), 2)

    if imc < 16:
        print(f'Seu IMC é {imc} - Baixo peso muito grave')
    elif imc < 17:
        print(f'Seu IMC é {imc} - Baixo peso grave')
    elif imc < 18:
        print(f'Seu IMC é {imc} - Baixo peso ')
    elif imc < 25:
        print(f'Seu IMC é {imc} - Peso ideal')
    elif imc < 30:
        print(f'Seu IMC é {imc} - Sobrepeso')
    elif imc < 35:
        print(f'Seu IMC é {imc} - Obesidade grau I')
    elif imc < 40:
        print(f'Seu IMC é {imc} - Obesidade grau II')
    else:
        print(f'Seu IMC é {imc} - Obesidade morbida')


    resposta = input("Deseja calcular o IMC de outra pessoa? (s/n):")

print("Encerrando a calculadora...")