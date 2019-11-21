class Vampire {
    var hp = 300.0
    var attack = 120.0
    var expgive = 260.0

    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl
    }
}