# Projetos em Kotlin

Este repositório contém vários projetos desenvolvidos em Kotlin, uma linguagem de programação multiplataforma moderna que roda na JVM.

# Fibonacci
Este projeto implementa uma função que calcula a sequência de Fibonacci e verifica se um número dado pertence a essa sequência. A sequência começa com 0 e 1, e o próximo valor é sempre a soma dos dois valores anteriores. A função pode ser usada da seguinte maneira:
```
val numero = 8
val resultado = verificaSequenciaFibonacci(numero)
if (resultado) {
    println("$numero pertence à sequência de Fibonacci")
} else {
    println("$numero não pertence à sequência de Fibonacci")
}
```

# Faturamento

Este projeto calcula algumas estatísticas a partir de um vetor que contém os valores de faturamento diário de uma distribuidora. As estatísticas calculadas são o menor valor de faturamento, o maior valor de faturamento e o número de dias em que o faturamento diário foi superior à média mensal. Os dias em que o faturamento é zero são ignorados no cálculo da média. Os dados de faturamento podem ser fornecidos por meio de um arquivo JSON ou XML. O projeto pode ser executado da seguinte maneira:

```
val arquivoJson = "faturamento.json"
val faturamento = lerFaturamento(arquivoJson)
val estatisticas = calcularEstatisticas(faturamento)

println("Menor faturamento diário: ${estatisticas.menor}")
println("Maior faturamento diário: ${estatisticas.maior}")
println("Número de dias com faturamento acima da média: ${estatisticas.diasAcimaDaMedia}")
```
# Representação de Faturamento por Estado
Este projeto calcula o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. Os valores de faturamento mensal para cada estado são fornecidos diretamente no código-fonte do projeto. O projeto pode ser usado da seguinte maneira:

```
val faturamentoSP = 67836.43
val faturamentoRJ = 36678.66
val faturamentoMG = 29229.88
val faturamentoES = 27165.48
val faturamentoOutros = 19849.53
val faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros
val representacoes = calcularRepresentacoes(faturamentoTotal, faturamentoSP, faturamentoRJ, faturamentoMG, faturamentoES, faturamentoOutros)

println("Representação de faturamento por estado:")
println("SP: ${representacoes[0]}%")
println("RJ: ${representacoes[1]}%")
println("MG: ${representacoes[2]}%")
println("ES: ${representacoes[3]}%")
println("Outros: ${representacoes[4]}% ")
```
# Reverse String
