package com.mucko.filip.codewarsscala.kyu5

object IncrementString {
  def incrementString(s: String): String = {
    var suffix = s.toList.reverse.takeWhile(c => c.toInt < 58).reverse.mkString
    if (suffix.isEmpty) s + "1"
    else {
      var zeroes = suffix.takeWhile(c => c == '0')
      if (((suffix.toInt + 1).toString.length > suffix.toInt.toString.length || suffix.matches("0+")) && zeroes.nonEmpty) zeroes = zeroes.substring(1)
      s.substring(0, s.length - suffix.length) + zeroes + (suffix.toInt + 1)
    }
  }
}

/*other people's solution

def incrementString(s: String): String = {
  val num = s.reverse.takeWhile(_.isDigit).reverse
  if (num == "") s"${s}1" else s"${s.dropRight(num.size)}%0${num.size}d".format(num.toInt + 1)
  }
  */
