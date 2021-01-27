import java.util.Scanner
import kotlin.math.*
fun main(args: Array<String>){
    val inp=Scanner(System.`in`)
    print("Enter the Number to be checked: ")
    var number:Double=inp.nextDouble()
    print("$number ")
    number=sqrt(number)
    var i:Double=floor(number)
    if(i==number)
    println("is Perfect Square")
    else
    println("is not Perfect Square")
    }
