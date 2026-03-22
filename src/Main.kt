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
    showCells()
    
}

fun createCells() {
    for (i in 1..16) {
        cells.add("EMPTY")
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



