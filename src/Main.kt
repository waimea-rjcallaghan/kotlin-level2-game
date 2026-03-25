/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name:    PROJECT NAME HERE
 * Project Author: Ryder Callaghan PROJECT AUTHOR HERE
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */


val cells = mutableListOf<String?>()
fun main() {
    print("Enter your name player one: ")
    val player1 = readln()
    print("Enter your name player two: ")
    val player2 = readln()
    createCells()
    addCoin()
    showCells()

    while (true) {
        println("player one $player1's turn")
        moveCoin()
        showCells()
        println("player two $player2's turn")
        moveCoin()
        showCells()
    }

}

fun createCells() {
    for (i in 1..16) {
        cells.add("...")
    }
}

fun showCells() {
    for (i in 1..cells.size) {
        val cellNum = "cell $i"
        print("   ${cellNum.padEnd(length = 8)}  ")
    }
    println()
    print("┌────────────")
    print("┬────────────".repeat(cells.size - 1))
    println("┐")

    for (cell in cells) {
        print("│ ${cell?.padEnd(10)} ")
    }
    print("│")
    println()
    print("└────────────")
    print("┴────────────".repeat(cells.size - 1))
    println("┘")
}


fun addCoin() {



    if (cells.size < 4) {

        print("Entering white coin positions ")
        val wPosition = "white"


        println()

        println("generating cell positions... ")
        val cell = (1..16).random()

        if (cell == null) {
            println("Invalid cell.")
            return
        }

        val index = cell - 1

        if (index in 0..15) {
            if (cells[index] == "...") {
                cells[index] = wPosition
            } else {
                println("Cell already occupied.")
            }
        } else {
            println("Invalid Cell Number.")
        }
    }
}

fun moveCoin() {
    print("Enter first cell number: ")
    val cell1 = readlnOrNull()?.toIntOrNull()

    print("Enter second cell number: ")
    val cell2 = readlnOrNull()?.toIntOrNull()

    if (cell1 == null || cell2 == null) {
        println("Invalid number entered.")
        return
    }

    val index1 = cell1 - 1
    val index2 = cell2 - 1

    if (index1 in 0..15 && index2 in 0..15) {
        val temp = cells[index1]
        cells[index1] = cells[index2]
        cells[index2] = temp
    } else {
        println("Invalid cell number.")
    }
}



