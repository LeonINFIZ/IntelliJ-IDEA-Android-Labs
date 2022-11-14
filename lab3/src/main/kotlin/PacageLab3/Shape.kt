package PacageLab3

sealed interface Shape{

    companion object{ // Статические объекты
        var RectangleCount: Int = 0
        var OvalCount: Int = 0
        var LineCount: Int = 0
    }

    // init - конструктор инициализатор
    class Rectangle(side1:Int, side2:Int):Shape{init{ RectangleCount++ }}
    class Oval(line1:Int, line2:Int):Shape{init{ OvalCount++ }}
    class Line(line:Int):Shape{init{ LineCount++ }}

}