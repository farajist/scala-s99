package dojo.s99

object P07 {

  def flatten[A](l: List[Any]): List[A] = l match  {
    case (hd: List[Any]) :: tl => flatten(hd) ++ flatten(tl)
    case (hd: A) :: tl => hd +: flatten(tl)
    case Nil => Nil
  }
}
