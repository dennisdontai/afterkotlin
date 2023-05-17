class Person{
    //Properties/Variables/Data members/Attributes

    var name:String="Marshal"
    var age:Int=21
    var location:String="Nairobi"
    var height:Double=7.0

    //Methods/Functions
    fun eat(){
        println("Eating")
        fun walk(){
            println("Walking")
        }
    }




}
fun main(){
    var teacher=Person()
    teacher.eat()

    println(teacher.name)


    println(teacher.name+" "+teacher.age+" "+teacher.location+" "+teacher.height)

}
