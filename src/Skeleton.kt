class Skeleton {
    var hp = 30.0
    var attack = 15.0
    var expgive = 50.0

    fun lvlup(lvl:Int) {
        hp = hp*lvl
        attack = attack * lvl
        expgive=expgive*lvl
    }

}