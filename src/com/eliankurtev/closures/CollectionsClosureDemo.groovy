package com.eliankurtev.closures

List favNums = [8, 9, 6, 5, 4, 13]

for (num in favNums) {
    println num
}
println "------------------------------"

favNums.each { println it }

for (int i = 0; i < favNums.size(); ++i) {
    println "$i:${favNums[i]}"
}

println "------------------------------"
favNums.eachWithIndex { int num, int i -> println "$i:$num" }

//findAll
List days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"]
List weekend = days.findAll({
    it.startsWith("S")
})
println days
println weekend

List nums = [1,2,2,2,7,2,3,6,5,7,8,9]
List numsTimesTen = []

nums.each {
    num->
        numsTimesTen << num *10
}

List newTimesTen = nums.collect {
    num ->
        num*10
}
println nums
println numsTimesTen
println newTimesTen