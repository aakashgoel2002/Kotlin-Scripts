import java.util.Scanner
fun main(){
val inp= Scanner(System.`in`)
println("Enter 1 for 'Celcius to Farenheit' Conversion")
println("Enter 2 for 'Farenheit to Celcius' Conversion")
val choice:Int=inp.nextInt()
if(choice==1){
print("Enter the Temperature: ")
val temperature:Double=inp.nextDouble()
val converted:Double=(temperature* 9/5)+32
println("$temperature°C temperature converted to Farenheit is $converted°F")
}
else if(choice==2){
print("Enter the Temperature: ")
val temperature:Double=inp.nextDouble()
val converted:Double=(temperature- 32)*5/9
println("$temperature°F temperature converted to Celcius is $converted°C")
}
else
println("Wrong Input!")
}
