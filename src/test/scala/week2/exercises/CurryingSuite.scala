package week2.exercises

import Currying.{product, factorial}
import org.scalatest.FunSuite

class CurryingSuite extends FunSuite {

  test("product of squares from 3 to 4 inclusive.") {
    assert(product(x => x * x)(3, 4) === 144)
  }

  test("product of squares from 4 to 4 inclusive") {
    assert(product(x => x * x)(4, 4) === 16)
  }

  test("product of squares from 5 to 4 inclusive") {
    assert(product(x => x * x)(5, 4) === 1)
  }

  test("factorial: 0!") {
    assert(factorial(0) === 1)
  }

  test("factorial: 1!") {
    assert(factorial(1) === 1)
  }

  test("factorial: 4!") {
    assert(factorial(4) === 24)
  }
}
