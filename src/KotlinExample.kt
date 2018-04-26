package hello

import java.util.*

fun main(args: Array<String>) {
    var a: Int? = null

    if (a != null) {
        println(a)
    } else {
        println(" a is null ")
    }

    println(getEvenAndOddNumbers(List(100, {i -> i + 1})))
}

class MathList(val min: Int, val max: Int, val sum: Int)

fun maxNumber(numbers: List<Int>): MathList {
    var max = numbers.first()
    var min = numbers.first()
    var sum = 0
    for (number in numbers) {
        if (number > max) {
            max = number
        }
        else if (min > number) {
            min = number
        }
        sum += number
    }
    return MathList(min, max, sum)
}

fun getEvenAndOddNumbers(numbers: List<Int>): Pair<List<Int>, List<Int>> {
    var evenNumbers: MutableList<Int> = mutableListOf()
    var oddNumbers: MutableList<Int> = mutableListOf()
    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        } else {
            oddNumbers.add(number)
        }
    }
    return Pair(evenNumbers, oddNumbers)
}