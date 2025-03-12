fun main(){

    println("Digite o primeiro número: ")
    var n1 = readln().toInt()

    println("Digite o segundo número: ")
    var n2 = readln().toInt()

    println("Digite o terceiro número: ")
    var n3 = readln().toInt()

    if(n1 > n2 && n2 > n3 || n1 > n3){
        println(n1 + n2)
    }
    else if(n1 > n3 && n3 > n2 || n1 > n2){
        println(n1 + n3)
    }
    else{
        println(n2 + n3)
    }

}