class Hero {
    var hp = 100.0
    var attack = 30.0
    var exp = 0.0
    var lvl = 1
    fun win(expgive:Double){
        exp=exp+expgive
        expup()
    }
    fun lvlup(){
        hp=hp*2.0
        attack=attack*2.0
        lvl=lvl+1
        println("Hero lvlup $hp  $attack $exp $lvl")
    }
    fun expup(){
        if (exp>lvl*150){
            lvlup()
        }
    }
}