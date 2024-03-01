fun opcoes(){
    println("Calcular Área")
    println("Selecione uma das opções abaixo:")
    println("")
    println("Retângulo -> 1\n" +
            "Triângulo Equilátero -> 2\n" +
            "Triângulo Isóceles -> 3\n" +
            "Triângulo Escaleno -> 4\n" +
            "Circunferência -> 5\n" +
            "Losango -> 6\n" +
            "Trapézio -> 7")
    val input = readln()

    if (input.isNullOrEmpty()) {
        println("Nada inserido, tente novamente.")
        return
    }

    val opcao = input!!.toInt()

    when(opcao){
        1 ->{
            println("Digite a base do retângulo:")
            val base = readln().toDouble()
            println("Digite a altura do retângulo:")
            val altura = readln().toDouble()
            println("A área do retângulo é: ${retangulo(base, altura)}")
        }
    }
}

fun retangulo(b: Double, a: Double):Double{

}

fun equilatero(lado: Double):Double{

}

fun isoceles(b: Double, a: Double):Double{

}

fun escaleno(l1: Double, l2: Double, l3: Double):Double{

}

fun circunferencia(r: Double):Double{

}

fun losango(dMaior: Double, dMenor: Double):Double{

}

fun trapezio(bMaior: Double, bMenor: Double, a: Double):Double{

}


fun main() {
    opcoes()
}