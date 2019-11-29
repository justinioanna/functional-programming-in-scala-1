package week3.exercises

import Nth.nth
import org.scalatest.FunSuite

class NthSuite extends FunSuite {

  val list = new Cons(1, new Cons(2, new Cons(3, Nil)))

  test("Start of list.") {
    assert(nth(0, list) === 1)
  }

  test("Middle of list.") {
    assert(nth(1, list) === 2)
  }

  test("End of list.") {
    assert(nth(2, list) === 3)
  }

  test("Index out of range.") {
    intercept[IndexOutOfBoundsException] {
      nth(5, list)
    }
  }

  test("Index negative.") {
    intercept[IndexOutOfBoundsException] {
      nth(-1, list)
    }
  }

}
