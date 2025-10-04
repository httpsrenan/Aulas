# Importando biblioteca ggplot
install.packages("ggplot2")
library(ggplot2)

# Criando df para o desafio
df <- rbind(data, data.01, data.02, data.03, data.04, data1)

# Removendo a coluna de IDs
df <- df[, -1]

correlação_temp_cpu_e_uso_cpu <- cor(df$cpu, df$temperatura_cpu)
correlação_temp_disco_e_uso_disco <- cor(df$disco, df$temperatura_disco)
correlação_uso_cpu_e_qtd_processo <- cor(df$cpu, df$quantidade_processos)
correlação_uso_cpu_e_qtd_processo <- cor(df$ram, df$quantidade_processos)
correlação_uso_cpu_e_uso_ram <- cor(df$cpu, df$ram)
correlação_temp_cpu_e_temp_disco <- cor(df$temperatura_cpu, df$temperatura_disco)

boxplot(df$cpu, df$ram, df$disco, 
        col = c("mediumpurple4", "cornflowerblue", "darkolivegreen4"),
        main = "Distribuição de cpu, ram e disco",
        names = c("CPU", "RAM", "DISCO"),
        ylab = "%(0-100)")


boxplot(df$temperatura_cpu, df$temperatura_disco, 
        col = c("violetred4", "firebrick2"),
        main = "Distribuição de temperatura de cpu e temperatura de disco",
        names = c("CPU", "DISCO"),
        ylab = "°C(0-100)")


boxplot(df$memoria_swap, 
        col = c("mediumpurple4"),
        main = "Distribuição de memoria swap",
        names = c("SWAP"),
        ylab = "%(0-1)")

boxplot(df$quantidade_processos, 
        col = c("darkolivegreen4"),
        main = "Distribuição de quantidade de processos")
