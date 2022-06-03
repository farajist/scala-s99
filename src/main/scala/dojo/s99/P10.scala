package dojo.s99

object P10 {
  def pack[A](l: List[A]): List[List[A]] =
    if (l.isEmpty) List()
    else {
      val (packed, unpacked) = l.span(_ == l.head)
      packed :: pack(unpacked)
    }

  def encode[Symbol](l: List[Symbol]): List[(Int, Any)] = {
    val packed = pack[Symbol](l)
    def encodePacked(packedList: List[List[Symbol]]) =
      if (packedList.isEmpty) List()
      else {
        (packedList.head.size, packedList.head.head) :: encode(packed.tail)
      }
    encodePacked(packed)
  }

  def main(args: Array[String]): Unit = {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))
  }
}
