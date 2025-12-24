fun main() {

    var c: String
    do {
        val computer = (1 .. 3).random()
        print("Escolha um dos Valores: 1 (Pedra), 2 (Papel) ou 3 (Tesoura): ")
        val choice = readln().trim().toInt()
        //computer = Random.nextInt(1,3)

        println("Computer: $computer, Escolha: $choice")

        if (choice == computer) {
            println("Empate")
        } else if (choice == 1 && computer == 3) {
            println("Voce Venceu")
        } else if (choice == 3 && computer == 2) {
            println("Voce Venceu")
        } else if (choice == 2 && computer == 1) {
            println("Voce Venceu")
        } else {
            println("Voce Perdeu")
        }

        print("Quer Jogar Novamente: S / N: ")
        c = readln()
    } while ( c.uppercase() != "N")

}


/*
*  1|2 > 2
*  1|3 > 1
*  3|2 > 3
*
* */