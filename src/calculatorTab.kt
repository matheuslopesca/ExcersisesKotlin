fun main(){

    geraTabuada(getInput())

}

fun getInput() : Int {
    print("Digite o Valor: ")
    return readln().toInt()
}

fun geraTabuada(valor: Int) {
    for (i in 1..10 step 1) {
        println(" $valor x $i = ${valor * i} ")
    }
}