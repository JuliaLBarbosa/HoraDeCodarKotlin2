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

    println("A soma dos números menor que 72 será: " + soma)
    println("O primeiro número foi: " + n1 + ", o segundo número foi: " + n2 +
    ", o terceiro foi: " + n3 + ", o quarto número: " + n4 + ", o quinto número: " + n5 +
    ", o sexto número foi: " + n6)
}
