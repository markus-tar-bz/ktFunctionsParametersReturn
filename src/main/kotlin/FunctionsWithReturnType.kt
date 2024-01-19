fun printPow1(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base //1*(3*3*3*3*3)
    }
    return result
}

fun multiply(a: Int, b: Int) = a * b

fun printFirstItem(list: List<Int>) = println("First item in the list is ${list[0]}")

fun indexOf(list: List<Int>, value: Int): Int { //ideal way for fun with return
    for (i in 0..list.size - 1) {
        if (list[i] == value) {
            return i //executed if condition is met
        }
    }
    return -1 //executed if the condition is not met
}

fun searchIndexOf(list: List<Int>): String {
    println("Search for this number:")
    val value = readLine()?.toInt()
    for (element in list) {
        if (element == value) {
            println("Index of $value is ${list.indexOf(value)}") //println not recommended for fun with return
        }
    }
    return "Value not found!!"
}

fun searchIndexOfv1(list: List<Int>) {
    println("Search for this number v1:")
    val value = readLine()?.toInt()
    if (value in list) { //value !in list
        println("Index of $value is ${list.indexOf(value)}")
        return
    } else println("Value not found!!")
}

