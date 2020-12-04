fun main() {
    val likes = 0
    if (likes == 0) {
        println("Никому не понравилось")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}

