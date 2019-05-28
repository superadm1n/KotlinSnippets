
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

fun working_with_lists() {
    /*
     * Information on Kotlin Collections can be found here
     * https://kotlinlang.org/docs/reference/collections-overview.html 
     */
    
    // This function contains example code for working with lists
    
    // Unable to add or remove from this list
    val myList = listOf(1, 2, 3)
    
    // Able to add or remove elements from this list
    val myMutableList = mutableListOf(1, 2, 3, 4)
    
    // Iterate over list
    for (x in myList) {
        println(x)
    }
    // Get size of list
   println("Your list has ${myList.size} elements!")
   
   // Lists start with an index of 0 like python. This is getting the first element of a list
   println("The first element in your list is ${myList[0]}")
   
   // You can also use a get method on a list object
   println("This is an example of getting the second element with get: ${myList.get(1)}")
   
   // One thing to note when getting elements of a list via their index, if you try and get 
   // an index that does not exist you get an ArrayIndexOutOfBoundsException
   
   // Getting the index if an element in a list
   println("the index of 2 in our list is ${myList.indexOf(2)}")
   
   // A list object is immutable, in order to modify a list we must use a mutable list. Below are
   // a few examples of adding and removing from mutable lists
   println(myMutableList)
   // Appends the integer 5 to the end of the list
   myMutableList.add(5)
   println(myMutableList)
   // Removes the element at index 1 of the list
   myMutableList.removeAt(1)
   println(myMutableList)
   
   // Sets the element at index 0 in the list to the integer 15
   myMutableList[0] = 15
   println(myMutableList)
   
   // Shuffles the order of the list
   myMutableList.shuffle()
   println(myMutableList)
    
}


fun working_with_maps() {
    /*
     * Information on Kotlin Collections can be found here
 	 * https://kotlinlang.org/docs/reference/collections-overview.html 
     * 
     * Maps in Kotlin are like dictionaries in Python. They are objects
     * that store the data in a key value pair
     * Unlike Lists in Kotlin the values can be of different types, for instance
     * some keys can correspond to a string value where other keys in the same dictionary
     * can correspond to an integer value
     */
    
    // Like lists, in order to get a mutable map this would need to be mutableMapOf()
    val myMap = mapOf("first" to "Tony", "last" to "Robinson", "Age" to 25, "Interests" to listOf("Programming", "Running", "Reading"))
    println(myMap)
    
    // Iterate over map
    for (kvPair in myMap) {
        println(kvPair)
    }
    
    // Print all keys
    println("All keys: ${myMap.keys}")
    // Print all values
    println("All values: ${myMap.values}")
    
    // Iterate over all keys, checking value type for a list
    for (key in myMap.keys) {
        println(myMap[key])
        if (myMap[key] is List<*>) {
            println("Hey this value is a list")
        }
    }
}
