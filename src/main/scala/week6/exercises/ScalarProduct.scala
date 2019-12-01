package week6.exercises

object ScalarProduct {
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
    (for ((x, y) <- xs.zip(ys)) yield x * y).sum
}
