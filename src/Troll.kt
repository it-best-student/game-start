class Troll {
    var hp = 120.0
    var attack = 30.0
    var expgive = 150.0

    fun lvlup (lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl
    }
}