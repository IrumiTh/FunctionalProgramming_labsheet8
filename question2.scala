object PatternMatchingApp {

  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val input = args(0).toInt

      val checkMultiple = (num: Int) => num match {
        case x if x % 3 == 0 && x % 5 == 0 => "Multiple of Both Three and Five"
        case x if x % 3 == 0 => "Multiple of Three"
        case x if x % 5 == 0 => "Multiple of Five"
        case _ => "Not a Multiple of Three or Five"
      }

      println(checkMultiple(input))
    } else {
      println("Please provide an integer input.")
    }
  }
}
