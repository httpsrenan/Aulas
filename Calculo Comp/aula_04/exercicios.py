import math

print('\n' * 2)
print("1-------------------EXERCICIO 1--------------------------------")
a = 2
quadrado1 = a ** 2
cubo1 = a ** 3
quarta1 = a ** 4

print(f"Potência ao quadrado: {quadrado1}")
print(f"Potência ao cubo: {cubo1}")
print(f"Potência a quarta: {quarta1}")



print('\n')
print("--------------------EXERCICIO 2--------------------------------")
c = input("Digite um numero: ")
d = input("Digite outro numero: ")

cint = int(c)
dint = int(d)

quadrado2 = math.pow(cint, 2)
cubo2 = math.pow(cint, 3)
quarta2 = math.pow(cint, 4)
elevado_a_d = math.pow(cint, dint)

print(f"c elevado ao quadrado: {quadrado2}")
print(f"c elevado ao cubo: {cubo2}")
print(f"c elevado ao quarta: {quarta2}")
print(f"c elevado ao d: {elevado_a_d}")

print('\n')
print("--------------------EXERCICIO 3--------------------------------")

x = 512

quadrada3 = x ** (1/2)
cubica3 = x ** (1/3)
quarta3 = x ** (1/4)

quadrada3 = round(quadrada3, 2)
cubica3 = round(cubica3, 2)
quarta3 = round(quarta3, 2)

print(f"Raiz quadrada de x: {quadrada3}")
print(f"Raiz cúbica de x: {cubica3}")
print(f"Raiz quarta de x: {quarta3}")

print('\n')
print("--------------------EXERCICIO 4--------------------------------")

w = 3345.61

piso = math.floor(w)
teto = math.ceil(w)
arredondado = round(w)

print(f"Piso salarial: {piso}")
print(f"teto salarial: {teto}")
print(f"arredonda salarial: {arredondado}")


print('\n')
print("--------------------EXERCICIO 5--------------------------------")

e = 16.10
f = 15.7
g = 13.0

e = round(e)
f = round(f)
g = round(g)

print(f"E: {e}")
print(f"F: {f}")
print(f"G: {g}")

print('\n')
print("--------------------EXERCICIO 6--------------------------------")

x1=1.456
x2=3.678
x3=7.5

h = round(x1)
i = round(x2)
j = round(x3)

print(f"X1: {h}")
print(f"X2: {i}")
print(f"X3: {j}")

print('\n')
print("--------------------EXERCICIO 7--------------------------------")

resultado = math.floor(1.456)
print(resultado)
print(type(resultado))

resultado_float = float(math.floor(1.456))
print(resultado_float)
print(type(resultado_float))

# Não estava indo pois precisa ter o math na frente, para deixar claro que pegou da biblioteca math

print('\n')
print("--------------------SUPER EXERCICIO 8--------------------------------")
a = 2
b = 3
c = a ** b
print(f"1- {c}")

a = -2
b = 3
c = a ** b
print(f"2- {c}")

a = 1
b = 0
c = a ** b
print(f"3- {c}")

a = -1
b = 0
c = a ** b
print(f"4- {c}")

a = 2
b = 0
c = a ** b
print(f"5- {c}")

a = 2
b = 5
c = 3
d = (a/b) ** c
print(f"6- {d}")

a = 3
b = -2
c = a ** b
print(f"7- {c}")

a = 1
b = 2
c = -3
d = (a/b) ** c
print(f"8- {d}")

a = -1
b = 3
c = 4
d = (a ** b) ** c
print(f"9- {d}")

a = 0.5
b = 3
c = a ** b
print(f"10- {c}")

a = 0.25
b = 4
c = a ** b
print(f"11- {c}")

a = 0
b = 4
c = a ** b
print(f"12- {c}")

a = 1
b = 0.41
c = 2
d = a + (b ** c)
print(f"13- {d}")

a = 1
b = 4
c = 5 
d = 2
e = -4
f = a/b + c ** d - d ** e
print(f"14- {f}")