import java.util.Scanner
fun main(args: Array<String>){
    val inp=Scanner(System.`in`)
    print("Enter the Number to be checked: ")
    val number:Int=inp.nextInt()
    var no=number;var n=0;var sum=0
    while(no!=0){
    n=no%10
    sum+=(n*n*n)
    no/=10
    }
    if(sum==number)
    println("$number is Armstrong")
    else
    println("$number is not Armstrong")
    }
