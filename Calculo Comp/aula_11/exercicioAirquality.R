data("airquality")

airquality$TempLevel <- factor(
  cut(airquality$Temp, breaks = c(0,69,85,100)), # QUALITATIVA ORDINAL
  labels = c("frio", "moderada", "calor"),
  ordered = TRUE
)

airquality$SolarLevel <- factor(
  cut(airquality$Solar, breaks = c(0,50,100,160,400)), # QUALITATIVA NOMINAL
  labels = c("totalmente nublado", "parcialmente nublado", "predominante nublado", "ensolarado"),
  ordered = FALSE
)

airquality$Ozone # QUANTITATIVA DISCRETA
airquality$Solar.R # QUANTITATIVA DISCRETA
airquality$Wind # QUANTITATIVA CONTINUA
airquality$Temp # QUANTITATIVA DISCRETA
airquality$Month# QUANTITATIVA DISCRETA
airquality$Day # QUANTITATIVA DISCRETA
airquality$TempLevel # QUALITATIVA ORDINAL
airquality$TempLevel # QUALITATIVA NOMINAL

# Grafico mostra quantas vezes o clima estava em totalmente nublado, 
# parcialmente nublado, predominante nublado ou ensolarado
barplot(table(airquality$SolarLevel), main = "Grafico de nivel solar",
        col = "yellow", border = FALSE)

# Grafico mostra quantas vezes a temperatura estava em  
# frio, moderada, calor
barplot(table(airquality$TempLevel), main = "Grafico de nivel de temperatura",
        col = "red", border = FALSE)

# Grafico mostra as semanas da gravação dos dados
barplot(table(airquality$Month),col = "darkblue", border = FALSE)

# Histograma mostra a frequencia de velocidade do vento
hist(airquality$Wind, main = "Histograma de frequencia de velocidade do vento",
     xlab = "Velocidade do vento", ylab= "Frequencia", col = "skyblue", border = FALSE)
