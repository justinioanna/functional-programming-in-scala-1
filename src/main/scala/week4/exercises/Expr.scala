package week4.exercises

trait Expr {
  def show: String = this match {
    case Number(n)   => n.toString
    case Sum(e1, e2) => s"${e1.show} + ${e2.show}"
  }
}

case class Number(n: Int) extends Expr

case class Sum(e1: Expr, e2: Expr) extends Expr
