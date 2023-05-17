import java.util.Scanner
fun main() {
    var reader = Scanner(System.`in`)

    println("Enter Number")
    var number=reader.nextDouble()
    println(number)

    if (number<0){
        println("Number is Negative")
    }

    else if (number>0){
        println("Number is Positive")
        }
    else{
        println("Number is Neutral")
    }
}


