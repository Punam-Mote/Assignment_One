package assignment1

fun main(){
    print("Enter the age")
    val age:Int= readLine()!!.toInt()

    when(age){
        in 0..18 ->
            print("Child")
        in 19..59 ->
            print("Young")
        in 60..90 ->
            print("Old")
        else ->
            print("Invalid Input")

    }
}