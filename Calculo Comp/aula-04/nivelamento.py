ceu = "azul"
# if
if ceu == "azul":
    print("O céu está azul")
elif ceu == "cinza":
    print("O céu está cinza")
else:
    print("O céu está diferente")

# While
contador = 0
while contador < 5:
    print("Repetindo com while ", contador)
    contador += 1

# For
for i in range(6):
    print("Repetindo com for ", i)

# For que você define de onde começa
for i in range(1, 6):
    print("Repetindo com for ", i)

# For que você define de onde começa e pula de 2 em 2
for i in range(0, 7, 2):
    print("Repetindo com for ", i)

# Printar vetores
vetor = [10,20,30,40,50]

# Printa ente as posições
print(vetor[1:4])

# Printa tudo
print(vetor[:])

# Printa pulando de 2 em 2
print(vetor[::2])

# Printa do 3 em diante
print(vetor[3:])

# Printa até o 3
print(vetor[:3])

# Printa de traz para frente
print(vetor[::-1])

# Editar vetores
lista = [10, "texto", True]

# Adiciona no final
lista.append(3.14)
print("Depois do append: ", lista)

# Adiciona na posição que vc pediu
lista.insert(1, "novo valor")
print("Depois do insert: ", lista)

# Remove a palavra que vc pediu
lista.remove(True)
print("Depois do remove: ", lista)

# Remove a palavra na posicão que vc pediu
removido = lista.pop(2)
print(f"Depois do pop, removido: {removido}, lista: {lista} ")

# Vetor
vetor = [1,2,3,4,5,6]
print("Vetor: ", vetor)

# Matriz
matriz = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]
print("Matriz:")
for linha in matriz:
    print(linha)
