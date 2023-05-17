import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter num1")
    var num1=read.nextFloat()
    println(num1)

    println("Enter num2")
    var num2=read.nextFloat()
    println(num2)



    println("Enter myoperator")
    var myoperator= readln()


    var result= when (myoperator){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2

        else->{
            println("Invalid")}}

    println("num is $result")









}