class student(var name: String, var rollNo: Int, var marks: Map<String, Int>) {
    var total: Int = 0
    var average: Double = 0.0
    var grade: String = ""

    fun calculateTotalAndAverage() {
        total = marks.values.sum()
        val avg = total.toDouble() / marks.size
        average = String.format("%.2f", avg).toDouble()
    }

    fun assignGrade() {
        grade = when {
            average >= 90 -> "A+"
            average >= 80 -> "A"
            average >= 70 -> "B"
            average >= 50 -> "C"
            average >= 35 -> "D"
            else -> "F"
        }
    }

    fun generateReport() {
        calculateTotalAndAverage()
        assignGrade()
        println("=== Student Report ===")
        println("Name: $name")
        println("Roll No: $rollNo")
        println("Subject Marks:")
        marks.forEach { (subject, mark) -> println("$subject: $mark") }
        println("Total: $total")
        println("Average: $average")
        println("Grade: $grade")
    }
}

fun sortStudentsByAverage(students: List<student>): List<student> {
    return students.sortedByDescending { it.average }
}

fun main() {
    val s1 = student("Alice", 1, mapOf("Math" to 90, "Science" to 85, "English" to 80))
    val s2 = student("Bob", 2, mapOf("Math" to 70, "Science" to 60, "English" to 65))
    val s3 = student("Charlie", 3, mapOf("Math" to 30, "Science" to 40, "English" to 35))

    val students = listOf(s1, s2, s3)

    students.forEach { it.generateReport() }

    println("\n=== Students Sorted by Average ===")
    val sortedStudents = sortStudentsByAverage(students)
    sortedStudents.forEachIndexed { index, stu -> println("${index + 1}. ${stu.name} - Average: ${stu.average}, Grade: ${stu.grade}")
    }
}
