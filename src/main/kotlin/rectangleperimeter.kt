import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter length")
    var length=read.nextInt()
    println(length)

    println("Enter Width")
    var width=read.nextInt()
    println(width)

    var perimeter=(length*2)+(width*2)
    println(perimeter)




}