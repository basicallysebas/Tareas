const val PI = 3.1416 

fun main() {
    
    var numerodecimal= 6.57
    println("El tipo de dato para un numero decimal es: ${numerodecimal::class.simpleName}")
    
    //volver flotante
    println("Cambiando el tipo de dato de double a float: ${numerodecimal.toFloat()::class.simpleName}")
    
    val perimetro = 2 * PI * numerodecimal
    println("El perimetro del circulo es: $perimetro")

}