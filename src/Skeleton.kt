class Skeleton {
    //    Базовые параметры моба
    var hp = 30.0
    var attack = 15.0
    var expgive = 50.0
    //    Параметры моба в зависимости от уровня
    fun lvlup(lvl:Int) {
        hp *= lvl
        attack *= lvl
        expgive *= lvl
    }

}