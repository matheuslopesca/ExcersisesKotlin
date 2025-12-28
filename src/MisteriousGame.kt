import kotlin.random.Random

fun main() {

    val ran: Int = Random.nextInt(1, 101)

    var userInput: Int
    do {
        print("Digite um Numero de 1 a 100: ")
        userInput = readln().toInt()

        if (userInput < ran){
            println("mais")
        } else if (userInput > ran) {
            println("menos")
        }

    } while (userInput != ran)

    println("Voce Acertou")
}

