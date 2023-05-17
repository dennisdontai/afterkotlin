import java.awt.PageAttributes.PrintQualityType
fun main(){
    var text="Hello World"
    var firstname="Marshal"
    var lastname="Methers"

    println(text.uppercase())
    println(text.lowercase())
    println(text[0])

    println(text.indexOf("World"))



    println(firstname + lastname)
    //OR
    println(firstname.plus(lastname))//Concatenation

    println("Hello there, my name is $firstname")//String
}


