fun main(){
    for (number in 1..3) {
        println(number)
    }

    for (letter in 'a'..'f'){
        if (letter=='c')
            break
        println(letter)
    }
    for (let in 'a'..'f'){
        if (let=='d')
            continue
        println(let)

    }
    for (num in 10..15){
        if (num==13)
            break
        println(num)
    }

    for (num in 10..15){
        if (num==12)
            continue
        println(num)}

}