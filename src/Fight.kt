//Класс для логики боя
class Fight {
    //Использование классов
    var dataBase = DataBase()
    //Логика боя
    fun fight(enemy:Any){
        //выбор моба и передача его параметров
        var attackenemy = 0.0
        var hpenemy = 0.0
        var expenemy = 0.0
        when(enemy){
            dataBase.zombie -> {attackenemy=dataBase.zombie.attack; hpenemy=dataBase.zombiehp; expenemy=dataBase.zombie.expgive}
            dataBase.skeleton -> {attackenemy=dataBase.skeleton.attack; hpenemy=dataBase.skeletonhp; expenemy=dataBase.skeleton.expgive}
            dataBase.boss -> {attackenemy=dataBase.boss.attack; hpenemy=dataBase.bosshp; expenemy=dataBase.boss.expgive}
            dataBase.fairy -> {attackenemy=dataBase.fairy.attack; hpenemy=dataBase.fairyhp; expenemy=dataBase.fairy.expgive}
            dataBase.frozen -> {attackenemy=dataBase.frozen.attack; hpenemy=dataBase.frozenhp; expenemy=dataBase.frozen.expegive}
            dataBase.griffon -> {attackenemy=dataBase.griffon.attack; hpenemy=dataBase.griffonhp; expenemy=dataBase.griffon.expgive}
            dataBase.troll -> {attackenemy=dataBase.troll.attack; hpenemy=dataBase.trollhp; expenemy=dataBase.troll.expgive}
            dataBase.vampire -> {attackenemy=dataBase.vampire.attack; hpenemy=dataBase.vampirehp; expenemy=dataBase.vampire.expgive}
        }
        do {
            dataBase.herohp -= attackenemy
            println(dataBase.herohp)
            hpenemy -= dataBase.hero.attack
            println(hpenemy)
        }while ((dataBase.herohp>0.0) && (hpenemy>0.0))
        if (hpenemy<=0.0){
            dataBase.hero.win(expenemy)
            println("Hero win $enemy, you get $expenemy, now you have ${dataBase.hero.exp}")
        }
        dataBase.clearhp()
    }
}