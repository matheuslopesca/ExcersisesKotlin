fun main() {

    imcResearch(imcCalculator(getWeight(), getHeight()))
}

private fun getWeight() : Double {
    print("Digite seu peso: ")
    return readln().toDouble()
}

private fun getHeight(): Double {
    print("Digite sua altura: ")
    return readln().toDouble()
}

private fun imcCalculator(weight: Double, height: Double) : Double {
    return weight / (height * height)
}

private fun imcResearch (imc : Double) {

    when {
       (imc < 18.5) -> println("Seu IMC é $imc, seu nivel se enquadra em Abaixo do Peso")
       imc in 18.5..24.9 -> println("Seu IMC é $imc, seu nivel se enquadra em Peso Normal")
       imc in 25.0 ..29.9 -> println("Seu IMC é $imc, seu nivel se enquadra em Sobrepeso")
       else -> println("Seu IMC é $imc, seu nivel se enquadra em Obesidade")
    }

}