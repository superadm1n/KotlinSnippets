/*
 * Information on Kotlin Classes can be found here
 * https://kotlinlang.org/docs/reference/classes.html
 * 
 * This File contains examples of working with classes and inheritance.
 */

fun main() {
    val myCar = Coup("Red", 1500.00, 200)
    println(myCar.color)
    myCar.color = "Blue"
    println(myCar.color)
    println(myCar.owner)
    println(myCar.numberOfDoors)
    println(myCar.revEngine(5))
}


open class Car {
    // These are the public class attributes, meaning they can be modified directly, if we wish to make them
    // immuteable we would use val instead of var. Because we do not specify getters and setters they 
    // inherit default getters and setters and behave similar to class attributes in Python
    open var color: String = ""
    open var weight: Double = 0.0
    open var horsePower: Int = 0
    // This will not change so we use val, we need to over ride this in different types of cars so we 
    open val numberOfDoors: Int = 0
    var owner: String = ""
    
    private var emergencyBreak = false
    
    
    init {
        
        // init can be thought of as part of the primary constructior
    }
    
    fun revEngine(times: Int): String {
        var returnData = String
        var tempList = mutableListOf<String>()
        
        for (x in 1.rangeTo(times)) {
            tempList.add("Vroom")
        }
        return tempList.joinToString(" ")
    }
    
    fun applyEmergencyBreak() {
        if (this.emergencyBreak != true) {
            this.emergencyBreak = true
        }
    }
}

class Coup(color: String, weight: Double, horsePower: Int): Car() {
    override val numberOfDoors = 2
    override var color = color
    override var weight = weight
    override var horsePower = horsePower
}
