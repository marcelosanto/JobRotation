/**
 * 5) Escreva um programa que inverta os caracteres de um string.
 *
 * IMPORTANTE:
 * a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
 * b) Evite usar funções prontas, como, por exemplo, reverse;
 *
 * */
fun ReverserString() {
    val minhaString = "Hello World!" // string a ser invertida
    var stringInvertida = ""

    for (i in minhaString.length - 1 downTo 0) {
        stringInvertida += minhaString[i] // adiciona o caractere atual no início da string invertida
    }

    println(stringInvertida) // imprime a string invertida
}