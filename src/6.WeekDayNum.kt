package assignment1

fun main(){
    print("Enter the number to find the day :")
    val num:Int= readLine()!!.toInt()

    when(num){
        1 ->
            print("Sunday")
        2 ->
            print("Monday")
        3 ->
            print("Tuesday")
        4 ->
            print("Wednesday")
        5 ->
            print("Thursday")
        6 ->
            print("Friday")
        7 ->
            print("Saturday")
    }

}