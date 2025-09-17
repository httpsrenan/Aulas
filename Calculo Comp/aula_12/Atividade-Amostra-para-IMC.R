p <- 200000
n <- 20000

set.seed(123)
idade <- abs(round(rnorm(n, 37, 7)))
idade

hist(idade)
plot(idade, col= "darkblue")

altura <- abs(round(rnorm(n, 1.50, 0.20),2))
altura

peso <- abs(round(rnorm(n, 55, 4),2))
peso

imc <- round(peso / (altura * altura),2)

salario <- abs(round(rnorm(n, 3000.0, 400.0),2))
salario

carro_pop <- rep(0:3, length = p)
carro_pop

carro <- sample(carro_pop, n)
carro

rm(carro_pop)

filho_pop <- rep(0:2, length = p)

filho <- sample(filho_pop, n)
filho

barplot(table(filho))

rm(filho_pop)

escolaridade_pop <- rep(0:6, length = p)
escolaridade_temp <- sample(escolaridade_pop, n)
escolaridade <- factor(escolaridade_temp,
                       levels = c(0:6),
                       labels = c(
                         "Analfabeto",
                         "1o Grau",
                         "2o Grau",
                         "3o Grau",
                         "Mestrado",
                         "Doutorado",
                         "Pós Doutorado"
                       ), ordered = (TRUE))

escolaridade

rm(escolaridade_pop)
rm(escolaridade_temp)

fumante_temp <- rbinom(n,1,0.4)
barplot(table(fumante_temp))

fumante <- factor(fumante_temp,
                   levels = c(0,1),
                   labels = c("Não fuma", "Fumante"),
                   ordered = TRUE)

barplot(table(fumante))

rm(fumante_temp)

sexo_temp <- rbinom(n,1,0.5)
barplot(table(sexo_temp))

sexo <- factor(sexo_temp,
                  levels = c(0,1),
                  labels = c("Homen", "Mulher"),
                  ordered = FALSE)

barplot(table(sexo))
rm(sexo_temp)

profissao_temp <- rbinom(n,3,0.33)
barplot(table(profissao_temp))

profissao <- factor(profissao_temp,
               levels = c(0,1,2,3),
               labels = c("Engenheiro", "Medico", "Professor", "Não trabalha"),
               ordered = FALSE)

barplot(table(profissao))
rm(profissao_temp)


df_imc <- data.frame(
  idade,
  altura,
  peso,
  imc,
  salario,
  carro,
  filho,
  escolaridade,
  fumante,
  sexo,
  profissao
)

write.table(df_imc, file = "exercicio-RenanAntonini.csv", sep = ";")
