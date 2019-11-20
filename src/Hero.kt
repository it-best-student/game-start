class Hero {
//    Создаём базовые значения героя
    var hp = 100.0
    var attack = 30.0
    var exp = 0.0
    var lvl = 1
//    Получение опыта героем при убийстве
    fun win(expgive:Double){
        exp += expgive
        expup()
    }
    //Увеличение параметров героя при повышении уровня
    fun lvlup(){
        hp *= 2.0
        attack *= 2.0
        lvl += 1
        println("Hero lvlup $hp  $attack $exp $lvl")
    }
    //    Повышение уровня при достижении нужного кол-ва опыта
    fun expup(){
        if (exp>lvl*150){
            lvlup()
        }
    }
}