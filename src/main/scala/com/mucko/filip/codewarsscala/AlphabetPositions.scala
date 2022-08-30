package com.mucko.filip.codewarsscala

object AlphabetPositions extends App {
  val CONST_TO_SUBTR = 96
  val ASCII_MAX = 122
  val ASCII_MIN = 97

  def alphabetPositions(text: String): String = {

    val lowerText = text.toLowerCase();
    val result = new StringBuilder

    for (a <- lowerText) {
      if (a.toInt >= ASCII_MIN && a.toInt <= ASCII_MAX) {
        result ++= (recalculatingAlphabetPosition(a) + " ")
      }
    }
    result.toString.trim
  }

  def recalculatingAlphabetPosition(a: Char): String = {
    (a.toInt - CONST_TO_SUBTR).toString
  }

  println(alphabetPositions("The sunset sets at twelve o' clock."))
}
