//parent class
open class Shape{
    open fun  draw(){
        println("drawing")
    }
}

//child class

class Rectangle:Shape(){
    override fun draw(){
        println("Draw a rectangle")
    }
}

class Square:Shape(){
    override fun draw(){
        println("Draw a square")
    }
}

fun main(){
    var r=Rectangle()
    r.draw()
    var s=Square()
    s.draw()

}