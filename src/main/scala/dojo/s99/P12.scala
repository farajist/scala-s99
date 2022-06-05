package dojo.s99

object P12 {

  def decode(l: List[(Int, Symbol)]): List[Symbol] =
    l flatMap {e => List(e._2).padTo(e._1, e._2) }

  def main(args: Array[String]): Unit = {
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))
  }
}
