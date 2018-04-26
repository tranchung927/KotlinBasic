package hello

import java.util.*

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
    removeVowel("chaunogahhhillle")
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

