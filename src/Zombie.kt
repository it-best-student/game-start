class Zombie {
    var hp = 50.0
    var attack = 25.0
    var expgive = 100.0

    fun lvlup(lvl:Int) {
        hp = hp*lvl
        attack = attack * lvl
        expgive=expgive*lvl
    }

}