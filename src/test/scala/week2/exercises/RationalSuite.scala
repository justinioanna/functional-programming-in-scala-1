package week2.exercises

import org.scalatest.FunSuite

class RationalSuite extends FunSuite {
  val r1 = new Rational(1, 4)
  val r2 = new Rational(1, 2)

  test("Rational: Illegal argument") {
    intercept[IllegalArgumentException] {
      val r3 = new Rational(1, 0)
    }
  }

  test("Rational: Test whole number") {
    val r3 = new Rational(1)
    assert(r3.toString == "1/1")
  }

  test("Rational: Test add") {
    val r3 = r1 + r2
    assert(r3.toString == "3/4")
  }

  test("Rational: Test subtract") {
    val r3 = r2 - r1
    assert(r3.toString == "1/4")
  }

  test("Rational: Test less than") {
    assert(r1 < r2)
  }

  test("Rational: Test max") {
    assert(r1.max(r2) === r2)
    assert(r2.max(r1) === r2)
  }

}
