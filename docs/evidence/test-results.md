# Results of Testing

The test results show the actual outcome of the testing, following the [Test Plan](test-plan.md)

---

## The player can decide to read the instructions for the game. - Valid

The player can input y to receive the game instructions so that they can understand how to play the game.

### Test Data Used

Valid. I will try to enter y in order to agree to receiving the instructions.

### Test Result

![example.png](screenshots/instructions-test.gif)

Valid. The test was successful and I was able to receive and read the instructions.

---

## Player can input names. - VALID

I will test that the player is capable of entering their name into the program.

### Test Data used

I will try entering two separate names into the program "Ben" and "Ryder".

### Test Result

![example.png](screenshots/nameinput-test.gif)

Valid. I was able to input both names into the program.

---

## board can be set up - GAMEPLAY

Testing if the program can set up the board to play the game on.

### Test Data To Use

I will start the game to see if it can set up the board.

### Test Result

Gameplay. The test was successful and the program was able to set up the game board.

![example.png](screenshots/setup-test.gif)

---

## The players take turns - GAMEPLAY

This test makes sure that players can take turns.

### Test Data To Use

I will use my turn as player one and see if the program switches to player two afterwards.

### Test Result

Gameplay. The test was successful and the program was able to switch from player one to player two after player one had taken his turn.

![example.png](screenshots/turn-test.gif)

---

## Player can move coins - VALID

Testing that the player can move the black and white coins to progress the game.

### Test Data To Use

I input m to move and used numbers to decide what coin I wanted to go where on the grid.

### Test Result

valid. The test was successful and I was able to move the coins around the grid.

![example.png](screenshots/move-test.gif)

---


## Coin placement and removal - BOUNDARIES

testing that the program can move or remove values that are at the boundary of the valid range.

### Test Data Used

I used the move function to move one coin from cell 16 to cell 11 and removed a coin from cell one.

### Test Result

![example.png](screenshots/boundaryone-test.gif)


Valid The test was successful and the game worked.

---


## Player is able to win - GAMEPLAY

The player is able to win and beat the other player.

### Test Data used

I will remove the black coin from the grid as one of the players in order to win the game.

### Test Result

Gameplay. The test was successful and the player is able to win.

![example.png](screenshots/wintest-test.gif)
---





