/**
 * =====================================================================
 * Programming Project for NCEA Level 2, Standard 91896
 * ---------------------------------------------------------------------
 * Project Name: Pinned DTD project
 * Project Author: Ryder Callaghan
 * GitHub Repo:    GITHUB REPO URL HERE
 * ---------------------------------------------------------------------
 * Notes:
 * PROJECT NOTES HERE
 * =====================================================================
 */


val cells = mutableListOf<String?>()
var blackCell = 0
fun main() {

    var ruleChoice = null

    while (ruleChoice != "y, n") {
        println("Welcome to Pinned!!!")

        println("[Y]es")
        println("[N]o")
        println("Would you like to see the game rules? ")

        var ruleChoice = readln()
        if (ruleChoice == "y") {
            println("Pinned \uD83D\uDCCC \n" +
                    "\n" +
                    "Game Setup \n" +
                    "\n" +
                    "A row of 16 squares, numbered 1 to 16 from left to right \n" +
                    "\n" +
                    "5 counters (total) are placed randomly on the board - 4 white and 1 black  \n" +
                    "\n" +
                    "Decide who goes first \n" +
                    "\n" +
                    "Gameplay \n" +
                    "\n" +
                    "Players take turns - You may not skip your turn \n" +
                    "\n" +
                    "On your turn you must do exactly one of the following: \n" +
                    "\n" +
                    "Slide any counter (black or white) any number of squares to the left, as long as no other counter is in the way and the destination square is empty, or… \n" +
                    "\n" +
                    "Remove the counter on square 1 (only if a counter is there) \n" +
                    "\n" +
                    "Win Condition \n" +
                    "\n" +
                    "The player who removes the black counter from square 1 wins \n" +
                    "\n" +
                    "Variant \n" +
                    "\n" +
                    "Counters can slide either left or right (but still can’t jump other counters) ")
            break
        }
        if (ruleChoice == "n") {
            break
        }

    }

    print("Enter your name player one: ")
    val player1 = readln()

    print("Enter your name player two: ")
    val player2 = readln()
    createCells()
    addCoins()
    showCells()

    while (true) {
        println("player one $player1's turn")
        println("[M]ove coin")
        println("[R]emove coin")
        print("? ")
        val player1Choice = readln()

        when (player1Choice) {
            "M" -> moveCoin()
            "m" -> moveCoin()
            "R" -> removeCoin()
            "r" -> removeCoin()
        }

        if (blackCell == 1) {
            println("|--------------------------------------------------|")
            println("|                                                  |")
            println("|${"you win ($player1) playerone".padEnd(length = 50)}|")
            println("|                                                  |")
            println("|--------------------------------------------------|")
            break


        }
        showCells()
        println("player two $player2's turn")
        println("[M]ove coin")
        println("[R]emove coin")
        print("? ")
        val player2Choice = readln()

        when (player2Choice) {
            "M" -> moveCoin()
            "m" -> moveCoin()
            "R" -> removeCoin()
            "r" -> removeCoin()
        }
        if (blackCell == 1){
            println("|--------------------------------------------------|")
            println("|                                                  |")
            println("|${"you win ($player2) playertwo".padEnd(length = 50)}|")
            println("|                                                  |")
            println("|--------------------------------------------------|")
            break


        }

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


fun addCoins() {
    val coin = "black"
    val index = (2..<16).random()
    cells[index] = coin

    while (true) {
        val coin = "white"
        val index = (0..<16).random()

        if (cells[index] == "...") {
            cells[index] = coin
        }

        // count coins added
        var count = 0
        for (cell in cells) {
            if (cell == coin) count++
        }

        // Have we got four now?
        if (count >= 4) break
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

fun removeCoin() {
    val index = 0
    if (cells[index] == "black") {
        blackCell = 1
    }
    if (cells[index] == "white") {
            cells[index] = "..."
        }


}



