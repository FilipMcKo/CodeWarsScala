package com.mucko.filip.codewarsscala.kyu6

object SpinWords extends App {
  //My solution
  def spinWords(sentence: String): String = {
    val words = sentence.split(" ")
    var wordsReversed = Array[String]()
    for (i <- words.indices) if (words(i).length > 4) wordsReversed = wordsReversed :+ words(i).reverse else wordsReversed = wordsReversed :+ words(i)
    wordsReversed.mkString(" ")
  }


  //Solution copied form CodeWars
  def spinWords_notMine(sentence: String): String = {
    sentence.split(" ").map(x => if ( x.size >= 5 ) x.reverse else x).mkString(" ")
  }
}
