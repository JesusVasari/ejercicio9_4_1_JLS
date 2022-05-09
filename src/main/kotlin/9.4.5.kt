/**
 * @author jesus
 */

fun main(){

    fun solucion(array: IntArray):Int{

        /**
         * se comprueba el tamaño de la array está vacío
         */

        if(array.isEmpty()){
            return 0
        }
        /**
         * se ordena la array
         */
        array.sort()
        /**
         * se crea un contador que llamo  <<a>>
         */
        var a = 1

        /**
         * se comprueba el primer elemento dentro de la array
         */
        var comprueba = array[0]
        for (i in array.indices)
            if(comprueba !=array[i]){
                a ++
                comprueba = array[i]
        }
        return a
    }


}