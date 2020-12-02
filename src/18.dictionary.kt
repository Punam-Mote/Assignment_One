package assignment1

fun main(){
    val words=arrayOf("amplify","phantom","information","basic","illumination")
    val meanings=arrayOf("increase the volume of (sound), especially using an amplifier.",
            "a figment of the imagination.",
            "facts provided or learned about something or someone.",
            "forming an essential foundation or starting point; fundamental.",
            "lighting or light. The art of illuminating a manuscript."
            )
    val dictionaryMap= mapOf<String,String>("amplify" to "increase the volume of (sound), especially using an amplifier.",
            "phantom" to "a figment of the imagination.",
            "information" to "facts provided or learned about something or someone.",
            "basic" to "forming an essential foundation or starting point; fundamental.",
            "illumination" to "lighting or light. The art of illuminating a manuscript.")

    print("Enter a word For Meaning: ")
    val word= readLine()!!
    println("$word meaning is : ${dictionaryMap[word]}")
}