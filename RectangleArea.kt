import java.util.Scanner
fun main(){
    val inp=Scanner(System.`in`)
    print("Enter Length: ")
    var length:Int=inp.nextInt()
    print("Enter Breadth: ")
    var breadth:Int=inp.nextInt()
    println("Area of Rectangle: "+(length*breadth))
}
