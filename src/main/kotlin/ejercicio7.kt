import java.util.*

fun main() {

    val numerosRandom = Random()
    val longitud = (1..10).map { numerosRandom.nextInt() }
    println(longitud)
}