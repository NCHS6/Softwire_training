package com.example.fizzbuzz
import androidx.core.util.rangeTo
import java.util.Scanner

fun main() { //change to commit


    val scanner = Scanner(System.`in`)
    var max : Int = 0

    while (max <= 0) {
        print("Enter max number: ")
        val maxStr: String = scanner.nextLine()
        try {
            max = maxStr.toInt()
            if (max < 1) {
                throw Exception("Negative Number")
            }
        } catch(e: Exception) {
            println(e)
            println("Please enter valid numerical values")
        }
    }



    print("Enter rule numbers separated with a space: ")
    val rules = scanner.nextLine().split(' ')

    (1..max).forEach {  num ->
        //var outArr = emptyArray<String>().toMutableList()
        val outArr = ArrayList<String>()
        if (num % 3 == 0 && "3" in rules) {
            outArr.add("Fizz")
        }
        if (num % 5 == 0 && "5" in rules) {
            outArr.add("Buzz")
        }
        if (num % 7 == 0 && "7" in rules) {
            outArr.add("Bang")
        }
        if (num % 11 == 0 && "11" in rules) {
            outArr.clear()
            outArr.add("Bong")
        }
        if (num % 13 == 0 && "13" in rules) {
            if (outArr.size == 0) {
                outArr.add("Fezz")
            } else {
                for (index in outArr.indices) {
                    if (outArr[index][0] == 'B') {
                        outArr.add(index, "Fezz")
                    } else if (index == outArr.lastIndex) {
                        outArr.add("Fezz")
                    }
                }
            }
        }

        if (num % 17 == 0 && "17" in rules) {
            outArr.reverse()
        }

        val outString : String

        if (outArr.size == 0) {
            outString = num.toString()
        } else {
            outString = outArr.joinToString(separator = "")
        }

        println(outString)
    }




}
