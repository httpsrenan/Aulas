boxplot(resultado$prova01, resultado$prova02, resultado$prova03, 
        col = c("mediumpurple4", "cornflowerblue", "darkolivegreen4"),
        main = "Distribuição de notas por prova",
        names = c("Prova 1", "Prova 2", "Prova 3"),
        ylab = "Nota(0-10)")


library("ggplot2")
install.packages("tidyr")
library("tidyr")

resultado_p <- pivot_longer(resultado,
                            cols = starts_with("prova"),
                            values_to = "nota",
                            names_to = "prova")

ggplot(mapping = aes(resultado_p$prova,
                     resultado_p$nota,
                     fill = resultado_p$prova)) + 
  geom_boxplot()
