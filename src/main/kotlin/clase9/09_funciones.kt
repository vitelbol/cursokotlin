package clase9

fun mostrarBienvenida()
{
    println("===== SISTEMA EMAIL =====")
    println("Bienvenido al gestor de email")
}
fun saludarUsuario(nombre: String)
{
    println("Hola $nombre, tienes nuevos email")
}
fun leerEmail(): String
{
    println("Ingresa tu email: ")
    val email =readLine()?.trim() ?: "Sin correo"
    return email
}
fun leerAsunto(): String
{
    println("Ingresa tu asunto: ")
    val asunto =readLine()?.trim() ?: "Sin asunto"
    return asunto
}
fun leerMensaje(): String
{
    println("Ingresa tu mensaje: ")
    val mensaje =readLine()?.trim() ?: "Sin mensaje"
    return mensaje
}
fun crearMensajeEmail(destinatario: String, asunto: String, mensaje: String)
{
    println("=============================")
    println("EMAIL CREADO")
    println("=============================")
    println("Para: $destinatario")
    println("Asunto: $asunto")
    println("Mensaje: $mensaje")
    println("=============================")

}
fun enviarEmail()
{
    println("Email enviado!!!")
}
fun main()
{
    mostrarBienvenida()
    saludarUsuario("Jose")
    val email = leerEmail()
    val asunto = leerAsunto()
    val mensaje = leerMensaje()
    crearMensajeEmail(destinatario =email,asunto =asunto,mensaje=mensaje)
    enviarEmail()
}