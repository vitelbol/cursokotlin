package clase16

class EmailNormal(val asunto: String, val remitente: String, var leido: Boolean)
data class EmailData(val asunto: String, val remitente: String, var leido: Boolean)
fun main()
{
    val emailNormal1 = EmailNormal("reunion","jefe@empresa.com",false)
    val emailcopia = emailNormal1
    val emailNormal2 = EmailNormal("reunion","jefe@empresa.com",false)
    val emailData1 = EmailData("Reunion","jefe@empresa.com",false)
    val emailData2 = EmailData("Reunion","jefe@empresa.com",false)
    println("Clase normal: ${emailNormal1}")
    println("Data clase: ${emailData1}")

    println("Comparacion clase normal: ${emailNormal1 == emailNormal2}")
    println("Comparacion data clase: ${emailData2 == emailData2}")

    val emailCopia = emailData1.copy(asunto = "Reunion[Copia]")
    println("Esto es una copia ${emailCopia}")

    //destructuring
    val  (asunto1, remitente, leido) = emailCopia
    println("Valores asunto:${asunto1} remitente: $remitente es leido: $leido")
    println("hachcode data 1: ${emailData1.hashCode()}")
    println("hachcode data 2: ${emailData2.hashCode()}")
}
