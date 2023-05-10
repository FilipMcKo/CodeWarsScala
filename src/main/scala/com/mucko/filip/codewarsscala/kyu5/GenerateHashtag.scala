package com.mucko.filip.codewarsscala.kyu5

object GenerateHashtag {
  def generateHashtag(s: String): String = {
    if (s.trim.nonEmpty) {
      var result = "#" + s.trim.split("\\s+").map(word => word.head.toUpper + word.tail.toLowerCase).mkString
      if (result.length > 140) "" else result
    }
    else ""
  }
}
