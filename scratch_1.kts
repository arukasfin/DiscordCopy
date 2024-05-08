enum class Color {
    WHITE, BLACK, RED, BLUE, GREEN
}

class Car(private val model: String, private var speed: Int, var gas: Int, val color: Color) {

    fun getSpeeds(): Int {
        return this.speed
    }

    fun increaseSpeed() {
        this.speed += 10
    }

    fun addGas(newGas: Int) {
        gas += newGas
    }
}

val myCar = Car("Hyundai Tico", 0, 0, Color.RED)
println("Speed: ${myCar.getSpeeds()}")
println("Color: ${myCar.color}")

myCar.addGas(100)
println("Gas: ${myCar.gas}")

for (i in 1..10) {
    myCar.increaseSpeed()
    println("Increase Speed: ${myCar.getSpeeds()}")
}
