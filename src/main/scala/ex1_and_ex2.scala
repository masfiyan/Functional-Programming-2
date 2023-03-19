import scala.collection.mutable.ListBuffer
object ex1_and_ex2 {
  val lst_2 = ListBuffer[Int]()
  val lst = ListBuffer[Int]()
  val lst_3 = ListBuffer[Int]()
  def ex_1(): Any = {
    val (a, b, c) = (3, 5, 7)
    def loop(count: Int): Any = {
      if (count < 4) {
        lst += count
        loop(count+1)
      }
      else {
        lst
      }
    }
    loop(-3)
    lst_2 ++= lst.map(x => a * x * x + b * x + c)
    lst_2
  }
  def ex2():Any={
    val zip1 = (lst zip lst_2).zipWithIndex
    val zip2 = zip1.map{case ((x,y),i) => (x,y,i)}
    println(zip2)

    def loop(count: Int): Any = {
      if (count < 7) {
        lst_3 += zip2(count)._2
        loop(count + 1)
      }
      else {
        lst_3
      }
    }
    loop(0)
    println("mean = ",lst_3.sum / lst_3.length)
  }
  def main(args: Array[String]): Unit = {
    println(ex_1())
    ex2()
  }
}
