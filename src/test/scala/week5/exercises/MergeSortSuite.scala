package week5.exercises

import MergeSort.msort
import org.scalatest.FunSuite

class MergeSortSuite extends FunSuite {

  val nums = List(2, -4, 7, 5, 1)

  test("Mergesort list.") {
    assert(msort(nums) == List(-4, 1, 2, 5, 7))
  }

}
