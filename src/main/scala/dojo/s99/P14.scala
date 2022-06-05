package dojo.s99

object P14 {
  def duplicate(l: List[Symbol]): List[Symbol] =
    if (l.isEmpty) Nil
    else {
      l.head :: l.head :: duplicate(l.tail)
    }
}
