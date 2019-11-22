class Griffon {
    var hp = 80.0
    var attack = 38.0
    var expgive = 200.0
    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl

    }
}