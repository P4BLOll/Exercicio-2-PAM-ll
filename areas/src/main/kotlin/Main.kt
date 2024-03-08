import java.lang.Math.*

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
    val input = readLine()

    if (input.isNullOrEmpty()) {
        println("Nada inserido, tente novamente.")
        return
    }

    val opcao = input!!.toInt()

    when(opcao){
        1 ->{
            println("Digite a base do retângulo:")
            var base= readLine()!!.toDouble()
            println("Digite a altura do retângulo:")
            var altura = readLine()!!.toDouble()
            println("A área do retângulo é: ${retangulo(base, altura)}")

        }

        2 ->{
            println("Digite o lado do triângulo equilátero:")
            val lado = readLine()!!.toDouble()
            println("A área do triângulo é: ${equilatero(lado)}")
        }

        3 ->{
            println("Digite a base do triângulo isóceles:")
            val base = readLine()!!.toDouble()
            println("Digite a altura do triângulo isóceles:")
            val altura = readLine()!!.toDouble()
            println("A área do triângulo é: ${isoceles(base, altura)}")
        }

        4 ->{
            println("Digite a base do triângulo escaleno:")
            val base = readLine()!!.toDouble()
            println("Digite a altura do triângulo escaleno:")
            val altura = readLine()!!.toDouble()
            println("A área do retângulo é: ${escaleno(base, altura)}")
        }

        5 ->{
            println("Digite o raio da circunferencia:")
            val raio = readLine()!!.toDouble()
            println("A área da circunferencia é: ${circunferencia(raio)}")
        }

        6 ->{
            println("Digite a menor diagonal do losango:")
            val dMenor = readLine()!!.toDouble()
            println("Digite a maior diagonal do losango:")
            val dMaior = readLine()!!.toDouble()
            println("A área do retângulo é: ${losango(dMaior, dMenor)}")
        }

        7 ->{
            println("Digite a 1° base do trapezio:")
            val b1 = readLine()!!.toDouble()
            println("Digite a 2° base do trapezio:")
            val b2 = readLine()!!.toDouble()
            println("Digite a altura do trapezio:")
            val altura = readLine()!!.toDouble()
            println("A área do retângulo é: ${trapezio(b1, b2, altura)}")
        }
    }
}


fun retangulo(b: Double, a: Double):Double{
    var area = (b * a)
    return area

}

fun equilatero(lado: Double):Double{
    var area = (lado * lado * sqrt(3.0)) / 4
    return area

}

fun isoceles(b: Double, a: Double):Double{
    var area = (b*a)/2
    return area

}

fun escaleno(b: Double, a: Double):Double{
    var area = (b*a)/2
    return area

}

fun circunferencia(r: Double):Double{
    var area = (2*PI)*r
    return area

}

fun losango(dMaior: Double, dMenor: Double):Double{
    var area = (dMaior*dMenor)/2
    return area

}

fun trapezio(bMaior: Double, bMenor: Double, a: Double):Double{
    var area = (bMaior * bMenor * a)/2
    return area

}


fun main() {
    opcoes()
}