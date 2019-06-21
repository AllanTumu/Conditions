fun main (args:Array<String>){
    //input
    println("Input your marks")
    var marks:Int?
    marks = readLine()!!.toInt()

    println("Input your marks 1")
    var marks1:Int?
    marks1 = readLine()!!.toInt()

    //process
    if (marks>95 && marks1>80){
        println("Excellent")
    }
    else {
        println("tried")
    }
}