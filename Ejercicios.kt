// Kotlin
fun main() {

//Problema 2

    val telefonos: List<Map<String, Any>> = listOf(
        mapOf("make" to "Nokia",   "model" to 216, "color" to "Black"),
        mapOf("make" to "Mi Max",  "model" to 2,   "color" to "Gold"),
        mapOf("make" to "Samsung", "model" to 7,   "color" to "Blue")
    )

    val key = "model"
    val ordenados: List<Map<String, Any>> =
        telefonos.sortedBy { it[key] as Comparable<Any> }

    ordenados.forEach { println(it) }

//Problema 3

    val X: List<List<Int>> = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6),
        listOf(7, 8, 9)
    )

    //Transpuesta usando lambda
    val transpuesta: List<List<Int>> = (0 until X[0].size).map { c -> X.map { fila -> fila[c] } }

    //impresión
    for (fila in transpuesta) println(fila)

//Problema 4

    val colores = listOf("rojo", "verde", "azul", "amarillo", "gris", "blanco", "negro")
    val colores_a_borrar = listOf("amarillo", "café", "blanco")

    val colores_nuevos = colores.filter { it !in colores_a_borrar }
    println(colores_nuevos)
}
