//19000669
case class Point(x: Int, y: Int) {

    def +(newPoint: Point) = Point(this.x + newPoint.x, this.y + newPoint.y)

    def move(dx: Int, dy: Int) = Point(this.x + dx, this.y + dy)

    def distance(otherPoint: Point): Double = scala.math.sqrt((scala.math.pow((otherPoint.x - this.x), 2) + scala.math.pow((otherPoint.y - this.y), 2)))

    def invert() = Point(this.y, this.x)
}


object caseClass extends App {
    val point_a = Point(1, 2)
    val point_b = Point(8, 20)
    println("point 1 : ",point_a)
    println("point 2 : ",point_b)

    val sum_points = point_a+ point_b;
    println("sum of point 1 and point 2  : " + sum_points)

    val move_point = point_a.move(4, 4)
    println("move pont 1 by 4,4 : " + move_point)

    val invert_point= point_b.invert()
    println("invert of point 1 : " + invert_point)

    val distence_x_y = point_a.distance(point_b)
    println("distance between point 1 and point 2 : " + distence_x_y)

}