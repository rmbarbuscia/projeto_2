//fun main(args: Array<String>) {
    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
   // println("Program arguments: ${args.joinToString()}")

//1.	Faça um programa que receba três inteiros e diga qual deles é o maior.

fun main() {
    var numes = IntArray(3)
    var maior = 0

    for (i in 0..2) {
        println("digite ${i + 1} numero")
        numes[i] = readLine()!!.toInt()
        if (numes[i] >= maior) {
            maior = numes[i]
        }
    }
    println("O maior numero é $maior")
}

//exercicio  4 	Faça um programa em que permita
//a entrada de um número qualquer e exiba se este número é par ou ímpar.
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.

fun main(){
        print("Digite o numero para saber qual o mes correspondente")
        val nun = readLine()!!.toInt()

        when(nun){

            1 -> println("janeiro")
            2 -> println("fevereiro")
            3 -> println("março")
            4 -> println("abril")
            5 -> println("maio")
            6 -> println("junho")
            7 -> println("julho")
            8 -> println("agosto")
            9 -> println("setembroo")
            10 -> println("outubro")
            11 -> println("novembro")
            12 -> println("dezembro")
            else -> println("numero invalido. Digite um numero de um a 12") }


        }
}
        //
