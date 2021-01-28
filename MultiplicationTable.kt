import java.util.Scanner
fun main(args: Array<String>){
    val inp=Scanner(System.`in`)
    print("Enter a Number to print its table: ")
    val number:Int=inp.nextInt()
    for(i in 1..10){
    println("$number * $i = ${number*i}")
    }
}
