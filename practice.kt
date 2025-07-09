fun main(){
    var studentNames=ArrayList<String>()
    studentNames.add("karan")
    studentNames.add("rohan")
    studentNames.add("mohan")
    studentNames.add("rohit")
    studentNames.add("virat")
    println(studentNames)
    studentNames.removeAt(1)
    println(studentNames)
println("=====================================")

    var marks= mutableListOf(23,45,67,65,40,35,36,12,98,56)
    var highest=marks[0]
    var lowest=marks[0]
    for (i in marks){
        if (i>highest){
            highest=i
        }
        if (i<lowest){
            lowest=i
        }
    }
    println("Highest marks :$highest")
    println("Lowest marks :$lowest")
    println("=====================================")

    var cities= arrayListOf("mumbai","delhi","bengaluru","kolkata","pune")
    println(cities)
    cities.add(2,"hyderabad")
    println(cities)
    cities[4]="pune"
    println(cities)
    println("=====================================")

    var studentMarks= arrayListOf(34,66,67,23,87,87,34,99,23,57)
    println("Passed students:")
    for (i in studentMarks){
        if(i > 40){
            println(i)
        }
    }
    println("=====================================")

    var names= arrayListOf("sujit","sumit","alex","mohan","neha")
    var len=ArrayList<Int>()
    for (i in names){
        var nl= i.length
        len.add(nl)
    }
    println("Original list :$names")
    println("Length of the names :$len")


}
