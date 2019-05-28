import java.io.File

fun main() {
    deleteFileExample()
    writeFileExample()
    readFileExample()
    deleteFileExample()

}


fun writeFileExample() {
    val f = File("test.txt")
    f.writeText("Hey this is my file!\n")
    f.appendText("This will be appended")
}

fun readFileExample() {
    val f = File("test.txt")
    val fileContents = f.readText()
    println(fileContents)
}

fun deleteFileExample() {
    val f = File("test.txt")

    if (f.isFile() == true) {
        f.delete()
        println("File test.txt deleted!")
    } else {
        println("Unable to find file to delete")
    }
}
