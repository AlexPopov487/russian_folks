fun main() {
    val likes = 2352
    if (likes == 0) {
        println("Никому не понравилось")
    } else if (likes % 100 == 11 || likes == 11){
        println("Понравилось $likes людям")
    } else if (likes % 10 == 1) {
        println("Понравилось $likes человеку")
    } else {
        println("Понравилось $likes людям")
    }
}

