/**
 * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
 *
 * SP – R$67.836,43
 * RJ – R$36.678,66
 * MG – R$29.229,88
 * ES – R$27.165,48
 * Outros – R$19.849,53
 *
 * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.
 **/

fun PercFatuMensal() {
    val faturamentoSP = 67836.43
    val faturamentoRJ = 36678.66
    val faturamentoMG = 29229.88
    val faturamentoES = 27165.48
    val faturamentoOutros = 19849.53

    val faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros

    val percentualSP = (faturamentoSP / faturamentoTotal) * 100
    val percentualRJ = (faturamentoRJ / faturamentoTotal) * 100
    val percentualMG = (faturamentoMG / faturamentoTotal) * 100
    val percentualES = (faturamentoES / faturamentoTotal) * 100
    val percentualOutros = (faturamentoOutros / faturamentoTotal) * 100

    println("Percentual de representação de cada estado no faturamento total mensal:")
    println("SP: ${"%.2f".format(percentualSP)}%")
    println("RJ: ${"%.2f".format(percentualRJ)}%")
    println("MG: ${"%.2f".format(percentualMG)}%")
    println("ES: ${"%.2f".format(percentualES)}%")
    println("Outros: ${"%.2f".format(percentualOutros)}%")
}