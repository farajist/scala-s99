package dojo.s99

object P11 {
  def pack[A](l: List[A]): List[List[A]] =
    if (l.isEmpty) List()
    else {
      val (packed, unpacked) = l.span(_ == l.head)
      packed :: pack(unpacked)
    }

  def encodeModified(l: List[Symbol]) =
    pack(l) map {
      case hd :: Nil => hd
      case e: List[List[Symbol]] => (e.length, e.head)
    }

  def main(args: Array[String]): Unit = {
    println(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
