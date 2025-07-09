open class BankAccount( val accountNumber: String, val holderName: String, var balance: Double) {

    open fun deposit(amount: Double?) {
        if (amount != null && amount > 0) {
            balance += amount
            println("Balance after deposit: $balance")
        } else {
            println("Invalid amount")
        }
    }

    open fun withdraw(amount: Double?) {
        if (balance > 0 && amount != null && amount > 0 && amount <= balance) {
            balance -= amount
            println("Balance after withdrawal: $balance")
        } else {
            println("Insufficient balance or Invalid amount")
        }
    }

    open fun displayBalance() {
        println("AccountNumber: $accountNumber")
        println("Name: $holderName")
        println("Balance: $balance")
    }
}

    open class SavingAccount(accountNumber: String, holderName: String, balance: Double, val interestRate: Double): BankAccount(accountNumber, holderName, balance){

        open fun addInterest(){
            var interest = balance * (interestRate/100)
            balance+= interest
            println("Balance after adding interest: $balance ")
        }

        override fun displayBalance() {
            println("=====Saving Account Information=====")
            super.displayBalance()
        }
    }

    open class CurrentAccount(accountNumber: String, holderName: String, balance: Double, private var overDraftLimit: Double): BankAccount(accountNumber, holderName, balance){

        override fun withdraw(amount: Double?){
            if (amount != null && amount > 0 && amount > balance){
               balance+= overDraftLimit
               balance-= amount
               println("Balance after withdrawal(includes overdraft): $balance")
            }else if (amount != null && amount > 0 && amount <= balance ){
                balance-= amount
                println("Balance after withdrawal: $balance")
            }else{
                println("Invalid amount")
            }
        }

        override fun displayBalance() {
            println("=====Current Account Information=====")
            super.displayBalance()
        }
    }
fun main(){
    val acc1 = BankAccount("POHK9234", "John", 7000.0)
    val acc2 = SavingAccount("SAG23498", "Alex", 10000.0, 4.5)
    val acc3 = CurrentAccount("NHFG6567", "Sam", 8000.0, 2500.0)

    acc1.deposit(3000.0)
    acc1.withdraw(4000.0)
    acc1.displayBalance()
    println("\n")
    acc2.deposit(2500.0)
    acc2.addInterest()
    acc2.withdraw(3000.0)
    acc2.displayBalance()
    println("\n")
    acc3.deposit(3000.0)
    acc3.withdraw(5000.0)
    acc3.withdraw(6500.0)
    acc3.displayBalance()
}
