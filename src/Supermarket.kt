fun main() {
    val saldo = 100.00
    var quantItens = 0
    var totalCompra = 0.0

    do {
        print("Digite o Valor do Produto: ")
        val preco = readln().toDouble()
        if ( (preco + totalCompra) > saldo) {
            println("Saldo Insuficiente")
        } else if (preco == 0.00) {
            break
        } else {
            totalCompra += preco
            quantItens ++
            println("Compra Confirmada, Gasto Atual $totalCompra")
        }

    } while (totalCompra < saldo)

    println("Total Gasto: $totalCompra")
    println("Quantidade de Itens Comprados: $quantItens")
    println("Troco: ${saldo - totalCompra}")
}