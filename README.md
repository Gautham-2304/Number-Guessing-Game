# 🎯 Number Guessing Game

A simple **console-based Number Guessing Game built with Java**. The program generates a random number between **1 and 100**, and the player has to guess the number. After every incorrect guess, the game provides a hint indicating whether the guessed number is too high or too low.

The game continues until the correct number is guessed and displays the total number of attempts taken.

## 📌 About the Project

This project is a beginner-friendly Java application designed to practice fundamental programming concepts such as:

* User input using `Scanner`
* Random number generation using `Random`
* `while` loops
* `if-else` conditional statements
* Variables and counters
* Console-based user interaction

## ✨ Features

* 🎲 Generates a random number between **1 and 100**
* ⌨️ Accepts guesses from the user through the console
* 📉 Displays **"Too low!"** when the guess is smaller than the target
* 📈 Displays **"Too high!"** when the guess is larger than the target
* 🏆 Displays a congratulatory message when the correct number is guessed
* 🔢 Tracks and displays the number of attempts
* 🔄 Continues until the correct number is found

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

Contains the complete game logic, including:

1. Generating the random target number
2. Reading user guesses
3. Comparing the guess with the target
4. Providing hints
5. Counting the number of attempts
6. Displaying the final result

## 🚀 Getting Started

### Prerequisites

Make sure you have **Java JDK** installed on your system.

You can verify your Java installation using:

```bash
java -version
```

You should also have access to the Java compiler:

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

### 3. Compile the Java Program

```bash
javac NumGame.java
```

### 4. Run the Game

```bash
java NumGame
```

## 🎮 How to Play

1. Start the program.
2. The computer randomly selects a number between **1 and 100**.
3. Enter your guess when prompted.
4. The game provides a hint:

   * **Too low!** → Your guess is smaller than the target.
   * **Too high!** → Your guess is larger than the target.
5. Continue guessing until you find the correct number.
6. The game displays the number of attempts you needed.

## 🖥️ Example Gameplay

```text
Welcome to the Number Guessing Game!
The number ranges from 1 to 100. Try to guess the number in as few attempts as possible.

Enter your guess: 50

Too low! Try again.

Enter your guess: 75

Too high! Try again.

Enter your guess: 63

Congratulations! You've guessed the number 63 in 3 attempts.

Thank you for playing the Number Guessing Game!
```

## 🧠 How the Program Works

The program uses Java's `Random` class to generate the target number:

```java
Random rand = new Random();
int target = rand.nextInt(1, 101);
```

A `while` loop keeps the game running until the user's guess matches the target:

```java
while (guess != target) {
    // Take user input
    // Compare guess with target
    // Display appropriate hint
}
```

The program then uses conditional statements to determine whether the guess is correct, too low, or too high.

An attempt counter keeps track of how many guesses the player has made.

## 📚 Concepts Demonstrated

| Concept      | Usage                               |
| ------------ | ----------------------------------- |
| `Scanner`    | Reading user input                  |
| `Random`     | Generating the target number        |
| `while` loop | Repeating the guessing process      |
| `if-else`    | Comparing the guess with the target |
| Variables    | Storing game data                   |
| Counter      | Tracking attempts                   |
| Console I/O  | Interacting with the player         |

## 🔮 Possible Future Improvements

Some features that could be added in future versions:

* 🎚️ Difficulty levels
* ❤️ Maximum number of attempts
* 🏅 High-score system
* 🔁 Option to play multiple rounds
* 🛡️ Input validation for invalid/non-numeric input
* 📊 Statistics showing previous game performance
* 🎯 Custom number ranges

## 👨‍💻 Author

**Gautham**

GitHub: [@Gautham-2304](https://github.com/Gautham-2304)

## 📄 License

This project is open for learning and educational purposes.
