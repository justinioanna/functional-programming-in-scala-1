package week5.exercises

import Pack.pack

object Encode {
  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs).map(ys => (ys.head, ys.length))
}
