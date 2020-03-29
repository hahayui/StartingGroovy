package com.eliankurtev.closures

def c = {}

println c.class.name
println c instanceof Closure

def sayHello = { name->
    println "Hello, $name"
}
sayHello("Elian")

List nums = [1,2,3,4,5,6,30,58,29]
nums.each { num ->
    println num
}
//Closures are objects & last params

def timesTen(num,closure){
    closure(num*10)
}
timesTen(10,{
    println it
})
timesTen(2){
    println it
}
10.times {
    println it
}
import java.util.Random

Random rand = new Random()

3. times {
    println rand.nextInt()
}