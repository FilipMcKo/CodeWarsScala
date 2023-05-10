package com.mucko.filip.codewarsscala.kyu7

object TrollFighter {

  def disemvowel(str: String): String = {
    val vowels = List('a', 'e', 'i', 'o', 'u')
    str.filter(c => !vowels.contains(c.toLower)).mkString
  }

}
