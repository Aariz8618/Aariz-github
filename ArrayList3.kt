fun main(){
    val studentMarks = arrayListOf(87,98,34,77,31,40,61,28,90,22)
    val failedStudents = ArrayList<Int>()
    val passedStudents = ArrayList<Int>()

    //METHOD 1
    for (i in studentMarks){
        if (i<40){
            failedStudents.add(i)
        }else{
            passedStudents.add(i)
        }
    }
    println("Failed students: $failedStudents")
    println("Passed students: $passedStudents")

    println("========================================")

    //METHOD 2
    val failStud = studentMarks.filter { it < 40 }
    val pasStud = studentMarks.filter { it >= 40 }
    println("Failed Students:$failStud ")
    println("Passed Students: $pasStud ")

}