class DataBase {
    var skeleton = Skeleton()
    var hero = Hero()
    var zombie = Zombie()
    var boss = Boss()
    var vampire = Vampire()
    var fairy = Fairy()
    var frozen = Frozen()
    var griffon = Griffon()
    var troll = Troll()
    //Заглушка базы данных для "корректной" работы
    var vampirehp = vampire.hp
    var fairyhp = fairy.hp
    var frozenhp = frozen.hp
    var griffonhp = griffon.hp
    var trollhp = troll.hp
    var herohp = hero.hp
    var skeletonhp = skeleton.hp
    var zombiehp = zombie.hp
    var bosshp = boss.hp
    //Продолжении заглушки
    fun clearhp(){
        vampirehp = vampire.hp
        fairyhp = fairy.hp
        frozenhp = frozen.hp
        griffonhp = griffon.hp
        trollhp = troll.hp
        herohp = hero.hp
        skeletonhp = skeleton.hp
        zombiehp = zombie.hp
        bosshp = boss.hp
    }
}