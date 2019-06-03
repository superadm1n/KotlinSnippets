import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val t = Triangle(3.0, 4.0)
    println(t.lengthSideC())
    println(t.areaSquareC())
}


class Triangle(length_side_a: Double, length_side_b: Double) {
    // This Triangle class demonstrates the pythagorean theorem
    val a = length_side_a
    val b = length_side_b
    
    fun lengthSideC(): Double {
        // Gets the length of the unknown 3rd side
        return sqrt(this.a.pow(2) + this.b.pow(2))
    }
    
    fun areaSquareA(): Double {
        // Returns the area of a square on the side of face A
        return this.a.pow(2)
    }
    
    fun areaSquareB(): Double {
        // Returns the area of a square on the side of face B
        return this.b.pow(2)
    }
    
    fun areaSquareC(): Double {
        // Returns the area of a square on the side of face C
        return this.a.pow(2) + this.b.pow(2)
    }
}
