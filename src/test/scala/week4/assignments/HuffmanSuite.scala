package week4.assignments

import Huffman._
import org.scalatest.FunSuite

class HuffmanSuite extends FunSuite {

  val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
  val t2 =
    Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9)

  test("weight of a larger tree (10pts)") {
    assert(weight(t1) == 5)
  }

  test("chars of a larger tree (10pts)") {
    assert(chars(t2) == List('a', 'b', 'd'))
  }

  test("chars of a larger tree (10pts)") {
    assert(
      string2Chars("hello, world") == List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l',
        'd')
    )
  }

  test("make ordered leaf list for some frequency table (15pts)") {
    assert(
      makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) == List(
        Leaf('e', 1),
        Leaf('t', 2),
        Leaf('x', 3)
      )
    )
  }

  test("combine of some leaf list (15pts)") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(
      combine(leaflist) == List(
        Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3),
        Leaf('x', 4)
      )
    )
  }

  test("decode and encode a very short text should be identity (10pts)") {
    assert(decode(t1, encode(t1)("ab".toList)) == "ab".toList)
  }
}
