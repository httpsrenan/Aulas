# variaveis
a <- 10
b <- 2

somar <- function(a, b = 2){
  return(a + b)
}

somar(10,32)
somar(10)

nomes <- c("Bob", "Tom", "Mel")
nomes[1]

for(nome in nomes){
  cat(nome, "\n")
}

