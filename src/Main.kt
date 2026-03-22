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
    createCells()
    addCoin()
    showCells()


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


    for (i in 1..4) {

        print("Enter white coin positions: ")
        val wPosition = "white"

        if (wPosition.isNullOrEmpty()) {
            println("No position entered.")
            return
        }

        if (wPosition.length > 8) {
            println("Input too long.")
            return
        }

        println()

        print("Enter Cell Number 1 to 16: ")
        val cell = readlnOrNull()?.toIntOrNull()

        if (cell == null) {
            println("Invalid number.")
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



