


fun main (){

    var array = arrayListOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')
    val ROT = 13
    var palabra:String = "Hola"
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
    println("El cifrado sería " + cifrado)
}