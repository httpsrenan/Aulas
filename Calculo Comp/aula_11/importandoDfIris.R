data("iris")

iris$ID <- 1:nrow(iris) #discreta

# criando variavel qualitativa ordinal
iris$PetalLengthLevel <- factor(
  cut(iris$Petal.Length, breaks = c(0,2,5,7)),
  labels = c("pequeno", "medio", "grande"),
  ordered = TRUE
)

barplot(table(iris$PetalLengthLevel))
barplot(table(iris$Species))

