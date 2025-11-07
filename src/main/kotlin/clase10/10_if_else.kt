package clase10

fun leerEmail(): String
{
    println("Ingresa tu email: ")
    val email =readLine()?.trim() ?: "Sin correo"
    return email
}
fun leerPassword(): String
{
    println("Ingresa tu contraseña: ")
    val email =readLine()?.trim() ?: ""
    return email
}
fun main()
{
    val email = leerEmail()
    if(email.contains("@"))
    {
        println("El email tiene formato valido")
    }
    else
    {
        println("El email no es valido")
    }
    val password =leerPassword()
    val nivelDeSeguridad = if(password.length >= 8)
    {
        "Alto"
    }
    else if (password.length >=6)
    {
        "Medio"
    }
    else
    {
        "Bajo"
    }
    println("El nivel de seguridad de contraseña es: $nivelDeSeguridad")
}