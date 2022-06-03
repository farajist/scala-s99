package dojo.s99

object P01 {
  def last[A](l: List[A]): A = {
    if (l.tail == Nil) l.head else last(l.tail)
  }
}
