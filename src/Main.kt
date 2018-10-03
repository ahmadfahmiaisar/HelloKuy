fun main(args: Array<String>) {
    val items = arrayOf(1,2,3,4, "coba", 6.0)
    for (i in items){
        when (i){
            is Int -> println("$i ini integer")
            is String -> println("$i ini string")
            is Float -> println("$i ini float")
            
        }
    }
}