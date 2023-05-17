open class figure(){

    fun start(){
        println("start")
    }

}
class cirlce:figure(){
    fun radius(){
        println(10)
    }

}
open class rectangle:figure(){
    fun width(){
        println(12)
    }
    fun height(){
        println(21)
    }
}

class square:rectangle(){}

//fun main(){
    //var c=circle()
   // println(c.area)
    var s=square()
    //println(s.draw)
    var r=rectangle()
    //println(r.perimeter)
//}




