fun main() {
        var supplies = arrayOf<String>("Hot Dogs", "Grill", "Stand", "Utensils", "Umbrella")
        var qty = arrayOf("36", "1", "1", "16", "1")
        var shop = arrayOf<Array<String>>()
        shop += supplies
        shop += qty

        var count:Int
        var rowCount = shop[0].size-1
        do {

                println("1)View stock\n" +
                        "2)Add/Subtract stock\n" +
                        "3)Exit\n")
                count = readln().toInt()
                if(count == 1){
                        for (i in 0..rowCount) {
                                println("${shop[0][i]} has a stock of ${shop[1][i]}")
                        }
                }
                if(count == 2){
                     println("What item are you changing(1,2,3,4, or 5): ")
                     var x = readln().toInt()-1
                     println("What is the new stock of this item: ")
                     var y = readln().toString()
                     shop[1][x] = y
                }

        }
        while(count < 3)
}