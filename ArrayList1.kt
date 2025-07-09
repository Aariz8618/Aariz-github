fun main() {
   var studentsName=ArrayList<String>()

    //adding the names in the list
    studentsName.add("ALEX")
    studentsName.add("RAHUL")
    studentsName.add("JOHN")
    studentsName.add("SAM")
    studentsName.add("ROHAN")

    println(studentsName)

    //removing the element from the list at index 1
    studentsName.removeAt(1)

    println("List after removing the second student")
    println(studentsName)


}
