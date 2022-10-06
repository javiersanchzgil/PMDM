fun main () {

    var numeroPisos = 8;
    var numeroVentanas = 4;
    var numeroTorres = 8;


    crearRascacielos(numeroPisos,numeroVentanas,numeroTorres);

}

fun crearRascacielos(numeroPisos: Int, numeroVentanas:Int, numeroTorres:Int) {

    repeat(numeroTorres) {
        repeat(numeroVentanas * 3 + 2) {
            print("_")
        }
        repeat(14) {
            print(" ")
        }
    }

    repeat(numeroPisos) {
        println()
        repeat(numeroTorres) {
            print("|")
            repeat(numeroVentanas) {
                print("_▋_")
            }

            print("|")
            repeat(14) {
                print(" ")
            }
        }
    }

}



