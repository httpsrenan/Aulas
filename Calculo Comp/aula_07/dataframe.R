#Data Frames, vamos usar muito

df_teste <- data.frame(
  nome=c("tom", "bob", "mel", "dan"),
  idade=c(10,10,10,30),
  salario=c(1500.2,1300.4,500.1,100.4)
)

max(df_teste$idade)
mean(df_teste$salario)
min(df_teste$salario)

hist(df_teste$idade)



