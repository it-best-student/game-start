class Boss {
    //    Базовые параметры моба
    var hp = 100.0
    var attack = 50.0
    var expgive = 300.0
    //    Параметры моба в зависимости от уровня
    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl
    }
}