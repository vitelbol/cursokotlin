package clase5

fun main()
{
    val emailRecibidos = 25
    val emailEnviados = 15
    val emailEliminados = 3

    val totalEmails = emailRecibidos + emailEnviados
    val diferencia = emailRecibidos - emailEnviados
    val dobleEmails = emailRecibidos * 2
    val promedio = totalEmails/2
    val residuo = emailRecibidos %7
    println("Total: $totalEmails, promedio: $promedio, residuo: $residuo")
    val calculo = 10 + 5 * 2
    println(calculo)
    val calculo2 = (10 + 5) * 2
    println(calculo2)

    val emailsPorSemana = emailEnviados*7 + emailRecibidos * 7
    println(emailsPorSemana)
    var contador = 10
    println(contador)
    contador += 1
    println(contador)
    contador -= 2
    println(contador)
    contador *= 2
    println(contador)
    contador /=2
    println(contador)
    contador %=2
    println(contador)

}