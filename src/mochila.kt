import java.util.Objects

fun main (){

    val W = 10
    var peso = 0
    var bo = true

      personaje("Javier",W,"Ladron")
        val articulos = arrayListOf<articulo>(articulo(3,50),articulo(6,30),articulo(4,70),articulo(3,70))
        val listRatio = mutableListOf<Int>()
        val mochila = mutableListOf<articulo>()
        var i :Int = 0
        var pos = 0


        articulos.forEach(){
           var ratio = it.vi/it.wi
            listRatio.add(ratio)
        }

        var max = listRatio[0]

        listRatio.forEach(){
            i++
            if (it > max){
                pos = i-1
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
            listRatio.forEach(){
                i++
                if (it > max || it == max){
                    pos = i-1
                }
            }

            mochila.forEach(){
                peso = peso + it.wi
            }

            if (peso + articulos[pos].wi <= 10){
                mochila.add(articulos[pos])
                listRatio.removeAt(pos)
                articulos.removeAt(pos)
            }
            else
                bo=false

        }while (bo)

    println("Robado:" + mochila)
}


class personaje  {
    var nombre: String
    var mochila : Int
    var tipo: String

    constructor(nombre: String, mochila: Int, tipo: String) {
        this.nombre = nombre
        this.mochila = mochila
        this.tipo = tipo
    }



    override fun toString(): String {
        return "personaje(nombre='$nombre', mochila=$mochila, tipo='$tipo')"
    }

}

class articulo {
    var wi : Int
    var vi : Int

    constructor(wi: Int, vi: Int) {
        this.wi = wi
        this.vi = vi
    }

    override fun toString(): String {
        return "articulo(peso=$wi, valor=$vi)"
    }


}