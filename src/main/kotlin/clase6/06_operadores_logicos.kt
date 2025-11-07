package clase6

fun main(){
    val emailRecibidos = 15
    val emailsEnviados = 15
    val limiteEmails = 20
    val tieneEmails = emailRecibidos >16
    val excesoEmails = emailsEnviados >=limiteEmails
    println("Tiene emails? ${tieneEmails}")
    println("Alcanzamos el limite de emails ${excesoEmails}")
    val sonIguales = emailRecibidos == emailsEnviados
    println("Son iguales ${sonIguales}")
    val sonDiferentes = emailRecibidos !=emailsEnviados
    println("Son diferentes ${sonDiferentes}")

    val email = "user@example.com"
    val password ="1234"
    val tieneArroba = email.contains("@")
    val tienePunto = email.contains(".bo")
    val esEmailValido = tieneArroba && tienePunto //AND
    println("Es email valido? $esEmailValido")
    val passwordCorto =password.length < 6
    val passwordLargo = password.length > 20
    val passwordProblematico = passwordCorto || passwordLargo // OR
    println("Es una contraseña problematica: $passwordProblematico")
    val emailInvalido = !esEmailValido //NOT negado
    println("Es un email invalido: $emailInvalido")
}