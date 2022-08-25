package dojo.s99

object P04 {
  def length[A](l: List[A]): Int = l match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }
}

