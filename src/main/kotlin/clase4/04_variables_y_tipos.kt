package clase4

fun main()
{
    val nombreUsuario = "Jose" //val no cambia se declara tipo inmutable
    var nombreUsuario2 = "Ignacio" //var se puede reasignar el valor final
    var emailNoLeidos = 5
    println("Usuario : $nombreUsuario emails: $emailNoLeidos ")

    val totalEmails: Int
    totalEmails =150
    val totalEmails2: Long = 150 //mas grande enteros
    val porcentaje: Float =75.5f
    val porcentaje2: Double = 150.2 //mas grande decimal
    val asunto: String = "Reunion"
    val esUrgente: Boolean = true
    val numero = 42
    val comoTexto = numero.toString() //convertir numero a texto
    val comoNumero ="25".toInt() //convertir texto a numero
    println(numero)
    println(comoNumero)
    val leidos = 15
    val totales = 20
    val porcentajeEmail = leidos.toFloat()/totales
    println(porcentajeEmail)

}