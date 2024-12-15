package first_project

import java.util.*

fun main() {
    // Get the user's first name
    val scanner = Scanner(System.`in`)
    // display earned amount
    val bubblegumTotal = 202
    val toffeeTotal = 118
    val iceCreamTotal = 2250
    val milkChocoTotal = 1680
    val doughnutTotal = 1075
    val pancakeTotal = 80
    val totalIncome = bubblegumTotal + toffeeTotal + iceCreamTotal + milkChocoTotal + doughnutTotal + pancakeTotal
    println("Earned amount:")
    println("Bubblegum: \$%s\nToffee: \$%s\nIce cream: \$%s\nMilk chocolate: \$%s\nDoughnut: \$%s\nPancake: \$%s".format(
            bubblegumTotal, toffeeTotal, iceCreamTotal, milkChocoTotal, doughnutTotal, pancakeTotal))
    println("Income: $$totalIncome")
    // calculate net income
    println("Staff expenses:")
    val staffExpenses = scanner.nextInt()
    println("Other expenses:")
    val otherExpenses = scanner.nextInt()
    val netIncome = totalIncome - staffExpenses - otherExpenses
    println("Net income: \$%d".format(netIncome))
}