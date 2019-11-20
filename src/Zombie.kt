class Zombie {
    //    Базовые параметры моба
    var hp = 50.0
    var attack = 25.0
    var expgive = 100.0
    //    Параметры моба в зависимости от уровня
    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl
    }

}