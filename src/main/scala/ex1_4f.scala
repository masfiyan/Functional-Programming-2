object ex1_4f {
  case class asfiyan(n:Int)
  implicit def abc(n:asfiyan)=n
  def main(args:Array[String]):Unit={
    val a = asfiyan(2)
    println(abc(a))
  }
}
