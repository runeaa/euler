package no.runsoft.problems

fun main(args: Array<String>) {
    var sum = 0
    var x = 0
    while (x < 1000){
        if (x % 3 == 0 || x % 5 == 0) {
            sum += x
        }
        x++
    }
    println(sum)
}