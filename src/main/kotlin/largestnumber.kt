import java.util.Scanner
fun main() {
    var reader = Scanner(System.`in`)

    println("num1")
    var num1 = reader.nextDouble()
    println(num1)

    println("num2")
    var num2 = reader.nextDouble()
    println(num2)

    println("num3")
    var num3 = reader.nextDouble()
    println(num3)

    if (num1>num2 && num1>num3){
        println("$num1 is largest")
        }
    else if (num2>num1&& num2>num3){
        println("$num2 is largest")
    }

    else{
        println("$num3 is largest")
    }


}









