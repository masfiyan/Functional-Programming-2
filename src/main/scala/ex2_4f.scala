object ex2_4f {
    implicit def kuchbhi[A](a: A): String = a.toString
    def add[A, B](a: A, b: B): Unit = {
      val c: String = a
      val d: String = b
      println(c + d)
    }
    def main(args: Array[String]): Unit = {
      add(0, 0)
      add("asfiyan", 0321)
    }
}
