package com.mucko.filip.codewarsscala.kyu5

object HelpYourGranny extends App{
  val friends1 = List("A1", "A2", "A3", "A4", "A5")
  val fTowns1 = List(("A1", "X1"), ("A2", "X2"), ("A3", "X3"), ("A4", "X4"))
  val distTable1 = Map("X1" -> 100.0, "X2" -> 200.0, "X3" -> 250.0, "X4" -> 300.0)

  def tour(arrFriends: List[String], ftwns: List[(String, String)], h: Map[String, Double]): Int = {
    val townsInOrder = friends1.collect(f => fTowns1.toMap.getOrElse(f, println("no town")))
    10
  }

  fTowns1.toMap
  println(friends1.collect(f => fTowns1.toMap.getOrElse(f, println("no town"))).mkString(" "))
}
