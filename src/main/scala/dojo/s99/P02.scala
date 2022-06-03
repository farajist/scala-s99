package dojo.s99

object P02 {
  def penultimate[A](l: List[A]): A = {
    if (l.tail.tail == Nil) l.head else penultimate(l.tail)
  }
}
