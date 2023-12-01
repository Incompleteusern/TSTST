package compile

import java.util.TreeSet

var nextReg: Int = 0
    get() = field++


class RegVector: HashMap<Int, Int>() {

    override fun toString(): String {
        val sortedKeys = TreeSet(keys)

        val s = StringBuilder("(")

        var o = 0

        TreeSet(keys).forEach {
            val k = it - o

            s.append("0, ".repeat(k))
            s.append(get(it))
            s.append(", ")

            o = it
        }

        s.setLength(s.length - 2)
        s.append(")")

        return s.toString()
    }
}

