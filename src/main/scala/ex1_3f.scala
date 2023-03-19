object ex1_3f {
  def apply(lst:List[_])= println(lst)
  def main(args:Array[String]):Unit={
    apply(List(1,2,3,4))
    apply(List("a","b","c"))
  }
}
