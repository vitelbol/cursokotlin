package clase15

class Email(val remitente: String, val mensaje: String)
{
    var asunto: String =""
        set(value)
        {
            field = if (value.trim().isNotEmpty()) value.trim() else "sin asunto"
        }
    val esImportante: Boolean
        get() = asunto.contains("Urgente",ignoreCase = true)
}
fun main()
{
    val email1 = Email("jose@gmail.com","Este mensaje es de un correo")
    email1.asunto = "   "
    println("El asunto es: ${email1.asunto}")
    email1.asunto = "URGENTE"
    println("El asunto es importante?: ${email1.esImportante}")
}