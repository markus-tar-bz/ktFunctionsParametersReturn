fun main() {
    printPow(3, 5)
    printPow(5, 2)

    sumn(5)

    printPow1(3,5)

    val pow = printPow1(3, 5)
    println("3 to the power of 5 is $pow")

    println(multiply(3,5))

    printFirstItem(listOf(9,1,8,2,5))

    val list = listOf(3, 2, 5, 1, 5, 6, 7)
    println("The list looks like the following: $list")
    println("Search for this number (fun IndexOf):")
    val input = readLine()?.toInt()
    if (input != null) {
        println("The index of $input is ${indexOf(list, input)}")
    }

    searchIndexOf(listOf(3, 2, 5, 1, 5, 6, 7)) //not optimal

    searchIndexOfv1(listOf(3, 2, 5, 1, 5, 6, 7))
}

fun printPow(base: Int, exponent: Int) { //specify type after parenthesis if fun has return type
    var result = 1
    for(i in 1..exponent) {
        result *= base //1*(3*3*3*3*3)
    }
    println("$base to the power of $exponent is $result")
}

fun sumn(num:Int) {
    var result = 0
    for (i in 1..num){
        result += i //0+(1+2+3+4+5)
    }
    println("Sum of all numbers from 1 to $num is $result")
}