package week5.exercises

import org.scalatest.FunSuite

import Encode.encode

class EncodeSuite extends FunSuite {

  test("Encode list of strings.") {
    assert(
      encode(List("a", "a", "a", "b", "c", "c", "a")) ==
        List(("a", 3), ("b", 1), ("c", 2), ("a", 1))
    )
  }

}
