fun main() {
    val amount = 1000_000
    val tax = if (amount * 0.0075 >= 3500) amount * 0.0075 else 3500
    println(tax)
}