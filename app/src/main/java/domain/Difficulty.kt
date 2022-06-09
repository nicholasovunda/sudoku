package domain

enum class Difficulty(val modifier: Double) {
    EASY(modifier = 0.50),
    MEDIUM(0.44),
    HARD(0.38)
}