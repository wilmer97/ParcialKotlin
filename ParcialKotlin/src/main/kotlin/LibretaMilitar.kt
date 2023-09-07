fun main() {

    /*
    Nombre: Wilmer Moncada Parra
    ID: 702523
    Materia: CP II
    Ingenieria de sistemas

El ejército nacional ha decidido hacer una jornada de ventas de libretas militares para muchos
hombres que no han definido su situación militar u otros que no son aptos para prestar el servicio.
Además de la edad de joven, se tendrá en cuenta el nivel del sisben de la persona. Para todos
los hombres mayores de 18 años la libreta tendrá un costo de $350000, pero para aquellos que
tengan nivel 1 se les hará un descuento del 40%; para los de nivel 2, el descuento será del 30%;
para nivel 3 del 15%; y para los demás estratos o niveles no habrá descuento. Para los jóvenes con
los 18 años la libreta tiene un costo de $200000 y los jóvenes con nivel del sisben 1, tendrán un
descuento del 60%; para los de nivel 2, descuento del 40%; para los del 3, un descuento del 20% y
para los demás estratos no habrá descuento. Hacer un algoritmo que tome la edad y el nivel del
sisben de un hombre y nos muestre descuento que le hacen y su valor final a pagar.
     */

    val edad = obtenerEdad()
    val nivelSisben = obtenerNivelSisben()
    val costoLibreta = calcularCostoLibreta(edad, nivelSisben)
    val descuento = calcularDescuento(edad, nivelSisben)
    val valorFinal = costoLibreta - descuento

    println("El descuento es: $descuento")
    println("Valor final a pagar: $valorFinal")

}

fun obtenerEdad(): Int {
    println("Ingrese la edad del hombre:")
    return readLine()?.toIntOrNull() ?: 0
}

fun obtenerNivelSisben(): Int{
    println("Ingrese el nivel de sisben:")
    return readln()?.toIntOrNull() ?:0
}


fun calcularCostoLibreta(edad: Int, nivelSisben: Int): Int {
    return if (edad >= 18) {
        35000
    } else {
        200000
    }
}

fun calcularDescuento(edad: Int, nivelSisben: Int): Int {
    return if (edad >= 18) {
        when (nivelSisben) {
            1 -> (calcularCostoLibreta(edad, nivelSisben) * 0.4).toInt()
            2 -> (calcularCostoLibreta(edad, nivelSisben) * 0.3).toInt()
            3 -> (calcularCostoLibreta(edad, nivelSisben) * 0.15).toInt()
            else -> 0
        }
    } else {
        when (nivelSisben) {
            1 -> (calcularCostoLibreta(edad, nivelSisben) * 0.6).toInt()
            2 -> (calcularCostoLibreta(edad, nivelSisben) * 0.4).toInt()
            3 -> (calcularCostoLibreta(edad, nivelSisben) * 0.2).toInt()
            else -> 0
        }
    }
}






