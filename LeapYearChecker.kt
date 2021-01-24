import java.util.Scanner
fun main(){
val inp= Scanner(System.`in`)
print("Enter a Year: ")
var year:Int=inp.nextInt()
if(year%4==0)
println("$year is a Leap Year")
else
println("$year is not a Leap Year")
}
