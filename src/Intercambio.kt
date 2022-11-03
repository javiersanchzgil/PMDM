
fun main () {

    var dado = (1..6).random()*10


    val estado = arrayListOf<String>("Anciano","Adulto","Joven")
    val clases = arrayListOf<String>("Mago","Ladrón","Guerrero","Berserker","Ladron","Mercader")
    val razas = arrayListOf<String>("Elfo", "Humano","Enano","Goblin")
    var est : String = estado.random()
    var clase : String = clases.random()
    var raza : String = razas.random()

    var p1 = Personaje3("Javier","Joven","Mercader","Elfo",dado)

    if (p1.clase == "Ladron") {
        var peso = 0
        var bo = true
        val articulos = arrayListOf<articulo>(articulo(2, 50), articulo(5, 30), articulo(1, 70), articulo(3, 70))
        val listRatio = mutableListOf<Int>()
        val mochila = mutableListOf<articulo>()
        var i: Int = 0
        var pos = 0


        articulos.forEach() {
            var ratio = it.vi / it.wi
            listRatio.add(ratio)
        }

        var max = listRatio[0]

        listRatio.forEach() {
            i++
            if (it > max) {
                pos = i - 1
            }
        }
        mochila.add(articulos[pos])

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

            mochila.forEach() {
                peso = peso + it.wi
            }

            if (peso + articulos[pos].wi <= 10) {
                mochila.add(articulos[pos])
                listRatio.removeAt(pos)
                articulos.removeAt(pos)
            } else
                bo = false

        } while (bo)

        println(p1.toString() + "   Robado:" + mochila)


    }
}

class Personaje3{
    var nombre: String = ""
    var estado: String = ""
    var clase : String = ""
    var raza : String = ""
    var mochila : Int = 0

    constructor(nombre: String, estado: String, clase : String, raza: String, mochila : Int) {
        this.nombre = nombre
        this.estado = estado
        this.clase = clase
        this.raza = raza
        this.mochila = mochila
    }

    override fun toString(): String {
        return "Personaje(nombre='$nombre', estado='$estado', clase='$clase', raza='$raza', mochila='$mochila')"
    }

}