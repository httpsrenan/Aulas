# Exibindo os 10 primeiros registros 
head(coletas.dados, 10)

# Vendo a estrutura do DF
str(coletas.dados)

# Ver o tamanho do DF (as dimenções)
dim(coletas.dados)

# Histograma de quantidade de Processos
hist(coletas.dados$processos, main = "Histograma de quantidade de Processos", 
     xlab = "Quantidade de Processos", ylab = "Frequência", col = "purple")

# Todos dados com processos < 208
coletas.dados[coletas.dados$processos < 208,]

# Mostrando apenas ram, cpu e processos
coletas.dados[, c("ram" , "cpu", "processos")]

# Criando coluna alerta de cpu
coletas.dados$alertaCpu <- ifelse(coletas.dados$cpu > 70, "CUIDADO", "Tudo normal")

# Criando coluna alerta de ram
coletas.dados$alertaRam <- ifelse(coletas.dados$ram > 70, "CUIDADO", "Tudo normal")

# vendo as novas colunas
coletas.dados

# Media de cpu quando esta rodando x processos
aggregate(cpu ~ processos, data = coletas.dados, FUN = mean)

# Histograma da % da CPU
hist(coletas.dados$cpu, main = "Histograma da % da CPU", 
     xlab = "% da CPU", ylab = "Frequência", col = "orange")

# Todos dados com cpu > 20
coletas.dados[coletas.dados$cpu > 20,]

# Media de cpu
mean(coletas.dados$cpu)

# Menor % de cpu
min(coletas.dados$cpu)

# Maior % de cpu
max(coletas.dados$cpu)

# Histograma da % da RAM
hist(coletas.dados$cpu, main = "Histograma da % da RAM", 
     xlab = "% da RAM ", ylab = "Frequência", col = "red")

# Todos dados com ram em alerta
coletas.dados[coletas.dados$alertaRam == "CUIDADO",]

# Media de ram
mean(coletas.dados$ram)

# Menor % de ram
min(coletas.dados$ram)

# Maior % de ram
max(coletas.dados$ram)
