package dojo.s99

object P15 {

  def duplicateN(n: Int, l: List[Symbol]): List[Symbol] =
    if (l.isEmpty) Nil
    else {
      List.fill(n)(l.head) ::: duplicateN(n, l.tail)
    }

  def main(args: Array[String]): Unit = {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))
  }
}
