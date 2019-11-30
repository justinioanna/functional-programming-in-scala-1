package week5.exercises

import org.scalatest.FunSuite

import Pack.pack

class PackSuite extends FunSuite {

  test("Pack list of strings.") {
    assert(
      pack(List("a", "a", "a", "b", "c", "c", "a")) ==
        List(List("a", "a", "a"), List("b"), List("c", "c"), List("a"))
    )
  }

}
