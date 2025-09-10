idade <- rnorm(100, mean = 35, 3)

idade

hist(idade, main = "Histograma de frequencia de idade", 
     xlab= "Frequencia", ylab = "Idade", col = "purple", 
     border = "darkblue",
     labels =  TRUE)
