object caseclass extends App{
  val k1 = new Point(1,3);
  val k2 = new Point(6,7);

  val k3 = k1 + k2
  val k4 = k1.move(1,4)
  println("Addition:"+k3)
  println("Move:" +k4)
  val k6 = k1.distance(k2)
  println("Distance:"+k6)
  val k5 = k1.invert()
  println("Invert:" +k5)

}

case class Point(x:Int, y:Int){
  def +(that:Point)=Point(this.x+that.x, this.y+that.y)
  def move(dx:Int, dy:Int)=Point(this.x+dx, this.y+dy)
  def distance(that:Point)=Point(Math.abs(this.x-that.x), Math.abs(this.y-that.y))
  def invert() =Point(this.y, this.x)
}
