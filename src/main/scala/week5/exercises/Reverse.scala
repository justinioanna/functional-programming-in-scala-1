package week5.exercises

object Reverse {
  def reverse[T](xs: List[T]): List[T] = xs match {
    case List()  => xs
    case y :: ys => reverse(ys) ++ List(y)
  }
}
