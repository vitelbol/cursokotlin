package clase17

enum class EmailFolders
{
    INBOX,
    SENT,
    DRAFT,
    ARCHIVE,
    SPAM
}
enum class EmailPriority(val level: Int, val color: String)
{
    LOW(level = 1, color = "gris"),
    NORMAL(level = 2, color = "azul"),
    HIGH(level = 3, color = "naranja"),
    URGENT(level = 4, color = "rojo"),
}
fun prioridadAEmailPriority(entero: Int): EmailPriority?
{
    return if(entero in 0 until EmailPriority.entries.size)
        EmailPriority.entries.get(entero)
    else
        null
}
fun main()
{
    println("=====================")
    println("Seleccionar caroeta")
    println("1. Bandeja de Entrada")
    println("2. Borradores")
    println("3.Archivados")
    println("4. Spam")
    val valorCarpeta =readLine()?.trim()?.toInt()?:0
    var carpetaActual = EmailFolders.entries.get(valorCarpeta)

    when(carpetaActual){
        EmailFolders.INBOX -> {
            println("Bienvenidos al Inbox")
        }
        EmailFolders.SENT -> {
            println("Bienvenidos a enviados")
        }
        EmailFolders.DRAFT -> {
            println("Bienvenidos a borradores")
        }
        EmailFolders.ARCHIVE -> {
            println("Bienvenidos a archivo")
        }
        EmailFolders.SPAM -> {
            println("Bienvenidos a spam")
        }
    }
    val prioridadEmail = prioridadAEmailPriority(0)
    println("La prioridad de ${prioridadEmail?.name} es ${prioridadEmail?.level} con color ${prioridadEmail?.color}")
}