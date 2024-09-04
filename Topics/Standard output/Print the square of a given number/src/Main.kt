// Necessary imports
import java.util.Scanner

fun main(args: Array<String>) {
    // Your code here: Create a Scanner object to read the input
    val scanner = Scanner(System.`in`)

    // Your code here: Read an integer using the Scanner object
    //println("Enter an integer:")
    val n = scanner.nextInt()

    // Your code here: Calculate and print the square of n
    val res = n * n
    println(res)
}
