package week5.exercises

object SquareList {

  def squareListA(xs: List[Int]): List[Int] = xs match {
    case Nil     => Nil
    case y :: ys => y * y :: squareListA(ys)
  }

  def squareListB(xs: List[Int]): List[Int] =
    xs.map(x => x * x)

}
