//fasterway
class Dog(var name:String,var breed:String,var color:String,var age:Int,var weight:Int){


    fun speak(name: String){
        println(name)
    }
}

fun main(){
    var Dog1=Dog("Tito","chihuahua","white",5,2)
    var Dog2=Dog("Billy","","",2,5)

    println(Dog2.weight)
    Dog2.speak("Bosko")


}