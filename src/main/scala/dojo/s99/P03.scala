package dojo.s99

object P03 {
  def nth[A](idx: Int, l: List[A]): A = (idx, l) match {
    case (0, hd :: _) => hd
    case (n, _ :: tl) => nth(n - 1, tl)
    case (_, Nil) => throw new NoSuchElementException
  }
}

