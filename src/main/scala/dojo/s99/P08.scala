package dojo.s99

object P08 {

  def compress[A](l: List[A]): List[A] = l match {
    case hd :: tl => hd +: compress(tl.dropWhile(_ == hd))
    case Nil => Nil
  }
}
