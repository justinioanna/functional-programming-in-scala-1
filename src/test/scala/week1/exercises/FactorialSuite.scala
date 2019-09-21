package week1.exercises

import Factorial.factorial
import org.scalatest.FunSuite

class FactorialSuite extends FunSuite {

  test("factorial: 0!") {
    assert(factorial(0) === 1)
  }

  test("factorial: 4!") {
    assert(factorial(4) === 24)
  }

  test("factorial: 6!") {
    assert(factorial(6) === 720)
  }

}
