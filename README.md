# 🎯 Number Guessing Game

A simple **console-based Number Guessing Game built using Java**. The player chooses a difficulty level, and the computer generates a random number within the selected range. The player then attempts to guess the number while receiving hints after each incorrect guess.

The game also keeps track of the number of attempts taken to find the correct number.

## 📌 About the Project

The **Number Guessing Game** is a beginner-friendly Java project designed to demonstrate fundamental programming concepts such as:

* User input using `Scanner`
* Random number generation using `Random`
* `switch` expressions
* `while` loops
* `if-else` conditional statements
* Variables and counters
* Console-based interaction

The project also introduces **difficulty levels**, allowing the player to choose between three different number ranges.

## ✨ Features

* 🎚️ **Three difficulty levels**

  * 🟢 Easy — numbers from **1 to 10**
  * 🟡 Medium — numbers from **1 to 50**
  * 🔴 Hard — numbers from **1 to 100**
* 🎲 Randomly generates a target number based on the selected difficulty
* ⌨️ Accepts guesses from the player
* 📉 Displays **"Too low!"** when the guess is smaller than the target
* 📈 Displays **"Too high!"** when the guess is larger than the target
* 🏆 Displays a congratulatory message when the correct number is guessed
* 🔢 Counts the number of attempts
* ❌ Handles invalid difficulty selections
* 🔄 Continues the game until the correct number is guessed

## 🛠️ Technologies Used

* **Java**
* `java.util.Scanner`
* `java.util.Random`

## 📂 Project Structure

```text
Number-Guessing-Game/
│
├── NumGame.java
└── README.md
```

### `NumGame.java`

This file contains the complete game implementation, including:

1. Difficulty selection
2. Number range configuration
3. Random target number generation
4. User input handling
5. Guess comparison
6. Hint generation
7. Attempt counting
8. Winning message

## 🚀 Getting Started

### Prerequisites

Make sure **Java 17 or later** is installed on your system because the program uses modern Java `switch` syntax.

Check your Java version:

```bash
java -version
```

Check that the Java compiler is available:

```bash
javac -version
```

## 💻 Installation

### 1. Clone the Repository

```bash
git clone https://github.com/Gautham-2304/Number-Guessing-Game.git
```

### 2. Navigate to the Project Directory

```bash
cd Number-Guessing-Game
```

### 3. Compile the Program

```bash
javac NumGame.java
```

### 4. Run the Game

```bash
java NumGame
```

## 🎮 How to Play

When the program starts, you will be asked to choose a difficulty level:

```text
Choose a difficulty level:
1. Easy (1-10)
2. Medium (1-50)
3. Hard (1-100)
Enter difficulty level:
```

Enter:

* `1` for **Easy**
* `2` for **Medium**
* `3` for **Hard**

The computer will then randomly generate a number within the selected range.

Enter your guesses until you find the correct number.

### Example

```text
Choose a difficulty level:
1. Easy (1-10)
2. Medium (1-50)
3. Hard (1-100)
Enter difficulty level: 2

Welcome to the Number Guessing Game!
The number ranges from 1 to 50. Try to guess the number in as few attempts as possible.

Enter your guess: 25
Too low! Try again.

Enter your guess: 40
Too high! Try again.

Enter your guess: 32
Congratulations! You've guessed the number 32 in 3 attempts.

Thank you for playing the Number Guessing Game!
```

## 🧠 How the Program Works

### 1. Initialize Input and Random Number Generator

The program creates a `Scanner` object to read user input and a `Random` object to generate the target number.

```java
Scanner sc = new Scanner(System.in);
Random rand = new Random();
```

### 2. Select Difficulty

The player chooses one of three difficulty levels.

```java
switch (difficulty) {
    case 1 -> maxNumber = 10;
    case 2 -> maxNumber = 50;
    case 3 -> maxNumber = 100;
}
```

The selected difficulty determines the maximum possible number.

### 3. Generate the Target Number

The target number is randomly generated between `1` and the selected maximum number.

```java
target = rand.nextInt(maxNumber) + 1;
```

For example:

| Difficulty | Range |
| ---------- | ----- |
| Easy       | 1–10  |
| Medium     | 1–50  |
| Hard       | 1–100 |

### 4. Take User Guesses

The program repeatedly asks the player to enter a number.

```java
while (guess != target) {
    System.out.print("\nEnter your guess: ");
    guess = sc.nextInt();
    count++;
}
```

The attempt counter increases after every guess.

### 5. Provide Hints

The program compares the player's guess with the target number.

```java
if (guess == target) {
    // Correct guess
} else if (guess < target) {
    // Too low
} else {
    // Too high
}
```

This allows the player to gradually narrow down the possible answer.

## 🎚️ Difficulty Levels

| Level     | Number Range | Description        |
| --------- | -----------: | ------------------ |
| 🟢 Easy   |         1–10 | Best for beginners |
| 🟡 Medium |         1–50 | Moderate challenge |
| 🔴 Hard   |        1–100 | More challenging   |

The difficulty affects the **range of possible numbers**, but it does not currently impose a maximum number of attempts.

## 📚 Java Concepts Demonstrated

| Concept             | Usage                             |
| ------------------- | --------------------------------- |
| `Scanner`           | Reading input from the player     |
| `Random`            | Generating a random target number |
| `switch` expression | Selecting difficulty              |
| `while` loop        | Repeating guesses                 |
| `if-else`           | Comparing guesses                 |
| Variables           | Storing game information          |
| Counter             | Tracking attempts                 |
| `printf()`          | Formatting the winning message    |
| Console I/O         | Interacting with the player       |

## ⚠️ Input Handling

The program currently handles an **invalid difficulty number** such as `4` or `0`:

```text
Invalid difficulty level!
```

However, entering non-numeric input such as:

```text
Enter difficulty level: abc
```

will cause a `java.util.InputMismatchException`.

Similarly, entering non-numeric input when guessing will cause the same issue.

This could be improved in a future version by adding proper input validation.

## 🔮 Future Improvements

Possible improvements include:

* 🏅 Add a scoring system
* ❤️ Add a maximum number of attempts
* 🔁 Add an option to play multiple rounds
* 📊 Track statistics across multiple games
* 🥇 Add a high-score system
* 🛡️ Add input validation
* 💡 Provide hints based on the remaining range
* ⏱️ Add a timer
* 🎯 Allow the player to select a custom range

## 👨‍💻 Author

**Gautham**

GitHub: [@Gautham-2304](https://github.com/Gautham-2304)

## 📄 License

This project is created for **learning and educational purposes**.
