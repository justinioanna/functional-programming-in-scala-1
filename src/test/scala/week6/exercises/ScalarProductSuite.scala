package week6.exercises

import org.scalatest.FunSuite

import ScalarProduct._

class ScalarProductSuite extends FunSuite {

  val xs: List[Double] = List(4.0, 5.0, 6.0)
  val ys: List[Double] = List(2.0, 3.0, 4.0)

  test("Scalar products.") {
    assert(scalarProduct(xs, ys) == 47.0)
  }

}
