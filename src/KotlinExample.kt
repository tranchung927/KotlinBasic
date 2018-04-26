package hello

import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var a: Int? = null

//    if (a != null) {
//        println(a)
//    } else {
//        println(" a is null ")
//    }

//    println(getEvenAndOddNumbers(List(100, {i -> i + 1})))
//    displayRectangle(5, 7, true)
//    displayTriangle(10)
//    isoscelesTriangle(10, true)
//    removeVowel("chaunogahhhillle")
//    println(checkPrime(1))
    println(mathUCLNBCNN(6, -20))
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

fun displayRectangle(width: Int, height: Int, empty: Boolean) {

    for (i in 1..height) {
        var string = ""
        for (j in 1..width) {
            if (empty) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    string += "* "
                } else {
                    string += "  "
                }
            } else {
                string += "* "
            }
        }
        println(string)
    }
}

fun displayTriangle(height: Int) {
    for (i in 1..height) {
        var string = ""
        for (n in 1..i) {
            string += " "
        }
        for (j in i..(i * 2) - 1) {
            string += "* "
        }
        println(string)
    }
}

fun isoscelesTriangle(height: Int, reverse: Boolean) {
    for (i in 1..height) {
        var string = ""
        if (reverse) {
            for (n in 1..i) {
                string += "-"
            }
            for (j in i..(height * 2) - i) {
                string += "*"
            }
            for (k in 1..i) {
                string += "-"
            }
        } else {
            for (n in i..height) {
                string += "-"
            }
            for (j in 1..(i * 2) - 1) {
                string += "*"
            }
            for (k in i..height) {
                string += "-"
            }
        }
        println(string)
    }
}

fun removeVowel(string: String) {
    var listChars: MutableList<Char> = string.toMutableList()
    var copy = string
    for (char in string) {
        if (listOf('u', 'e', 'o', 'a', 'i').contains(char)) {
            copy = copy.replace(char.toString(), "")
        }
    }
    println(copy)
}

fun checkPrime(number: Int): Boolean {
    var isPrime: Boolean = false
    if (number > 2) {
        if (number % 2 == 0) {
            isPrime = false
        } else {
            for (i in 3..sqrt(number.toDouble()).toInt() step 2) {
                isPrime = number % i != 0
                if (!isPrime) break
            }
        }
    } else {
        isPrime = number == 2
    }
    return isPrime
}

fun mathUCLNBCNN(a: Int, b: Int): Pair<Int, Int> {
    var _a = abs(a)
    var _b = abs(b)
    if (_a == 0 || _b == 0) return Pair((a + b), 0)
    while (_a != _b) {
        if (_a > _b) _a = _a - _b else _b = _b - _a
    }
    return  Pair(_a, a*b/_a)
}