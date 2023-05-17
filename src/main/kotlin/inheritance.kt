//super class/base class
open  class animal{

    var age=13
    var gender="Male"

    fun isMammal(){
        println("Animal is a mammal")
    }
}
//childclasses/sub classes/derived classes
class duck:animal(){

    var color="White"
    fun swim(){
        println("swimming")
    }

}
class fish:animal(){
    var canEat=true
    fun swim(){
        println("swimming")
    }
}

class horse:animal(){
    var isWild=true
    fun run(){
        println("running")

    }
}

fun main(){
    var d=duck()



    println(d.swim())
    var f=fish()

    var h=horse()
}