package STUDENTS

fun main()
{
    val Alex = Boy(Student.GROUPS.I219a,true,5)
    val Josh = Boy(Student.GROUPS.I219b,false,2)
    val boys = listOf(Alex,Josh)

    for(i in boys.indices)
    {
        boys[i].studentInfo()
    }

    boys.forEach{
        it.getAGrade()
    }

}