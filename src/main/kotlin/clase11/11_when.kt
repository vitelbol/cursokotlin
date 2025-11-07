package clase11

fun main ()
{
    val email = "admin@empresa.com"
    val tipoDeUsuario = when
    {
        email.contains("admin") -> {
            "Administrador"
        }
        email.contains("support") -> "Soporte"
        else -> "Usuario normal"
    }
    val proveedor =readLine()
    when(proveedor)
    {
        "gmail" -> println("google mail")
        "yahoo" -> println("yahoo mail")
        "outlook" -> println("microsoft mail")
        else -> println("Otro proveedor")
    }
    val elEmailEsValido = email.contains("@") && email.contains(".com")
    val esGmail = email.contains("gmail")
    when{
        elEmailEsValido && esGmail ->{
            println("Es un correo valido del proveedor Gmail")
        }
        elEmailEsValido ->{
            println("Es un correo valido")
        }
        else -> {
            println("Es un correo no valido")
        }
    }
    println("El tipo de usuario de email $email es: $tipoDeUsuario")
}