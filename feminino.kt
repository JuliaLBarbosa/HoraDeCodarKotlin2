fun main(){

    println("Digite seu nome: ")
    var nome = readln()

    println("Digite o peso em kg: ")
    var peso = readln().toDouble()

    println("Digite a altura em metros: ")
    var altura = readln().toDouble()

    println("escolha se é " +
            "\n1-feminino" +
            "\n2-masculino: ")

    when(readln()!!.toInt()){
        1 -> { println("O peso ideal será: " + ((62.1 * altura) - 44.7))
        }
        2 -> { println("O peso ideal será: " + ((72.7 * altura) - 58))
        }

    }

}