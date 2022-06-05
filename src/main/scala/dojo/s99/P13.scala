package dojo.s99

object P13 {
  def encodeDirect(l: List[Symbol]): List[(Int, Symbol)] = {
    if (l.isEmpty) Nil
    else {
      val (packed, unpacked) = l.span(_ == l.head)
      (packed.length, packed.head) :: encodeDirect(unpacked)
    }
  }
}
