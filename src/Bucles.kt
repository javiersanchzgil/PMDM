
fun main () {
    var pisos = 10
    var ventanas = 4

    repeat(14){
        print ("_")
    }
    repeat(pisos){
        print ("\n")
        print("|")
        repeat(ventanas){
            print("_▋_")
        }
        print("|")
    }

    repeat(pisos){
        print("/\\")

    }


}