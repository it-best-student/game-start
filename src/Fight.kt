//Класс для логики боя
class Fight {
//Использование классов
    var skeleton = Skeleton()
    var hero = Hero()
    var zombie = Zombie()
    var boss = Boss()
    //Заглушка базы данных для "корректной" работы
    var herohp = hero.hp
    var skeletonhp = skeleton.hp
    var zombiehp = zombie.hp
    var bosshp = boss.hp
    //Продолжении заглушки
    fun clearhp(){
        herohp = hero.hp
        skeletonhp = skeleton.hp
        zombiehp = zombie.hp
        bosshp = boss.hp
    }
    //Логика боя
    fun fight(enemy:Any){
        //выбор моба и передача его параметров
        var attackenemy = 0.0
        var hpenemy = 0.0
        var expenemy = 0.0
        when(enemy){
            zombie -> {attackenemy=zombie.attack; hpenemy=zombiehp; expenemy=zombie.expgive}
            skeleton -> {attackenemy=skeleton.attack; hpenemy=skeletonhp; expenemy=skeleton.expgive}
            boss -> {attackenemy=boss.attack; hpenemy=bosshp; expenemy=boss.expgive}
        }
        do {
            herohp -= attackenemy
            println(herohp)
            hpenemy -= hero.attack
            println(hpenemy)
        }while ((herohp>0.0) && (hpenemy>0.0))
        if (hpenemy<=0.0){
            hero.win(expenemy)
            println("Hero win $enemy, you get $expenemy, now you have ${hero.exp}")
        }
        clearhp()
    }
}