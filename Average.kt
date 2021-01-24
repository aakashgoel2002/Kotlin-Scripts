import java.util.Scanner
fun main(){
val inp= Scanner(System.`in`)
println("Enter 3 Numbers: ")
var number:Int=inp.nextInt()
var number1:Int=inp.nextInt()
var number2:Int=inp.nextInt()
var average=(number+number1+number2)/3
println("Average of $number, $number1 & $number2 is $average")
}
