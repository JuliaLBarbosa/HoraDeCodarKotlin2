fun main(){

    println("Digite um número: ")
    var n1 = readln().toInt()

    println("Digite um número: ")
    var n2 = readln().toInt()

    println("Digite um número: ")
    var n3 = readln().toInt()

    if (n1 > n2 && n1 > n3){
        println("O primeiro é maior que o segundo e o terceiro")
    }
    else if(n2 > n1 && n2 > n3){
        println("O segundo é maior que o primeiro e o terceiro")
    }
    else if(n3 > n1 && n3 > n2){
        println("O terceiro é maior que o primeiro e o segundo")
    }

}