package chap02.section3

fun main() {
    var str1: String?="Hello Kotlin"
    str1="Hi!"
    println("str1: $str1 lenth: ${str1?.length ?: -1}")
}