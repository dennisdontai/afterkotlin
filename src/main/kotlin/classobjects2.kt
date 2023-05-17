//longway
class Car{
    var make:String="Elon"
    var model:String="Tesla"
    var color:String="Burlywood"
    var drivingspeed:String="190mph"

    fun drive(){
        println("drive")
    }
    fun turn(){
        println("turn")
    }
    fun stop(){
        println("stop")
    }


}

fun main(){
    var car1=Car()
    println(car1.color)
    car1.color
}



