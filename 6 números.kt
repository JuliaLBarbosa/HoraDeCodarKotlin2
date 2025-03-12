fun main(){

    println("Digite um número: ")
    var n1 = readln().toInt()

    println("Digite um número: ")
    var n2 = readln().toInt()

    println("Digite um número: ")
    var n3 = readln().toInt()

    println("Digite um número: ")
    var n4 = readln().toInt()

    println("Digite um número: ")
    var n5 = readln().toInt()

    println("Digite um número: ")
    var n6 = readln().toInt()

    var soma = 0

        if (n1 < 72){
        soma = soma + n1
    }
    if (n2 < 72){
        soma = soma + n2
    }

    if (n3 < 72){
        soma = soma + n3
    }
    if (n4 < 72){
        soma = soma + n4
    }
    if (n5 < 72){
        soma = soma + n5
    }
    if (n6 < 72){
        soma = soma + n6
    }

    println("A soma dos números será: " + soma)
    println("O primeiro número: " + n1 + " O segundo número será: " + n2 +
    " o terceiro número: " + n3 + " o quarto número: " + n4 + " O quinto número: " + n5 +
    "o sexto número: " + n6)
}