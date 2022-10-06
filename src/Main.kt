
fun main () {
    println("Hola Mundo")

    var textVariable = "Soy una variable"
    val textConstate = "Esto es una constante"

    var variable = 1
    print(variable)
    print ("\tVariable tomara el valor de $variable")

    variable = 3+2

    variable = variable + 10

    //Kotlin te autodefine el tipo de variable pero tambien puedes forzar a poner tu el tipo de variable que quieres

    var variable1 = 1 // tipo int
    var variable2: Long = 10
    var param1 : Long = 1

    //Para que una varieble pueda ser null
    val variable3: Int? = null

    println("Println es igual que print pero con salto de linea ${variable1.toFloat()} ")

    val constante:Long = 13

    print("El número $constante es mi numero favorito")

    println ("Sin embargo ${constante.toFloat()}... \n no me gusta")

    funReturningString(param1)

    transformarIntEnDouble(variable1)

    //El when es como el switch
    when (variable) {
        0 -> println ("$variable es 0")
        in 1..99 ->("$variable no es 0")
    }

    numEntero(1)


    //Bucles

    var pisos = 10
    var ventanas = 4

    repeat(14){
        print ("_")
    }
    repeat(pisos){
        print ("\n")
        print("|")
        repeat(ventanas){
            print("_▋_")
        }
        print("|")
    }

    repeat(pisos){
        print("/\\")

    }






}

fun funReturningString (param1: Long): String{

    return "Esta funcion devuelve este texto y $param1"
}

fun transformarIntEnDouble (param2 : Int) {
    println("He recibido un ${param2.toDouble()}")
}

fun decirNombre (nombre : String) {
        println("He recibido un $nombre")

    }
fun decirNombreEdad (nombre : String, edad : Int){
            println("He recibido un $nombre y una edad $edad")
}

fun sumarInteger (num1 : Int, num2: Int){
    var num3 = num1 + num2
    println("La suma es ${num3.toDouble()}")
}

fun sumarString (num1 : String, num2 : String){
    num1.toInt()
    num2.toInt()
    var num3 = num1 + num2
    println ("La suma es ${num3.toDouble()}")

}
fun calcularPrecio (edad: Int){
    when {
        edad < 18 -> println ("Juan 5 pavos")
        edad in 18..65 -> println("Paco 10 euros")
        edad > 65 -> println("Yo gratis")
    }
}

fun numEntero (num:Int) {
    if (num > 0)
        println("${num*2+3}")
    else
        if (num < 0)
            println("${num/2-3}")
        else
            if (num == 0)
                println("$num")

}









