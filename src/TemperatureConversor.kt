fun main() {

    var c: Int
    do {
        println("Escolha uma opção:")
        println("1. Converter Celsius para Fahrenheit")
        println("2. Converter Fahrenheit para Celsius")
        println("3. Sair")
        c = readln().toInt()

        when (c) {
            1 -> {
                val temp = getTemperature()
                println("A temperatura em Fahrenheit é ${celsiusToFahrenheit(temp)}")
            }
            2 -> {
                val temp = getTemperature()
                println("A temperatura em Celsius é ${fahrenheitToCelsius(temp)}")
            }
            3 -> println("Saindo...")
            else -> println("Opção inválida!")
        }
    } while (c != 3)

}

private fun getTemperature(): Double {
    print("Digite uma temperatura: ")
    return readln().toDouble()
}

private fun celsiusToFahrenheit(temperature: Double): Double {
    return (temperature * 9/5) + 32
}

private fun fahrenheitToCelsius(temperature: Double): Double {
    return (temperature - 32 ) * 5/9
}