package week5.exercises

import math.Ordering
import org.scalatest.FunSuite

import MergeSort.msort

class MergeSortSuite extends FunSuite {

  val nums = List(2, -4, 7, 5, 1)
  val fruits = List("apple", "pineapple", "orange", "banana")

  test("Mergesort list of integers.") {
    assert(msort(nums)(Ordering.Int) == List(-4, 1, 2, 5, 7))
  }

  test("Mergesort list of strings.") {
    assert(
      msort(fruits)(Ordering.String) == List(
        "apple",
        "banana",
        "orange",
        "pineapple"
      )
    )
  }

}
