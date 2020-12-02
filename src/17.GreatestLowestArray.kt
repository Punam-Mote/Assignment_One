package assignment1


fun main(){
    val arr =IntArray(5)

    for (i in arr.indices) {
        print("Enter the Numbers :")
        arr[i] = readLine()!!.toInt()

    }
    var greatest: Int = arr[0]
    var lowest: Int=arr[0]

    for (i in arr.indices){

        if (lowest > arr[i]) {
            lowest = arr[i]

        }
        if (greatest < arr[i]) {
            greatest = arr[i]

        }

    }
    println("lowest : $lowest")
    println("greatest: $greatest")


}