package STUDENTS

class Girl(group: GROUPS, private val doHomework:Boolean, private val grade:Int): Student(group), toStudy {


    override fun goToClass() {
    }

    override fun doHomework() {
        if(doHomework)
            super.doHomework()
        else
            println("Don't do homework")
    }

    override fun getAGrade() {
        println("Get grade $grade")
    }


    fun studentInfo()
    {
        println("Group: $group, Do homework? - $doHomework, Grade = $grade")
    }

}