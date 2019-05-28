
fun input(prompt: String = ""): String? {
    /*
    Function to gather input from a user, similar to how it is done in Python.
     */
    if (prompt != "") {
        print(prompt)
    }
    val userInput = readLine()
    return userInput
}
