package clase7

fun main()
{
    var emailObligatorio: String = "user@email.com"
    var emailOpcional: String? = null
    println(emailOpcional)

    emailObligatorio
    //emailOpcional ="prueba@prueba.con"
    val longitudEmail =emailOpcional?.length ?: 0
    println("longitud del correo: $longitudEmail")
}