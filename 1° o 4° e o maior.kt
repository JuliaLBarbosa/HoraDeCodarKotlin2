fun main(){

    println("Digite um número: ")
    var n1 = readln().toInt()

    println("Digite um número: ")
    var n2 = readln().toInt()

    println("Digite um número: ")
    var n3 = readln().toInt()

    println("Digite um número: ")
    var n4 = readln().toInt()

    println("O primeiro número será: " + n1)
    println("O último número será: " + n4)

    if(n1 > n2 && n1 > n3 && n1 > n4){
        println("o número maior será: " + n1)
    }
    else if(n2 > n1 && n2 > n3 && n2 > n4){
        println("O número maior será: " + n2)
    }
    else if(n3 > n1 && n3 > n2 && n3 > n4){
        println("O número maior será: " + n3)
    }
    else if(n4 > n1 && n4 > n2 && n4 > n3){
        println("O número maior será: " + n4)
    }

}