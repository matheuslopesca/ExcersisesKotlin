fun main() {

    print("Enter your name:")
    val name = readln()
    print("Enter your age:")
    val age: Int = readln().toInt()

    if (age < 18) {
        println("Hello $name! You are underaged")
    } else if (age >= 60) {
        println("Hello $name! You are retired")
    } else {
        println("Hello $name! You are a grow up")
    }

}