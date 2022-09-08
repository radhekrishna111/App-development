fun main(){
    val originalText="302kjasd99234924kjsfad8923u92ksdr90234"
//    val textWithoutSmallDigits = originalText.filter {
//        val isNotDigit = !it.isDigit()
//        val stringRepresentation = it.toString()
//
//        isNotDigit || stringRepresentation.toInt() >= 5
//    }
//    println('8'.isDigit())
//
//    println(textWithoutSmallDigits)


//    fun placeArgument(value: Int, f: (Int, Int) -> Int): (Int) -> Int {
//        return { i -> f(value, i) }
//    }
//    println(placeArgument(6,{a,b->a+b})(5))



    fun Int.opp(f: Int.() -> Int): Int = f()

    fun main() {
        var res = 10.opp { this.times(3) }
        println(res) // 20
        // We can omit this
        res = 10.opp { plus(10) }
        println(res) // 20
        res = 10.opp { this * 2 }
        println(res) // 20
    }
}

