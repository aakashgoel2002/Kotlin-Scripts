import java.util.Scanner
fun main(args: Array<String>){
    val inp=Scanner(System.`in`)
    print("Enter the Number of which the table is to be Printed: ")
    val number:Int=inp.nextInt()
    for(i in 1..10){
    println("$number * $i = ${number*i}")
    }
}
