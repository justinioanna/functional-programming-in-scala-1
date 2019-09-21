package week2.exercises

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be non-zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)
  def numer = x / g
  def denom = y / g

  def this(x: Int) = this(x, 1)

  override def toString = this.numer + "/" + this.denom

  def +(that: Rational) = new Rational(
    this.numer * that.denom + that.numer * this.denom,
    this.denom * that.denom
  )

  def unary_- : Rational = new Rational(-this.numer, this.denom)

  def -(that: Rational) = this + -that

  def <(that: Rational) = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this < that) that else this
}
