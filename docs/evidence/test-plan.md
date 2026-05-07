# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## The player can read the instructions for the game. - Valid

The player can ask for the game instructions so that they can understand how to play the game.

### Test Data Used

I will try to enter y in order to agree to receiving the instructions.

### expected Test Result


I expect to be able to receive the game rules.

---

## Player can input names. - Valid

I will test that the player is capable of entering their name into the program.

### Test Data used

I will try entering two separate names into the program "Ben" and "Ryder".

### expected Test Result


I expect to be able to input both names into the program.

---

## board can be set up - Gameplay

Testing if the program can set up the board to play the game on.

### Test Data To Use

I will start the game to see if it can set up the board.

### expected Test Result

I expect the program will be able to set up the game board.


---

## The players take turns - Gameplay

This test makes sure that players can take turns.

### Test Data To Use

I will use my turn as player one and see if the program switches to player two afterwards.

### expected Test Result

I expect the players will be able to take turns while playing the game.


---

## Player can move coins - Valid

Testing that the player can move the black and white coins to progress the game.

### Test Data To Use

I input m to move and used numbers to decide what coin I wanted to go where on the grid.

### expected Test Result

I expect to be able to use the move function to move the coins around the grid.


---

## coin placement and removal test - Boundaries

testing that the program can move or remove values that are at the boundary of the valid range.

### Test Data Used

I used the move function to move one coin from 16 and removed a coin from cell one.

### expected Test Result


I expect the move function to work so I can move the coin on the boundaries of the valid cells.

---



## Player is able to win. - Gameplay

The player is able to win and beat the other player.

### Test Data used

I will remove the black coin from the grid as one of the players in order to win the game.

### expected Test Result

I expect to be able to win by removing the black coin.

---






