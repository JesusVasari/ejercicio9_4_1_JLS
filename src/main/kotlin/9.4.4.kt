fun main() {

    fun solucion(s: String): Int {

        if (s.isEmpty()) return 1
        if (s.length % 2 != 0) return 0

        val cadena = mutableListOf<String>()
        for (i in s.indices) {
            val cadena_string = s[i].toString()
            if (cadena_string == "{" || cadena_string == "[" || cadena_string == "(") {
                cadena.add(cadena_string)
            } else {
                if (cadena.isEmpty()) return 0
                val s_pop = cadena.remove()
                if (s_pop == "{") {
                    if (cadena_string != "}") return 0
                } else if (s_pop == "[") {
                    if (cadena_string != "]") return 0
                } else if (s_pop == "(") {
                    if (cadena_string != ")") return 0
                }
            }
        } if (!cadena.isEmpty()) return 0 return 1
    }

    fun MutableList<String>.push(str: String) {
        this.add(str)
    }

    fun MutableList<String>.pop(): String {
        val result = this.last() this.removeAt(this.size - 1) return result
    }
}

