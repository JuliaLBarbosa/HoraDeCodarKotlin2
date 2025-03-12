fun main(){

    print("Digite o primeiro número: ")
    var n1 = readln().toInt()
    print("Digite o primeiro número: ")
    var n2 = readln().toInt()

    var maior = if (n1 > n2) n1 else n2
    print("O maior entre eles será: " + maior )
}