fun main() {
    val celsius: Double = 23.0
    val fahrenheit: Double = 10.0

    println("$celsius°C son ${celsiusAFahrenheit(celsius)}°F")
    println("$fahrenheit°F son ${fahrenheitACelsius(fahrenheit)}°C")
}

fun celsiusAFahrenheit(celsius: Double): Double {
    return (celsius * 9/5) + 32
}

fun fahrenheitACelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5/9
}