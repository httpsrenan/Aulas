set.seed(123)
# 1- Simulação da Idade dos Jogadores (rnorm())
idade <- abs(round(rnorm(200, 25, 6)))
hist(idade)

# 2- Simulação de Jogadores Visitando a Loja por Hora (rpois())
chegada <- rpois(8, 30)
hist(chegada)
barplot(chegada)

# 3- Simulação de Uso de Cupons Virtuais (rbinom())
cupons <- rbinom(500, 1, 0.45)
barplot(table(cupons))

# 4- Além de amostras, probabilidades com Distribuições (pnorm, pbinom, ppois)

# 4.1- Idade dos jogadores: Qual a probabilidade de um 
# jogador ter menos de 20 anos?
idade_menor <-pnorm(20, mean = 25, sd = 6)
idade_menor

# 4.2- Cupons utilizados: Qual a probabilidade de até 200 
# cupons serem usados entre os 500 distribuídos?
cupons_usado <- pbinom(200, 500, 0.45)
cupons_usado

# 4.3- Jogadores por hora: Qual a probabilidade de menos de 25 
# jogadores visitarem a loja em uma hora de pico?
jog_hora <- ppois(24, 30)
jog_hora
