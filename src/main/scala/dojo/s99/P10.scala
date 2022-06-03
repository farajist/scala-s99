package dojo.s99

object P10 {
  def pack[A](l: List[A]): List[List[A]] =
    if (l.isEmpty) List()
    else {
      val (packed, unpacked) = l.span(_ == l.head)
      packed :: pack(unpacked)
    }

  def encode(l: List[Symbol]): List[(Int, Symbol)] =
    pack(l) map { e => (e.length, e.head)}

}
