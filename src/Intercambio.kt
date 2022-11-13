
fun main () {


    var dado = (1..6).random()*10
    var personajes = mutableListOf<Personaje3>()
    var i :Int = 0
    var pos = 0
    val articulos = arrayListOf<articulo>(articulo(7,50),articulo(6,30),articulo(4,70),articulo(8,70),articulo(6,40))
    val listRatio = mutableListOf<Int>()
    val mochila1 = mutableListOf<articulo>()
    val nombres = arrayListOf<String>("Javier","Carlos","Juan")
    val estado = arrayListOf<String>("Anciano","Adulto","Joven")
    val clases = arrayListOf<String>("Mago","Ladron","Guerrero","Berserker","Ladron")
    val razas = arrayListOf<String>("Elfo", "Humano","Enano","Goblin")


    do {
        i = 0
        dado = (1..6).random()*10
        var per= Personaje3(nombres.random(),estado.random(),clases.random(),razas.random(),dado)
        personajes.add(per)
        println("Desea añadir mas jugadores?")
        val resp = readln()
    }while (!resp.equals("no"))

    personajes.add(Personaje3(nombres.random(),estado.random(),"Mercader",razas.random(),0))


    println("aaaaaaaaaaaaaaaaaaaaaaaa")

    personajes.forEach() {
        if (it.clase != "Mercader") {
            var peso = 0
            var bo = true
            i = 0
            pos = 0
            var ratio = 0



            articulos.forEach() {
                ratio = it.vi / it.wi
                listRatio.add(ratio)
            }

            var max = listRatio[0]

            listRatio.forEach() {
                i++
                if (it > max) {
                    pos = i - 1
                }
            }
            mochila1.add(articulos[pos])

            listRatio.removeAt(pos)
            articulos.removeAt(pos)

            do {

                peso = 0
                max = listRatio[0]
                pos = 0
                i = 0
                listRatio.forEach() {
                    i++
                    if (it > max || it == max) {
                        pos = i - 1
                    }
                }

                mochila1.forEach() {
                    peso = peso + it.wi
                }
                var tam = it.tamMochila
                if (peso + articulos[pos].wi <= tam) {
                    mochila1.add(articulos[pos])
                    listRatio.removeAt(pos)
                    articulos.removeAt(pos)
                } else
                    bo = false
            } while (bo)

        it.mochila = mochila1 as ArrayList<articulo>


        }
    }
    personajes.forEach(){
        println(it.toString())
    }


    var elegir = personajes.size-1
    var art = personajes[0].mochila.size

    println("¿Qué jugador quieres que venda al mercader? Pulse un numero del 1 al " + elegir)
    val resp = readln().toInt()
    println("¿Que articulos quieres vender?" + personajes[resp-1].mochila)
    println("Pulse un numero del 1 al " + art)
    personajes[personajes.size-1].mochila.add(personajes[resp-1].mochila[art-1])
    personajes[resp-1].mochila[art-1]






}




class Personaje3{
    var nombre: String = ""
    var estado: String = ""
    var clase : String = ""
    var raza : String = ""
    var mochila = arrayListOf<articulo>()
    var tamMochila : Int = 0
    var monedero = mutableMapOf<Int,Int>(100 to 0, 25 to 0, 10 to 0, 5 to 0, 1 to 0)

    constructor(nombre: String, estado: String, clase : String, raza: String,  tamMochila : Int) {
        this.nombre = nombre
        this.estado = estado
        this.clase = clase
        this.raza = raza
        this.tamMochila = tamMochila

    }

    override fun toString(): String {
        return "Personaje3(nombre='$nombre', estado='$estado', clase='$clase', raza='$raza', mochila='$mochila' , tamMochila=$tamMochila, monedero=$monedero)"
    }





}

