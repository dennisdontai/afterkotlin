import java.util.Scanner
fun main() {
    var read = Scanner(System.`in`)

    println("Enter A")
    var A= read.nextInt()
    println(A)

    println("Enter B")
    var B= read.nextInt()
    println(B)

    println("Enter H")
    var H= read.nextInt()
    println(H)

    var area=0.5*(A+B)*(H)
    println(area)

}
