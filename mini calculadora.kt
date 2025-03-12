fun main(){

    println("Digite um número: ")
    var n1 = readln().toInt()

    println("Digite um número: ")
    var n2 = readln().toInt()

    println("Qual operação de matemática deseja fazer tendo as opções de:" +
            "\n1.Adição" +
            "\n2.Subtração" +
            "\n3.Divisão" +
            "\n4. Multiplicação.")

    when(readln()!!.toInt()){
        1 -> { println("A soma dos números será: " + (n1 + n2))
        }
        2 -> { println("A subtração dos números será: " + (n1 - n2))
        }
        3 ->{ println("A divisão dos números será: " + (n1 / n2))
        }
        4 -> { println("A multiplicação dos números será: " + (n1 * n2))

        }
    }

}