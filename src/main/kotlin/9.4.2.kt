
fun main (){


fun solution(array: IntArray): Int {
    if (array.size == 1) {
        return array[0]
    }

    array.sort()

    for (i in 0..array.size step 2) {
        if (i == array.size - 1) {
            return array[i]
        }

        if (array[i] != array[i + 1]) {
            return array[i]
        }
    }

    return -1
}


}