class Griffon {
    var hp = 80
    var attack = 38
    var expgive = 200.0
    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl

    }
}