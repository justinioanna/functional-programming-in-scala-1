package week5.exercises

import org.scalatest.FunSuite

import SquareList.{squareListA, squareListB}

class SquareListSuite extends FunSuite {

  val nums = List(2, -4, 7, 5, 1)

  test("Square list with pattern match.") {
    assert(squareListA(nums) == List(4, 16, 49, 25, 1))
  }

  test("Square list with map.") {
    assert(squareListB(nums) == List(4, 16, 49, 25, 1))
  }

}
