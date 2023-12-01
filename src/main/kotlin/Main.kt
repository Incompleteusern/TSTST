import compile.RegVector
import compile.nextReg

fun main(args: Array<String>) {
    var N: Int = nextReg

    val s = RegVector()
    s[3] = 5
    s[5] = 13

    println(s)
}