package dojo.s99

object P05 {

  def reverse[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case hd :: Nil => List(hd)
    case hd :: tl => reverse(tl) :+ hd
  }
}
