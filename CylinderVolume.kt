import java.util.Scanner
fun main(args: Array<String>) {
    val inp=Scanner(System.`in`)
    print("Enter the Radius: ")
    var radius:Double=inp.nextDouble()
    print("Enter the Height: ")
    var height:Double=inp.nextDouble()
    println("Volume of Cylinder with radius $radius and height $height is ${(22.00/7.00)*radius*radius*height}")
}
