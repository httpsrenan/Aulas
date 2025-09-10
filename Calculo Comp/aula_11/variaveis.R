clientes <- data.frame(
  nome = c("Bob", "Anna", "Tom", "Mel", "Dan"), #nominal
  idade = c(30,20,22,43,37), #discreta
  salario = c(6543.5, 10145.5, 7821.2, 3921.5, 2254.1), #continua
  plano = factor(
    c("prata", "ouro", "prata", "bronze", "bronze"), #ordinal
    levels = c("bronze", "prata", "ouro"),
    ordered = TRUE
  ),
  area = factor(
    c("humanas", "biologicas", "exatas", "biologicas", "humanas"), #nominal
    levels = c("humanas", "biologicas", "exatas"),
    ordered = FALSE
  )
)

clientes$plano
clientes$area

#Graficos
hist(clientes$salario)

barplot(table(clientes$plano))
