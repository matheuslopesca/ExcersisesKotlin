//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    print("Numero 1:")
    val n1 = readln().toDouble()
    print("Operação: ")
    val op = readln()
    print("Numero 2:")
    val n2 = readln().toDouble()

    var rs = 0.0

    when (op) {
        "+" -> rs = (n1 + n2)
        "-" -> rs = (n1 - n2)
        "*" -> rs = (n1 * n2)
        "/" -> if(n2 == 0.0) println("Divisão por Zero") else rs = (n1 / n2)
        "%" -> rs = (n1 % n2)
        else -> println("Operador Invalido")
    }

    println("O Resultado é: $rs")

}