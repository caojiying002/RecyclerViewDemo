package com.example.recyclerview

data class Person(
    val name: String,
    val age: Int,
)

fun personList(): List<Person> {
    return listOf(
        Person("Alice", 20),
        Person("Bob", 21),
        Person("Charlie", 22),
        Person("David", 23),
        Person("Eve", 24),
        Person("Frank", 25),
        Person("Grace", 26),
        Person("Helen", 27),
        Person("Ivy", 28),
        Person("Jack", 29),
        Person("Kate", 30),
        Person("Lily", 31),
        Person("Mike", 32),
        Person("Nancy", 33),
        Person("Oscar", 34),
        Person("Peter", 35),
        Person("Queen", 36),
        Person("Rose", 37),
        Person("Sam", 38),
        Person("Tom", 39),
        Person("Ulysses", 40),
        Person("Vera", 41),
        Person("Will", 42),
        Person("Xavier", 43),
        Person("Yvonne", 44),
        Person("Zoe", 45),
    )
}
