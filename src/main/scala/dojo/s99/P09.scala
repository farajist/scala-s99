package dojo.s99

object P09 {

  def packWithMatch[A](l: List[A]): List[Any] = l match {
    case hd :: tl => List(hd) ++ tl.takeWhile(_ == hd) :: pack(tl.dropWhile(_ == hd))
    case Nil => Nil
  }

  def pack[A](l: List[A]): List[List[A]] =
    if (l.isEmpty) List()
    else {
      val (packed, unpacked) = l.span(_ == l.head)
      packed :: pack(unpacked)
    }

  def main(args: Array[String]): Unit = {
    println(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
