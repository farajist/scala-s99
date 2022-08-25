package dojo.s99

object P16 {

  def drop(index: Int, l: List[Symbol]): List[Symbol] = (index, l) match {
    case (0, _ :: tl) => drop(index - 1, tl)
    case (i, hd :: tl )=> hd :: drop(i - 1, tl)
    case (_, Nil) => Nil
  }
}
