fun main() {

    fun solucion(string: String): Int {

        if (string.isEmpty()) {
            return 1
        }
        if (string.length % 2 != 0) return 0

        /**
         * se crea una lista mutable
         */
        val cadena = mutableListOf<String>()
        for (i in string.indices) {
            val cadena_string = string[i].toString()
            if (cadena_string == "{" || cadena_string == "[" || cadena_string == "(") {
                cadena.add(cadena_string)  //añade  [, (  { a la lista de cadena
            } else {
                if (cadena.isEmpty()) return 0
                val cadena_pop = cadena.removeLast()
                if (cadena_pop == "{") {
                    if (cadena_string != "}") return 0
                } else if (cadena_pop == "[") {
                    if (cadena_string != "]") return 0
                } else if (cadena_pop == "(") {
                    if (cadena_string != ")") return 0
                }
            }
        }
        if(!cadena.isEmpty()) return 0

        return 1

    }




}



