open class shape{
    open fun area(){
        println("OK")
    }
}
class circle:shape(){
    override fun area(){
        print("Cicle area")
    }
}
class triangle:shape(){
    override fun area(){
        println("triangle area")
    }
}
class rectangle2:shape(){
    override fun area(){
        println("rectangle area")
    }
}
fun main(){
    var r=rectangle2()
    r.area()
    var t=triangle()
    t.area()
    var c=circle()
    c.area()

}