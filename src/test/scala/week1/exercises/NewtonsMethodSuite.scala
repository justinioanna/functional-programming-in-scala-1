package week1.exercises

import NewtonsMethod.sqrt
import org.scalatest.FunSuite

class NewstonsMethodSuite extends FunSuite {

  test("sqrt: 2") {
    assert(sqrt(2) === 1.4142156862745097)
  }

  test("sqrt: 4") {
    assert(sqrt(4) === 2.000609756097561)
  }

  test("sqrt: 1e-6") {
    assert(sqrt(1e-6) === 0.0010000001533016628)
  }

  test("sqrt: 1e60") {
    assert(sqrt(1e60) === 1.0000788456669446e30)
  }

}
