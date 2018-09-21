package no.runsoft.problems

fun main(args: Array<String>) {
    var sum = 0
    var a = 1
    var b = 0
    var c = 0
    while(c < 4000000){
        c = b + a
        b = a
        a = c
        if(c % 2 == 0){
            sum += c
        }
    }
    println(sum)
}
