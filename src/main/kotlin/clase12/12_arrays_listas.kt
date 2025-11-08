package clase12

fun main()
{
    //array

    val emails = arrayOf("jose@empresa.com","carlos@empresa.com","wilson@empresa.com")
    val cantidadDeCorreos = arrayOf(1,15,50,100)
    println("El primer correo es: ${emails[0]}")
    println("El segundo correo es: ${emails[1]}")
    println("El tercer correo es: ${emails[2]}")
    emails[0] ="nuevocorreo@empresa.com"
    emails.set(0,"nuevocorreojose@empresa.com")
    println("El primer correo es: ${emails[0]}")
    println("La lista de correos es: ${emails.joinToString()}")
    println("El tamaño del array es: ${emails.size}")
    val nuevaListaDeEmails = mutableListOf<String>()
    println("Nueva lista : ${nuevaListaDeEmails.joinToString()} tamaño: ${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.addAll(arrayOf("jose@empresa.com", "carlos@empresa", "wilson@empresa.com"))
    println("Nueva lista : ${nuevaListaDeEmails.joinToString()} tamaño: ${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.remove("jose@empresa.com")
    println("Nueva lista : ${nuevaListaDeEmails.joinToString()} tamaño: ${nuevaListaDeEmails.size}")
    nuevaListaDeEmails.add("jose@empresa.com ")
    println("Nueva lista : ${nuevaListaDeEmails.joinToString()} tamaño: ${nuevaListaDeEmails.size}")

    val listOfEmails = listOf<String>("jose@empresa.com", "carlos@empresa.com", "wilson@empresa.com")
    val nuevaLista = listOfEmails.subList(1,3)
    println("Nueva lista: ${nuevaLista.joinToString()}")
    val primerElemento = listOfEmails.first()
    println("Primer Elemento: ${primerElemento}")
    val ultimoElemento = listOfEmails.last()

    val indexLastElement = listOfEmails.lastIndex
    println("Ultimo Elemento: ${ultimoElemento} y su indice = $indexLastElement")
}