import kotlin.random.Random

    fun main() {

        val estado = arrayListOf<String>("Anciano","Adulto","Joven")
        var est : String = estado.random()
        val per = Personaje2("Jack","Joven")
        println(est)
        var frase : String = "AAA"



        if (per.estado.equals("Joven")){
            var cont = 0
            var contMayuscula = 0

            frase.forEach {
                if (it.isUpperCase()){
                    contMayuscula++
                }
                cont++
            }


            if (frase.contains("¿") || frase.contains("?") ){
                if (contMayuscula != cont)
                    println("De lujo")
            }

            if (contMayuscula == cont){
                println("Eh relájate")
                }

            if ( contMayuscula+2 == cont ){
                    if (frase.contains("?") || frase.contains("¿"))
                         println("Tranqui se lo que hago")
                 }

           if (frase.equals("Jack")){
                    println("¿Qué pasa?")
                }

           if (!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
               if (contMayuscula+2 != cont){
                   println("Yo que se")
               }
           }



        }

    }







class Personaje2{
     var nombre: String = ""
     var estado: String = ""

    constructor(nombre: String, estado: String) {
        this.nombre = nombre
        this.estado = estado
    }

    override fun toString(): String {
        return "Personaje(nombre='$nombre', estado='$estado')"
    }

}
