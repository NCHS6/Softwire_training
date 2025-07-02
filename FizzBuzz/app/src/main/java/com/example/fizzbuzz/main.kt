package com.example.fizzbuzz
import java.util.Scanner

fun main() { //change to commit
    print("Enter max number: ")
    val scanner = Scanner(System.`in`)
    val max: Int = scanner.nextLine().toInt()
    print("Enter rule numbers separated with a space: ")
    val rules = scanner.nextLine().split(' ')
    (1..max).forEach {  num ->
        var outString: String = ""
        if (num % 3 == 0 && "3" in rules) {
            outString += "Fizz"
        }
        if (num % 5 == 0 && "5" in rules) {
            outString += "Buzz"
        }
        if (num % 7 == 0 && "7" in rules) {
            outString += "Bang"
        }
        if (num % 11 == 0 && "11" in rules) {
            outString = "Bong"
        }
        if (num % 13 == 0 && "13" in rules) {
            val bIndex:Int = outString.indexOf('B')
            if (bIndex == -1) {
                outString += "Fezz"
            } else {
                outString = outString.subSequence(0,bIndex).toString() + "Fezz" + outString.substring(bIndex)
            }

        }
        if (num % 17 == 0 && "17" in rules) {
            val reversed = outString.chunked(4).reversed()
            outString = reversed.joinToString(separator = "")
        }

        if (outString == "") {
            outString = num.toString()
        }

        print("\n" + outString)
    }




}
