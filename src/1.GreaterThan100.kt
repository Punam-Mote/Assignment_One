package assignment1

fun main(){
    print("Enter the whole number")
    val num: Int = readLine()!!.toInt()

    if (num > 100)
        print("$num is Greater than 100")
    else
        print("$num is not greater than 100")
}