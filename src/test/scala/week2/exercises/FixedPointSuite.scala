package week2.exercises

import FixedPoint.sqrt
import org.scalatest.FunSuite

class FixedPointSuite extends FunSuite {

  test("sqrt: 2") {
    assert(sqrt(2) === 1.4142135623746899)
  }
}
