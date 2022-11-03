import java.util.*
import kotlin.random.Random

    fun main() {

        val estado = arrayListOf<String>("Anciano","Adulto","Joven")
        val clases = arrayListOf<String>("Mago","Ladrón","Guerrero","Berserker")
        val razas = arrayListOf<String>("Elfo", "Humano","Enano","Goblin")
        var est : String = estado.random()
        var clase : String = clases.random()
        var raza : String = razas.random()
        val per = Personaje2("Jack",est,clase,raza)
        println(per.toString())
        var frase : String = "AAA"


        if (per.raza == "Enano"){
            frase = frase.uppercase()
        }


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
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("De lujo"))

                if (contMayuscula == cont)
                    println("De lujo")
            }

            if(contMayuscula == cont){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("Eh relájate"))
                else
                    println("Eh relájate")
            }

            if( contMayuscula+2 == cont ){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("Tranqui se lo que hago"))

                if (frase.contains("?") || frase.contains("¿"))
                    println("Tranqui se lo que hago")
            }

           if(frase.equals(per.nombre)){
               if (per.raza == "Elfo" || per.raza == "Goblin")
                   println(cifrado("¿Qué pasa?"))
               else
                println("¿Qué pasa?")
           }

           if(!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
               if (per.raza == "Elfo" || per.raza == "Goblin")
                   println(cifrado("Yo que se"))

               if (contMayuscula+2 == cont){
                   println("Yo que se")
               }
           }



        }

        if (per.estado.equals("Adulto")){
            var cont = 0
            var contMayuscula = 0

            frase.forEach {
                if (it.isUpperCase()){
                    contMayuscula++
                }
                cont++
            }


            if (frase.contains("¿") || frase.contains("?") ){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("En la flor de la vida, pero me empieza a doler la espalda"))

                if (contMayuscula == cont)
                    println("En la flor de la vida, pero me empieza a doler la espalda")
            }

            if(contMayuscula == cont){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("No me levantes la voz mequetrefe"))
                else
                 println("No me levantes la voz mequetrefe")
            }

            if( contMayuscula+2 == cont ){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("Estoy buscando la mejor solución"))

                if (frase.contains("?") || frase.contains("¿"))
                    println("Estoy buscando la mejor solución")
            }

             if(frase.equals(per.nombre)){
                 if (per.raza == "Elfo" || per.raza == "Goblin")
                     println(cifrado("¿Necesitas algo?"))
                 else
                     println("¿Necesitas algo?")
             }

            if(!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("No sé de qué me estás hablando"))

                if (contMayuscula+2 == cont){
                    println("No sé de qué me estás hablando") }
            }



        }

        if (per.estado.equals("Anciano")){
            var cont = 0
            var contMayuscula = 0

            frase.forEach {
                if (it.isUpperCase()){
                    contMayuscula++
                }
                cont++
            }


            if (frase.contains("¿") || frase.contains("?") ){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("No me puedo mover"))

                if (contMayuscula == cont)
                    println("No me puedo mover")
            }

            if(contMayuscula == cont){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("Háblame más alto que no te escucho"))
                else
                    println("Háblame más alto que no te escucho")
            }

            if( contMayuscula+2 == cont ){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("Que no te escucho!"))

                if (frase.contains("?") || frase.contains("¿"))
                    println("Que no te escucho!")
            }

            if(frase.equals(per.nombre)){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("Las 5 de la tarde"))
                else
                    println("Las 5 de la tarde")
            }

            if(!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
                if (per.raza == "Elfo" || per.raza == "Goblin")
                    println(cifrado("En mis tiempos esto no pasaba"))

                if (contMayuscula+2 == cont){
                    println("En mis tiempos esto no pasaba") }
            }


        }

    }


class Personaje2{
     var nombre: String = ""
     var estado: String = ""
     var clase : String = ""
     var raza : String = ""

    constructor(nombre: String, estado: String, clase : String, raza: String) {
        this.nombre = nombre
        this.estado = estado
        this.clase = clase
        this.raza = raza
    }

    override fun toString(): String {
        return "Personaje(nombre='$nombre', estado='$estado', clase='$clase', raza='$raza')"
    }

}

fun cifrado (palabra:String): String {
var array = arrayListOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')
val ROT = 13
var cifrado:String = ""
var i = 0
var cont = 0
val TAM = array.size


palabra.forEach {
    do {
        if (it.lowercaseChar() == array[i]) {
            cont = i + ROT
            if (cont > TAM-1) {
                cont = cont - TAM
                cifrado += array[cont].toString()
                cont = 0
                i=TAM
            }

            else
                if (cont < TAM-1){
                    cifrado += array[cont].toString()
                    cont = 0
                    i=TAM
                }
        }
        i++
    } while (i < TAM)
    i = 0
}
    return cifrado
}

