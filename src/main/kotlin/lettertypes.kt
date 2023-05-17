import java.util.Scanner
fun main(){
    var read=Scanner(System.`in`)
    println("Enter Letter")
    var Letter= readln()

    var vowels = listOf("a", "e", "i", "o", "u")

    var consonant = listOf("b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z")



    if (Letter in vowels) {
        println("The entered letter '$Letter' is a vowel.")
    }
    else {
        println("The entered letter '$Letter' is a consonant.")
    }

}