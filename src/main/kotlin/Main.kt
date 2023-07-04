
package Calculador

fun main(args: Array<String>) {
    val x = 12
    val y = 2
    val resultado = soma(x, y)
    println("o resultado da soma é = $resultado")

    val x1 = 12
    val y1 = 2
    val resultado1 = multiplica(x1, y1)
    println("o resultado da Multiplicacao é = $resultado1")

    val x2 = 12
    val y2 = 2
    val resultado2 = dividir(x2, y2)
    println("o resultado da divisao é = $resultado2")

    val x3 = 15
    val y3 = 2
    val resultado3 = subtrair(x3, y3)
    println("o resultado de subtrair é = $resultado3")
}
// Metodo Para somar Dois numeros.
fun soma (x: Int, y:Int) = x+y

// Metodo Multiplicação de dois numeros.
fun multiplica(x1:Int, y1:Int) = x1*y1

// Metodo Divisao de dois numeros.
fun dividir(x2:Int,y2:Int) = x2/y2

// Metodo Subtrair de dois numeros.
fun subtrair(x3:Int, y3:Int) = x3-y3
