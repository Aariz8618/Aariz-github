/*
    {
        "studentName": "Rohit",
        "age": 17,
        "college": "Saboo Siddik"
    }
*/

// Declaring a data class named 'Student' with three properties
// 'data' keyword automatically generates toString(), equals(), hashCode(), and copy() methods
data class Student(
    val studentName: String,  // Name of the student
    val age: Int,             // Age of the student
    val college: String       // College name
)

// Main function – the entry point of the Kotlin program
fun main() {
    // Creating the first student object using the Student class
    val student1 = Student("Rohit", 17, "Saboo Siddik")

    // Creating the second student object with different name but same age and college
    val student2 = Student("Zaki", 17, "Saboo Siddik")

    // Printing the first student object – uses auto-generated toString() from data class
    println(student1)

    // Printing the second student object
    println(student2)
}
