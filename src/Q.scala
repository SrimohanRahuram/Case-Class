case class Point( a:Int , b:Int ){

  def x:Int = a
  def y:Int = b

  def +( that:Point) : Point = Point( this.x + that.x , this.y + that.y )

  def move( dx : Int , dy : Int ) :Point = Point( this.x + dx , this.y + dy )

  def distanceBetween( that : Point ) : Double = math.sqrt( math.pow( ( this.x - that.x ) , 2) + math.pow( ( this.y - that.y) , 2))

  def invert : Point = Point( this.y , this.x )

}
object usingCaseClass extends App{

  val p1 = Point( 5 , 2)
  val p2 = Point( 4 , 6 )
  val p3 = Point( 9 , 13)
  val p4 = p1.copy()
  val p5 = p1.copy( b = 6 )
  val p6 = Point( 11 , 8 )
  val p7 = Point( 29 , 7 )

  println(p1 == p4)
  println(p1 == p5)
  println( p2 + p3 )
  println( p1.move( 18 , 27 ) )
  println( p1.distanceBetween(p7) )
  println( p2.invert )

}