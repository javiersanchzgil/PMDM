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

           if (frase.equals(per.nombre)){
                    println("¿Qué pasa?")
                }

           if (!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
               if (contMayuscula+2 != cont){
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
                if (contMayuscula != cont)
                    println("En la flor de la vida, pero me empieza a doler la espalda")
            }

            if (contMayuscula == cont){
                println("No me levantes la voz mequetrefe")
            }

            if ( contMayuscula+2 == cont ){
                if (frase.contains("?") || frase.contains("¿"))
                    println("Estoy buscando la mejor solución")
            }

            if (frase.equals(per.nombre)){
                println("¿Necesitas algo?")
            }

            if (!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
                if (contMayuscula+2 != cont){
                    println("No sé de qué me estás hablando")
                }
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
                if (contMayuscula != cont)
                    println("No me puedo mover")
            }

            if (contMayuscula == cont){
                println("Háblame más alto que no te escucho")
            }

            if ( contMayuscula+2 == cont ){
                if (frase.contains("?") || frase.contains("¿"))
                    println("Que no te escucho!")
            }

            if (frase.equals(per.nombre)){
                println("Las 5 de la tarde")
            }

            if (!frase.contains("¿") || !frase.contains("¿") && !frase.equals("Jack")){
                if (contMayuscula+2 != cont){
                    println("En mis tiempos esto no pasaba")
                }
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
