fun main(){
    var studentsMarks = mutableListOf(88,21,56,32,48,62)
    var arrayList = arrayListOf(1, 2, 3)
    var highest=studentsMarks[0]
    var lowest=studentsMarks[0]
    for(i in studentsMarks){

        //finding the highest marks
        if(i > highest){
            highest=i
        }
        //finding the lowest marks
        if(i < lowest){
            lowest=i
        }
    }
    println("Student marks :$studentsMarks")
    println("Highest value in the list :$highest" )
    println("Lowest value in the list :$lowest")

    SingletonExample.a = 20

    println(SingletonExample.a)
}