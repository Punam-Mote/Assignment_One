package assignment1

fun main(){
    val arr = IntArray(5)

    for (i in arr.indices) {
        print("Enter the Element : ")
        arr[i] = readLine()!!.toInt()
    }
    evenSum(arr)
}
fun evenSum(arr: IntArray){
    var sum=0
    for(i in arr.indices)
        if(arr[i]%2==0){
            println("Even numbers are : ${arr[i]}")
            sum = sum + arr[i]

        }

    println(" Sum of Even numbers is : $sum ")

}
