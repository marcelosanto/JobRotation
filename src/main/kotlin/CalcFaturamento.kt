import com.google.gson.Gson
import java.io.File

/**
 * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
 * • O menor valor de faturamento ocorrido em um dia do mês;
 * • O maior valor de faturamento ocorrido em um dia do mês;
 * • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
 *
 * IMPORTANTE:
 * a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
 * b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 **/

data class FaturamentoDiario(val dia: Int, val valor: Double)

fun CalcFaturamento() {
    val gson = Gson()
    val file = File("src/faturamento.json") // Abre o arquivo json
    val json = file.readText() // Ler o Arquivo json
    val faturamentoDiario = gson.fromJson(json, Array<FaturamentoDiario>::class.java) // Converter o arquivo json pra um Array por meio do gson e a data class fornecida

    // Calcular o menor e o maior valor de faturamento diário
    val valoresDiarios = faturamentoDiario.map { it.valor }
    val menorValor = valoresDiarios.filter { it != 0.0 }.minOrNull()
    val maiorValor = valoresDiarios.maxOrNull()

    // Calcular a média mensal de faturamento diário, ignorando dias com faturamento 0.0
    val valoresFiltrados = valoresDiarios.filter { it != 0.0 }
    val mediaMensal = valoresFiltrados.sum() / valoresFiltrados.size

    // Calcular o número de dias no mês em que o faturamento diário foi superior à média mensal
    val diasAcimaDaMedia = valoresFiltrados.count { it > mediaMensal }

    // Imprimir resultados
    println("Menor valor de faturamento diário: $menorValor")
    println("Maior valor de faturamento diário: $maiorValor")
    println("Número de dias com faturamento acima da média mensal: $diasAcimaDaMedia")

}