import kotlin.random.Random

fun main() {

    val listaJugadores = mutableListOf<Jugador>()
    var numJugadores = 9
    var i = 0
    val dado = Dado()

    do {
        listaJugadores.add(Jugador("jugador$i",0,0,0))
        i++
    }while (i <= numJugadores)


    pelea(listaJugadores,dado)



}

fun pelea (lista: MutableList<Jugador>, dado:Dado){



    var ran1 = (1..lista.size).random()
    var ran2 = (1..lista.size).random()

    while (ran2 == ran1) {
        var ran2 = (1..lista.size).random()
    }

    lista[ran1].puntuacion = dado.tiradaDoble()
    lista[ran2].puntuacion = dado.tiradaDoble()

    while (lista[ran1].puntuacion == lista[ran2].puntuacion){
        lista[ran1].puntuacion = dado.tiradaDoble()
        lista[ran2].puntuacion = dado.tiradaDoble()
        System.out.println("El jugador$ran1 y el jugador$ran2 han sacado la misma puntuación "+ lista[ran1].puntuacion+ ", tiran otra vez")
    }

    if (lista[ran1].puntuacion > lista[ran2].puntuacion) {
        lista[ran1].kill++
        lista[ran2].death++
        System.out.println("El jugador$ran1 ha sacado un "+ lista[ran1].puntuacion)
        System.out.println("El jugador$ran2 ha sacado un "+ lista[ran2].puntuacion)
        System.out.println("El jugador$ran1 ha ganado")
    }
    else
        if (lista[ran1].puntuacion < lista[ran2].puntuacion){
            lista[ran2].kill++
            lista[ran1].death++
            System.out.println("El jugador$ran1 ha sacado un "+ lista[ran1].puntuacion)
            System.out.println("El jugador$ran2 ha sacado un "+ lista[ran2].puntuacion)
            System.out.println("El jugador$ran2 ha ganado")
        }

    lista[ran1].puntuacion = 0
    lista[ran2].puntuacion = 0

    System.out.println(lista.toString())

}

class Jugador {

    var nombre: String = ""
    var puntuacion: Int = 0
    var kill = 0
    var death = 0


    constructor(nombre: String, puntuacion: Int, kill: Int, death: Int) {
        this.nombre = nombre
        this.puntuacion = puntuacion
        this.kill = kill
        this.death = death
    }

    override fun toString(): String {
        return "Jugador(nombre='$nombre', puntuacion=$puntuacion, kill=$kill, death=$death)"
    }
}

class Dado {
    private var numMin = 1
    private var numMax = 6

    constructor()
    constructor(numMin:Int,numMax:Int){
        this.numMin = numMin
        this.numMax = numMax
    }

    fun tiradaDoble (): Int {
        val num1 = Random.nextInt(numMin, numMax)
        println("num1 = $num1")
        val num2 = Random.nextInt(numMin, numMax)
        println("num2 = $num2")
        return if (num1 == num2) num1 * num2 else num1 + num2
    }
}