package com.eliankurtev.params
def foo ={
    println it
}

foo("Elian")

def noparams ={ ->
    println "no params..."
}
noparams()

def sayHello ={
    String first, String last ->
        println "Hello, $first $last"
}
sayHello("Elian", "Kurtev")

//Default values
def greet ={
    String name, String greetings ="Bye" ->
        println "$greetings, $name"
}
greet(" Elian", "Hello")
greet("Elian")

//var-arg

def concat ={
    String... args->
        args.join(" ")
}
println concat ("E","l", "i","a", "n")

def someMethod (Closure c){
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure={
    int x , int y ->
        x+y
}
someMethod(someClosure)