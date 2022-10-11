
fun main () {


    val array = arrayOf("9", "8", "7", "\n", "5", "3", "2", "\n", "6", "6", "7")
    val char = "\n"
    var fila = 0
    var col = 1
    var i = 0
    var cont = 0

    array.forEach {
    if (it == char)
        cont++
}




    repeat(cont){
        System.out.print(col)
        System.out.print("|")
        print("\t")
        array.forEach {
            System.out.print(it + "\t")
            if (it == char) {
                System.out.print("")
            }
        }
        cont++
    }





}

fun imprimir(array: Array<String>, char: String,fila:Int,col:Int) {

    print("  1 2 3")
    println()

    array.forEach {

        System.out.print(it + "\t")
        if (it == char)
            System.out.println("")
    }
}




