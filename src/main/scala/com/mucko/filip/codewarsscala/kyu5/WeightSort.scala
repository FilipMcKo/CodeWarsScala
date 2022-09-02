package com.mucko.filip.codewarsscala.kyu5

object WeightSort extends App {
  //My solution
  def orderWeight(strng: String): String = {
    strng.split(" ").sorted.sortWith(sumDigits(_) < sumDigits(_)).mkString(" ")
  }

  def sumDigits(str: String) = {
    var result = 0
    for (s <- str) result += s.toString.toInt
    result
  }

  //Solution copied form CodeWars
  def orderWeight_notMine(str: String): String =
    str.split(" ").sortBy(d => (d.map(_.asDigit).sum, d)).mkString(" ")
}
