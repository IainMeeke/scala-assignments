package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
//    println("balanced:")
//    println(balance("(()()()(()))".toList)) //true
//    println(balance("(if (zero? x) max (/ 1 x))".toList)) //true
//    println(balance("I told him (that it’s not (yet) done). (But he wasn’t listening)".toList)) //true
//    println(balance(":-)".toList)) //false
//    println(balance("())(".toList)) //false
//    println(balance("()))()".toList)) //false
    println(countChange(4, List(5,4,2,1)))
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = if (c == 0 || r == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    def loop(b: Int, chars: List[Char]): Boolean = {
      if (b < 0) false else if (chars.isEmpty && b == 0) true
      else {
        chars.head match {
          case '(' => loop(b + 1, chars.tail)
          case ')' => loop(b - 1, chars.tail)
          case _ => loop(b, chars.tail)
        }
      }
    }

    loop(0, chars)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)
      1
    else if(money > 0 && coins.nonEmpty)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
      0
  }
}
