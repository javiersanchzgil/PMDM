fun main (){

}
fun funcionNull1 (num: Int?,num2: Int?,num3: Int?,num4: Int?): Int? {

    return if(num == null || num2 == null || num3 == null || num4 == null){
        null
    }
    else
        num + num2 + num3 + num4
}

fun funcion2(num: Int?, num2: Int?, num3: Int?, num4: Int?) : Int {
    var suma = num ?: 0
    suma += num2 ?: 0
    suma += num3 ?: 0
    suma += num4 ?: 0
    return suma
}

fun funcion3(num1: Int?, num2: Int?, num3: Int?, num4: Int?) : Int? {
    return if (num1 == null && num2 == null && num3 == null && num4 == null)
        null
    else {
        var suma = num1 ?: 0
        suma += num2 ?: 0
        suma += num3 ?: 0
        suma += num4 ?: 0
        suma
    }
}