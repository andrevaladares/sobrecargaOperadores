@groovy.transform.ToString
class Account {
    BigDecimal balance = 0.0
    String type
    
    void deposit(BigDecimal value){
        balance+=value
    }
    
    void withDraw(BigDecimal value){
        balance-=value
    }

    BigDecimal plus(Account other){
        balance:balance+other.balance
    }
}    

Account checking = new Account(type:"Checking")
checking.deposit(100.00)
Account savings = new Account(type:"Savings")
savings.deposit(50.00)


println checking
println savings

BigDecimal total = checking + savings
println total