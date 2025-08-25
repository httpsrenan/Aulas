# ALTERANDO INFORMAÇÕES DO GRAFICO:
# main = nome do grafico
# xlab = descrição do eixo x
# ylab = descrição do eixo x
# col = cor
# border = se quer borda ou não (TRUE ou FALSE)
hist(df_grupo$disco, main = "Histograma de uso de disco", 
     xlab = "% de Disco", ylab = "Frequência", col = "skyblue", border = FALSE)