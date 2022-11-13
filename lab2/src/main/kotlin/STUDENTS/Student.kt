package STUDENTS

abstract class Student(val group:GROUPS)
{

    abstract fun goToClass()

    open fun doHomework()
    {
        println("Do all the homework")
    }

    enum class GROUPS(){
        I219a, I219b, I219g, I219d
    }
}