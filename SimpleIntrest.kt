import java.util.Scanner
fun main() {
    val inp=Scanner(System.`in`)
    print("Enter Principal: ")
    var principal:Double=inp.nextDouble()
    print("Enter Rate: ")
    var rate:Double=inp.nextDouble()
    print("Enter Time(in months): ")
    var time:Int=inp.nextInt()
    println("Simple Intrest: "+(principal*rate*time)/100)
}
