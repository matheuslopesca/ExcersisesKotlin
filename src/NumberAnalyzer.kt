import kotlin.collections.indices
import kotlin.random.Random

fun main() {
    val numberList = mutableListOf<Int>()

    for ( i in 1..20 ){
        numberList.add(Random.nextInt(1, 101))
    }

    println("Lista: $numberList")
    println("Quantidade de Pares: ${getEven(numberList).size}")
    println("Quantidade de Impares: ${getOdd(numberList).size}")
    println("Maior Numero: ${getHighNumber(numberList)}")
    println("Menor Numero: ${getLowestNumber(numberList)}")

}

private fun getEven (list: MutableList<Int>) : MutableList<Int> {

    val evenList = mutableListOf<Int>()

    for ( i  in list.indices ) {
        if (list[i] % 2 == 0) {
            evenList.add(list[i])
        }
    }
    return evenList
}

private fun getOdd (list: MutableList<Int>) : MutableList<Int> {
    val oddList = mutableListOf<Int>()

    for ( i  in list.indices ) {
        if (list[i] % 2 != 0) {
            oddList.add(list[i])
        }
    }

    return oddList
}

private fun getHighNumber (list: MutableList<Int>) : Int {

    var highNumber = list[0]

    for ( i  in list.indices) {
        if (highNumber < list[i]) {
            highNumber = list[i]
        }
    }

    return highNumber
}

private fun getLowestNumber (list: MutableList<Int>) : Int {

    var lowestNumber = list[0]

    for ( i  in list.indices ) {
        if (lowestNumber > list[i]) {
            lowestNumber = list[i]
        }
    }

    return lowestNumber
}

