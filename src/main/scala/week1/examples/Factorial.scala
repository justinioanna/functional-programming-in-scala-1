package week1.examples

object Factorial {

  def factorial(n: Int): Int = {
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)
    loop(1, n)
  }

  def main(args: Array[String]) {
    println(factorial(0))
    println(factorial(4))
    println(factorial(6))
  }
}
