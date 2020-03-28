package com.eliankurtev.classes
Developer nullDev = null
Developer d = new Developer()
d.first = "Elian"
d.setLast("Kurtev")
d.work()
//assigning languages
d.languages << "Groovy"
d.languages << "Java"
/*Ternary operator
* Should return False since "Test" is not part of the array
* */
d.languages.contains("Java") ? println("True") : println("False")
/*Elvis operator
* Should return False because the nullDev is a null.
* */
String language
language = nullDev ?: "False"
println("Elvis result: $language")
