package dojo.s99

object P12 {
  def decode(l: List[(Int, Symbol)]): List[Symbol] =
    l flatMap {e => List(e._2).padTo(e._1, e._2) }
}
