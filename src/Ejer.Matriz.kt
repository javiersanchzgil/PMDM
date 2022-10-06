

fun main (){

    val string:String = "9 8 7\n5 3 2\n6 6 7\n"
    val array = ArrayList<ArrayList<Char>>()
    val char = '\n'
    var fila = 0
    var col = 0
    var i = 0


    string.forEach {
        if (it == char)
            array.add(ArrayList())
    }

    string.forEach {
        if(!it.isWhitespace())
            array[fila].add(it)
        col++

        if (it == char){
            fila++
            col = 0
        }
    }

    array.forEach{
        println(array[i])
        i++
    }


}

fun imprimir (array: ArrayList<Any>){



}