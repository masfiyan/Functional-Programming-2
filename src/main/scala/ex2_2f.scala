object ex2_2f {
  case class Person(name: String, age: Int, address: Address)
  case class Address(city: String, state: String)
  def main(args:Array[String]):Unit={
    val address = Address("defence", "USA")
    val person = Person("Asfiyan", 16, address)
    val Person1 = person.copy()
    println(person)
    println(person eq Person1)
    val Person2 = person.copy(age = 31, address = person.address.copy(city = "defence housing"))
    println(person eq Person2)
    println(person.address eq Person2.address)
  }
}
