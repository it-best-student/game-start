import kotlin.random.Random

class Arena {
    var dataBase = DataBase()
    var fight = Fight()
    //    Made array with all enemies without Boss (7 enemies)
    var arrayEnemies = arrayOf(
        fight.dataBase.fairy,
        fight.dataBase.frozen,
        fight.dataBase.griffon,
        fight.dataBase.skeleton,
        fight.dataBase.troll,
        fight.dataBase.zombie,
        fight.dataBase.vampire
    )
    var arrayLvlMap: Array<Any> = Array(100, { "_" })
    //  Made function for random (why not usual var? because we need every time to get a new value)

    fun randomChoosePosition(): Int {
        var randomChoosePosition = Random.nextInt(2, 96)
        return randomChoosePosition
    }

    //  Made function for random (why not usual var? because we need every time to get a new value)
    fun randomChooseEnemy(): Int {
        var randomChooseEnemy = Random.nextInt(0, 7)
        return randomChooseEnemy
    }

    //Made function for filling out our arena
    fun makeArena() {
        for (i in 0..25) {
            arrayLvlMap[randomChoosePosition()] = arrayEnemies[randomChooseEnemy()]
        }
    }

    //    Made logic of meet
    fun meetEnemy() {
        makeArena()
        var i = 0
        do {
            arrayLvlMap[i] = dataBase.hero
            for(schetchik in arrayLvlMap){
                print("$schetchik \t")
            }
            println()
            println("Enter right(r) to move right and fight")
            println("Enter stats(s) if you want see your stats")
            var enter = readLine()
            when (enter) {
                "r", "R", "right", "Right" -> {
                    if (arrayLvlMap[i + 1] == "_") {
                        arrayLvlMap[i + 1] = dataBase.hero
                        arrayLvlMap[i]="_"
                    } else {
                        fight.fight(arrayLvlMap[i+1])
                        arrayLvlMap[i + 1] = dataBase.hero
                        arrayLvlMap[i]="_"
                    }
                }
                "s", "S", "stats", "Stats" -> {println(dataBase.hero.stats()); --i}
            }
            ++i
        } while (i<100)

    }
}
