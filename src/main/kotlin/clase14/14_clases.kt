package clase14

class Email(
    val asunto: String,
    val remitente: String,
    val mensaje: String
)
{
    var leido: Boolean = false
    fun marcarComoLeido(){
        leido =true
    }
    fun getterLeido(): Boolean
    {
        return leido
    }
    fun setterLeido(): Boolean
    {
        this.leido = leido
        return leido
    }
    fun marcarComoNoLeido()
    {
        leido = false
    }
    fun mostrarLaInfo()
    {
        println("De: $remitente | Asunto: $asunto | Leido: $leido")
    }
}
class BandejaEmails
{
    val emails= mutableListOf<Email>()
    fun agregarUnEmail(email:Email)
    {
        emails.add(email)
    }
    fun contarLeidos(): Int{
        var contador = 0
        for(email in emails)
        {
            if(!email.leido) {
                contador++
            }
        }
        return contador
    }
}
fun main()
{
    val email1 = Email(asunto = "Reunion viernes", remitente = "carlos@gmail.com", mensaje = "No se te olvide nuestra reunion para el viernes")
    val email2 = Email(asunto = "Reunion viernes", remitente = "carlos@gmail.com", mensaje = "No se te olvide nuestra reunion para el viernes")
    val email3 = Email(asunto = "Reunion viernes", remitente = "carlos@gmail.com", mensaje = "No se te olvide nuestra reunion para el viernes")
    email1.marcarComoLeido()
    val bandejaEmails = BandejaEmails()
    bandejaEmails.agregarUnEmail(email1)
    bandejaEmails.agregarUnEmail(email2)
    bandejaEmails.agregarUnEmail(email3)
    println("Faltan por leer: ${bandejaEmails.contarLeidos()}")
    println(email1.mostrarLaInfo())
}