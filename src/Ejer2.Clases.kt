import kotlin.random.Random

fun main() {
    val dado1 = Dado2()
    val dado2 = Dado2(1,3)
    val dado3 = Dado2(4,6)

    var MAX = 100
    var cont = 0
    var i = 0
    val jugadores = mutableListOf<Jugador2>()


    repeat(MAX) {
        cont = 0
        repeat(MAX) {
            println("El dado1 ha obtenido un en tiradaUnica ${dado1.tiradaUnica()}")
            cont = cont + dado1.tiradaUnica()
            println("El dado1 ha obtenido un en tiradaDoble ${dado1.tiradaDoble()}")
            cont = cont + dado1.tiradaDoble()
            println("El dado2 ha obtenido un en tiradaUnica ${dado2.tiradaUnica()}")
            cont = cont + dado2.tiradaUnica()
            println("El dado2 ha obtenido un en tiradaDoble ${dado2.tiradaDoble()}")
            cont = cont + dado2.tiradaDoble()
            println("El dado3 ha obtenido un en tiradaUnica ${dado3.tiradaUnica()}")
            cont = cont + dado3.tiradaUnica()
            println("El dado3 ha obtenido un en tiradaDoble ${dado3.tiradaDoble()}")
            cont = cont + dado3.tiradaDoble()

        }
        jugadores.add(Jugador2("Jugador$i",cont))
        i++
    }

    println(jugadores.toString())

    fun mostrarResultado(jugadores : List<Jugador2>): String {

        val jugadoresOrdenados = jugadores.sortedByDescending { it.puntos }

        return jugadoresOrdenados.toString()
    }

    println(mostrarResultado(jugadores))


}

class Jugador2  {
    var nombre = ""
    var puntos = 0

    constructor(nombre:String, puntos:Int){
        this.nombre = nombre
        this.puntos = puntos
    }

    override fun toString(): String {
        return "Jugador(nombre='$nombre', puntos=$puntos)"
    }



}

class Dado2 {
    private var numMin = 1
    private var numMax = 6

    constructor()

    constructor(numMin:Int, numMax:Int){
        this.numMin = numMin
        this.numMax = numMax


    }


    fun darValores(valMin: Int, valMax: Int) {
        if (valMin <= valMax) {
            numMax = valMax
            numMin = valMin
        } else {
            println("Se han cambiado los valores min y maximo")
            numMax = valMin
            numMin = valMax
        }
    }

    fun tiradaUnica (): Int {
        return Random.nextInt(numMin, numMax)
    }

    fun tiradaDoble (): Int {
        val num1 = Random.nextInt(numMin, numMax)
        println("num1 = $num1")
        val num2 = Random.nextInt(numMin, numMax)
        println("num2 = $num2")
        return if (num1 == num2) num1 * num2 else num1 + num2
    }
}

