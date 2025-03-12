fun main(){

    println("Digite o ano que você nasceu: ")
    var ano = readln().toInt()

    if(ano <= 2009){
        println("Você já poderá votar")
    }
    else if(ano > 2009){
        println("Você não poderá votar.")
    }

}