# Juntando as coletas de dados (Mesma formatação)
df_grupo <- rbind(coletas.dados, captura.carlos, captura.giuliana, captura.marina, captura.rafael)

# Remover as coletas que não usaremos mais
rm(coletas.dados, captura.carlos, captura.giuliana, captura.marina, captura.rafael)

# Primeiros passos:
# Exibindo os primeiros registros (colocando um ,x vc escolhe até qual numero vai)
head(df_grupo)

# Vendo a estrutura do DF
str(df_grupo)

# Ver o tamanho do DF (as dimenções)
dim(df_grupo)

# Ver a media 
mean(df_grupo$ram)

# Ver o minimo 
min(df_grupo$ram)

# Ver o maximo 
max(df_grupo$ram)

# Mostraoque são os dados (Classe, min, max, media, mediana, quartil ...)
summary(df_grupo)

# Manipulando um DF
# df[linha, coluna]
df_grupo[1]
df_grupo[,1]

# Filtrando linhas
df_grupo[df_grupo$cpu > 60,]

# Filtrando colunas
df_grupo[, c("ram" , "cpu")]

mean(df_grupo$ram[df_grupo$user == "renan"])

# Criando colunas
df_grupo$alerta <- df_grupo$ram > 50
df_grupo$alerta <- ifelse(df_grupo$ram > 50, "CUIDADO", "De boa")

# Media de cpu de cada user
aggregate(cpu ~ user, data = df_grupo, FUN = mean)

# Traz o user que usou mais cpu
df_grupo[which.max(df_grupo$cpu),]