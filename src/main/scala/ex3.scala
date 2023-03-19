import scala.collection.mutable.ListBuffer
object ex3 {
  val lst = ListBuffer[Double]()
  def abc(lst2:List[Int]):Any={
    println(lst2)
    def loop(count: Int): Any = {
      if (count < 5) {
        lst += math.pow(lst2(count),2)
        loop(count + 1)
      }
      else {
        lst
      }
    }
    loop(0)
    math.sqrt(lst.sum)
  }
  def main(args:Array[String]):Unit={
    val vec = Vector(1, 2, 3, 4, 5)
    val lst = vec.toList.map(_.toInt)
    println(abc(lst))
  }
}
