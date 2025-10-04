# Importando biblioteca ggplot
install.packages("ggplot2")
library(ggplot2)

# Criando df para o desafio
df <- rbind(data1, data, data.01, data.02, data.03, data.04)

# Removendo a coluna de IDs
df <- df[, -1]

correlação_temp_cpu_e_uso_cpu <- cor(df$cpu, df$temperatura_cpu)
correlação_temp_disco_e_uso_disco <- cor(df$disco, df$temperatura_disco)
correlação_uso_cpu_e_qtd_processo <- cor(df$cpu, df$quantidade_processos)
correlação_uso_ram_e_qtd_processo <- cor(df$ram, df$quantidade_processos)
correlação_uso_cpu_e_uso_ram <- cor(df$cpu, df$ram)
correlação_temp_cpu_e_temp_disco <- cor(df$temperatura_cpu, df$temperatura_disco)

ggplot(mapping = aes(df$temperatura_disco, df$disco)) +
  geom_point(color = "red") +
  geom_smooth(method = "lm", color = "darkblue")

ggplot(mapping = aes(df$quantidade_processos, df$cpu)) +
  geom_point(color = "darkcyan") +
  geom_smooth(method = "lm", color = "darkviolet")

ggplot(mapping = aes(df$quantidade_processos, df$ram)) +
  geom_point(color = "black") +
  geom_smooth(method = "lm", color = "darkgreen")

ggplot(mapping = aes(df$temperatura_cpu, df$cpu)) +
  geom_point(color = "gold") +
  geom_smooth(method = "lm", color = "white")
