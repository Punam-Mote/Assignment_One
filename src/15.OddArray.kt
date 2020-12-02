package assignment1

fun main(){
    val arr = IntArray(5)

    for (i in arr.indices) {
        print("Enter the Element")
        arr[i] = readLine()!!.toInt()
    }
    OddNum(arr)
}

fun OddNum(arr: IntArray) {
    println("Odd numbers are :")
    for (i in arr.indices) {
        if (arr[i] % 2 !== 0)
            println(arr[i])
    }

}