package week1.assignments

import PascalsTriangle.pascal
import org.scalatest.FunSuite

class PascalsTriangleSuite extends FunSuite {

  test("pascal: col=0,row=2") {
    assert(pascal(0, 2) === 1)
  }

  test("pascal: col=1,row=2") {
    assert(pascal(1, 2) === 2)
  }

  test("pascal: col=1,row=3") {
    assert(pascal(1, 3) === 3)
  }

}
