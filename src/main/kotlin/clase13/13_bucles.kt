package clase13

fun main(){
    var emailPendientes = 3
    while(emailPendientes>0){
        println("Procesando email. Quedan: $emailPendientes")
        emailPendientes -=1
    }
    var intentos = 0
    do {
        intentos +=1
        println("Intento de envio de correo: $intentos")
    }while (intentos<2)

    for (i in 0 .. 5)
    {
        println("El valor de i es: $i")
    }
    var i = 0
    while (i<=5)
    {
        println("El valor de i es: $i")
        i++
    }
    for (i in 5 downTo 0)
    {
        println("El valor de i es: $i")
    }
    for (i in 0 .. 10 step 2)
    {
        println("El valor de i es: $i")
    }
    val emails = arrayOf("jose@empresa.com","carlos@empresa.com","wilson@empresa.com")
    for(email in emails)
    {
        println("Correo actual: $email")
    }
    var indiceemail = 0
    while (indiceemail <= emails.size-1)
    {
        println("Correo actual: ${emails.get(indiceemail)}")
        indiceemail ++
    }
}