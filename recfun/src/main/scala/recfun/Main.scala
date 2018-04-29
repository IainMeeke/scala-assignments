package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
    println("balanced:")
    println(balance("(()))".toList))
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = if (c == 0 || r == 0 || c == r) 1 else pascal(c-1, r-1) + pascal (c, r-1)
  
  /**
   * Exercise 2
   */
//    def balance(chars: List[Char]): Boolean = {
//      def isMatched(chars: List[Char], b: Char): Boolean = {
//        if(chars.isEmpty) false
//        else if(b == '(' && chars.head == ')') true
//        else isMatched(chars.tail, b)
//      }
//      if(chars.head == '(') isMatched(chars.tail, chars.head)
//      else balance(chars.tail)
//    }
//  def balance(chars: List[Char]): Boolean = {
//  def oneMatch(b: Char, chars: List[Char]): Boolean = {
//    if (b == '(') {
//      if (chars.tail.isEmpty && chars.head == ')') true else oneMatch(b, chars.tail)
//    }
//    else {
//      if(chars.isEmpty) false else oneMatch(chars.head, chars.tail)
//    }
//  }
//  oneMatch(chars.head, chars.tail)
def balance(chars: List[Char]): Boolean = {
  def oneMatch(b: Char, chars: List[Char]): Boolean = {
    
}


  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = ???
  }
