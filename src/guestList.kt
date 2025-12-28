fun main() {

    val guestList = mutableListOf<String>()

    for (i in 1..3){
        readGuest(guestList)
    }

    println(guestList.reversed().toString())
}

private fun readGuest (list: MutableList<String>) {
    println("Digite o nome do convidado:")
    list.add(readln())
}