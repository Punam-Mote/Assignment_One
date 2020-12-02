package assignment1

fun main(){
    print("Enter the number")
    val num: Int= readLine()!!.toInt()

    if (num > 0)
        print("$num is positive number")
    if (num < 0)
        print("$num is negative number")
    if (num == 0)
        print("$num is equals to Zero")
}