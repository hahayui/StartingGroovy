package com.eliankurtev.exercise42

Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type:"Saving")
savings.deposit(50.00)

println checking
println savings
BigDecimal total = checking+savings
println total