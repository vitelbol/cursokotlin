package clase18

fun main()
{
    val emails = listOf<String>("jose@empresa.com","carlos@empresa.com","marisol@empresa.com")
    var esExitoso = false
    try {
        emails[10]
        throw RuntimeException("Algo paso con el procesamiento de correos")
        esExitoso = true
    }
    catch (e: ArrayIndexOutOfBoundsException){
        println("Indice de emails no valido")

    }
    finally {
        println("Finalizo el procesamiento de correos fue exitoso?: $esExitoso")
    }

}