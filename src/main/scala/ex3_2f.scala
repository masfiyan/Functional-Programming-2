object ex3_2f {
  def main(args:Array[String]):Unit={
    //set------------------------------------------
    val set1 = Set(1, 2, 3)
    val set2 = Set(1,2,3,4)
    println(set1.map( _ * 2))
    println(set1.map(x=>Set(x, x * 2)))
    //seq--------------------------------------------
    val seq1 = Seq(1, 2, 3)
    println(seq1.map(_ * 2))
    println(seq1.flatMap(x => Seq(x, x * 2)))
  }
}
