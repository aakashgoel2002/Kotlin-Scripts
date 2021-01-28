
import java.util.Scanner
fun main(args: Array<String>){
    val inp=Scanner(System.`in`)
    print("Enter a Number with Multiple Digits")
    val number:Int=inp.nextInt()
    var no=number
    var n=0
    var rev=0
    while(no!=0){
    n=no%10
    no/=10
    rev=rev*10+n
    }
    println("Reverse of $number is $rev")
}
