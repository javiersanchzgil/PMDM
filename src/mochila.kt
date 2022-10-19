import java.util.Objects

fun main (){

    val W = 10

  personaje("Javier",W,"Ladron")
    val articulos = arrayListOf<articulo>(articulo(3,50),articulo(6,30),articulo(4,70),articulo(5,70))
    var i :Int = 0

    articulos.forEach(){
        do {
            if (it.wi < articulos[i])
                i++
        }while (i < articulos.size)



    }

    println(articulos.toString())

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