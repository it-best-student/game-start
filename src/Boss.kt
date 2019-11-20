class Boss {
    var hp = 100.0
    var attack = 50.0
    var expgive = 300.0

    fun lvlup(lvl:Int) {
        hp = hp*lvl
        attack = attack * lvl
        expgive=expgive*lvl
    }
}