package PacageLab3

fun main()
{

    val figure1 = Figure(10, 10)
    val figure2 = Figure(10, 5)
    val figure3 = Figure(10, 2)

    val ourFigures = listOf(figure1, figure2, figure3)

    var sumFigures = 0
    ourFigures.forEach(){
        sumFigures+=it.area
    }

    println("The area of figure 1+2+3 is: "+sumFigures+"\n")


    val s1 = Shape.Rectangle(1,2)

    val s2 = Shape.Oval(3,4)
    val s3 = Shape.Oval(5,6)

    val s4 = Shape.Line(7)
    val s5 = Shape.Line(8)
    val s6 = Shape.Line(9)

    println("From init{}")
    println("Rectangle: "+Shape.RectangleCount)
    println("Oval: "+Shape.OvalCount)
    println("Line: "+Shape.LineCount)


    val Shapes = listOf(s1,s2,s3,s4,s5,s6)

    val RectangleCount_2: Int = Shapes.filterIsInstance<Shape.Rectangle>().count()
    val OvalCount_2: Int = Shapes.filterIsInstance<Shape.Oval>().count()
    val LineCount_2: Int = Shapes.filterIsInstance<Shape.Line>().count()

    println("\nFrom filters")
    println("Rectangle: "+RectangleCount_2)
    println("Oval: "+OvalCount_2)
    println("Line: "+LineCount_2)

    var RectangleCount_3: Int = 0
    var OvalCount_3: Int = 0
    var LineCount_3: Int = 0

    Shapes.forEach{
        when(it){
            is Shape.Line -> LineCount_3++
            is Shape.Oval -> OvalCount_3++
            is Shape.Rectangle -> RectangleCount_3++
        }
    }

    println("\nFrom when")
    println("Rectangle: "+RectangleCount_3)
    println("Oval: "+OvalCount_3)
    println("Line: "+LineCount_3)

}
