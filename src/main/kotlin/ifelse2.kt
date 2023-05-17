import java.util.Scanner
fun main() {
    var reader = Scanner(System.`in`)

    println("Enter Temperature")
    var temperature=reader.nextFloat()

    if (temperature<37){
        println("It is too cold")
    }
    else if(temperature>37){
        println("It is too hot")

    }

    else{
        println("Normal Temperature")
    }


}
