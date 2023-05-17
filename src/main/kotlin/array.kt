fun main(){
    var language= arrayOf("Python","Javascript","Kotlin")
    language[2]="C++"

    println(language[2])

    var l=language.plus("Laravel")

    for (x in l ){
        println(x)
    }


        println(language.size)
    println(l.size)

}






