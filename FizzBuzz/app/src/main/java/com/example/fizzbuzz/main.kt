package com.example.fizzbuzz
import java.util.Scanner

fun main() { //change to commit
    print("Enter a number: ")
    val scanner = Scanner(System.`in`)
    val num:Int = scanner.nextLine().toInt()
    print("Enter rule numbers: ")
    val rules = scanner.nextLine().split(' ')

    var out_string: String = ""
    if (num % 3 == 0 && "3" in rules) {
        out_string += "Fizz"
    }
    if (num % 5 == 0 && "5" in rules) {
        out_string += "Buzz"
    }
    if (num % 7 == 0 && "7" in rules) {
        out_string += "Bang"
    }
    if (num % 11 == 0 && "11" in rules) {
        out_string = "Bong"
    }
    if (num % 13 == 0 && "13" in rules) {
        val b_index:Int = out_string.indexOf('B')
        if (b_index == -1) {
            out_string += "Fezz"
        } else {
            out_string = out_string.subSequence(0,b_index).toString() + "Fezz" + out_string.substring(b_index)
        }

    }
    if (num % 17 == 0 && "17" in rules) {
        val reversed = out_string.chunked(4).reversed()
        out_string = reversed.joinToString(separator = "")
    }

    if (out_string == "") {
        out_string = num.toString()
    }

    print(out_string)



}
