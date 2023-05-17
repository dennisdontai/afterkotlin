import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter num1")
    var num1=read.nextFloat()
    println(num1)

    println("Enter num2")
    var num2=read.nextFloat()
    println(num2)

    println("quotient")
    var quotient=num1/num2
    println(quotient)

    println("remainder")
    var remainder=num1%num2
    println(remainder)


}