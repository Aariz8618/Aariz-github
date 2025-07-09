fun main(){
    val data = mutableMapOf("Alice" to "pass@123", "Rohit" to "rohit9087", "Sam" to "sam232")
    while(true){
        println("=== Simple Authentication System ===")
        println("1.Login")
        println("2.Reset you password")
        println("3.Exit")
        println("Enter your choice: ")
        when(readLine()){
            "1" -> {
                println("Enter your username: ")
                val username = readLine()
                println("Enter yout pasword: ")
                val password = readLine()
                if(username!= null && password!= null && data[username] == password){
                    println("Login Successfull")
                }else{
                    println("Invalid username or password")
                }

            }
            "2" -> {
                println("Enter your username: ")
                val username = readLine()
                if (username!= null && data.containsKey(username)){
                    println("Enter new password: ")
                    val pass = readLine()
                    if (pass!= null ){
                        data[username] = pass
                        println("Password updated")
                    }else{
                        println("Password cannot be null")
                    }
                } else{
                    println("Invalid username")
                }
            }
            "3" -> {
                println("Exiting from the system")
                break
            }
            else -> println("Invalid choice")
        }
    }
}
