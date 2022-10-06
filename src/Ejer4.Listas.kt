

fun main () {

    var frase = ""
    var suma = 0.0


    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")

    lista.forEach(){
        when(it){
            is String -> frase = frase + it
            is Double -> suma = suma + it
            is Int -> suma = suma + it.toDouble()
        }
    }

    println("La lista es : $lista")
    println("La frase es : $frase")
    println("La suma es $suma")



}