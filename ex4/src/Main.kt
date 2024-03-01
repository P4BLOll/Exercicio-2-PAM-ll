inline fun transacao(funcao: () -> Unit){
    println("abrindo transação...")
    try {
        funcao()
    }finally {
        println("fechando transação")
    }
}

fun main() {
    transacao {
        println("Executando SQl 1...")
        println("Executando SQl 2...")
        println("Executando SQl 3...")
    }
}