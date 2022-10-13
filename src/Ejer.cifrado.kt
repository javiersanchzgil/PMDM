


fun main (){

    var array = arrayListOf<Char>('a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z')
    val ROT = 13
    var palabra:String = "Hola"
    var cifrado:String = ""
    var i = 0
    var cont = 0
    var tam = array.size

    println(tam)

    palabra.forEach {

        do {
            if (it.lowercaseChar() == array[i]) {
                cont = i + ROT
                cifrado += array[cont]
                cont = 0

            }
                i++

        }while (i > tam)
        }

    println(cifrado)




}