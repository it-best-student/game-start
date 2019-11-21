class Fairy {
    var hp = 50.0
    var attack = 30.0
    var expgive = 65.0
    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl
    }
}