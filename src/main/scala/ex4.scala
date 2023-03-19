object ex4 {
  def main(args:Array[String]):Unit={
    // 11.2--------------------------------------------
    val ulist = List(1,2,3,4,5)
    println(ulist.map(_*2))
    def f(x:Int)= if(x>2) x*x else None
    println(ulist.map(f(_)))


    //11.3--------------------------------------------
    val ulist2:List[Int] = List(1,2,3,4,5)
    def g(v:Int) = List(v-1,v,v+1)
    println("extended list ",ulist2.map(g(_)))
    println("flat map ",ulist2.flatMap(g(_)))


    //11.4-------------------------------------------
    val ulist3:List[Int] = List(1,2,3,4,5)
    def f2(x:Int)= if(x>2) Some(x) else None
    println(ulist3.map(f2(_)))
    println(ulist3.flatMap(f2(_)))


    //11.5--------------------------------------------
    val uMap = Map('a' -> 2, 'b' -> 4, 'c' -> 6)
    println(uMap.mapValues(_*2).toMap)
    def h(k:Int,v:Int)=Some(k->v*2)
    println(uMap.map{case(k,v) => h(k,v)})
    println(uMap.flatMap {case(k,v) => h(k,v)})
  }
}
