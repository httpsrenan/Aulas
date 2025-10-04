p <- 189000 # conveniados
n1 <- 60480 # 32% de conveniados
n2 <- 30240 # metade dos 32%, por se tratar de duas faixas etárias

# de 7a 17 anos
set.seed(123)
idade_jovens_pop <- rep(7:17, length = p)
idade_jovens <- sample(idade_jovens_pop, n2)
idade <- sample(idade_jovens_pop, n2)
media_jovens <- round(mean(idade)) # média de idade
hist(idade , labels = TRUE) # podemos visualizar que 
df_idade_jovens <- data.frame(idade)

# de 55 a 82
set.seed(123)
idade_idosos_pop <- rep(55:82, length = p)
idade_idosos <- sample(idade_idosos_pop, n2)
idade <- sample(idade_idosos_pop, n2)
media_idosos <- round(mean(idade))
hist(idade , labels = TRUE) # amostragem
round(mean(idade)) # média de idade
df_idade_idosos <- data.frame(idade)

df_populacao <- rbind(df_idade_idosos, df_idade_jovens)


# 1. Qual a média de idade com maior número de atendimentos médicos?
# A média de casos de jovens que recorreram ao atendimento médico, é de 12 anos
media_jovens <- round(mean(idade_jovens))
media_jovens
# No entanto, a idade com maior pico de recorrências ao centro médico, 
# é de 14 anos, como é possível visualizar no histograma abaixo:
hist(idade_jovens , main = "Histograma de quantidade de jovens por idade", xlab = "Idade", ylab = 
       "Frequencia",labels = TRUE)

# Já no caso de idosos, a média de idade de idosos que procuraram um serviço 
# médico, foi de 68 anos.
media_idosos <- round(mean(idade_idosos))
media_idosos
# No entanto, as idades com maior pico de casos, na qual precisaram recorrer
# a um serviço médico, foi entre 63 e 64 anos, vide o hitograma abaixo:
hist(idade_idosos ,main = "Histograma de quantidade de idosos por idade", xlab = "Idade", ylab = 
       "Frequencia" , labels = TRUE)

# 2. Quais faixas etárias necessitam de maior número de atendimentos médicos?
df_idade_idosos <- data.frame(idade_idosos)
df_populacao$faixa_etaria <- factor(
  cut(df_populacao$idade, breaks = c(6, 12, 18, 54, 64, 83)),
  labels = c("Criança", "Jovens", "Adulto", "Idosos"),
  ordered = FALSE
)

barplot(table(df_populacao$faixa_etaria))

# De acordo com o gráfico acima, os idosos são o público que mais necessita
# de atendimentos médicos.

# 3. Qual ala o hospital deve priorizar: jovens ou idosos?
# De acordo com o gráfico de barras acima, é possível visualizar que os
# idosos são o público que mais busca atendimentos médicos por problemas
# respiratórios. Ademais, estes visam necessitar de atendimentos, pois 
# possuem um sistema fisiólogico mais frágil, precisando de mais atenção.

# 4. Qual o percentual da ala que precisa ser priorizada?
n_idosos <- sum(df_populacao$faixa_etaria == "Idosos")

percent_idosos <- round(100 * n_idosos / n1, 2)
percent_idosos

# 32% de todos os 60480 pacientes conveniados cerca de 19353 idosos