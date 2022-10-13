
fun main () {


    val array = arrayOf("9", "8", "7", "\n", "5", "3", "2", "\n", "6", "6", "7")
    val char = "\n"
    var fila = 1
    var col = 1
    var i = 0
    var cont = 1
    var cont2 = 0



    array.forEach {
    if (it == char)
        cont++
        else
            cont2++
}
            print(" ")
            repeat(cont){
                print("  ")
                print(fila)
                fila++

            }

            print("\n")

             System.out.print(" |")


            repeat(cont2){

                print("-")

            }

            println()
            System.out.print(col)
            System.out.print("|")
            print(" ")


            array.forEach {


                System.out.print(it)
                if (it == char) {
                    col++
                    System.out.print(col)
                    System.out.print("|")
                    print(" ")
                }
                else
                    print("  ")
            }


}





