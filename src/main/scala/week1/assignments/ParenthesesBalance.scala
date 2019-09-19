package week1.assignments

import scala.annotation.tailrec

object ParenthesesBalancing {

  def balance(chars: List[Char]): Boolean = {

    def getValue(char: Char): Int =
      if (char == '(') 1 else if (char == ')') -1 else 0

    @tailrec
    def balanceAcc(chars: List[Char], acc: Int): Boolean =
      if (acc < 0) false
      else if (chars.isEmpty) true
      else balanceAcc(chars.tail, acc + getValue(chars.head))

    balanceAcc(chars, 0)
  }

}
