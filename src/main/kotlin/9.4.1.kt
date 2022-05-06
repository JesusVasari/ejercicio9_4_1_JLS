fun main() {


    val num: Int = 19
    val binario = Integer.toBinaryString(num)
        .replace(Regex("0+$"), "")

    val ceros = binario.split(Regex("1+"))

    val longitudCeros = ceros.map(String::length)
        .filter { it > 0 }

   println(longitudCeros.maxOrNull())
}

