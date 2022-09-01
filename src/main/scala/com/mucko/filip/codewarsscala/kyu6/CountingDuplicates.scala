package com.mucko.filip.codewarsscala.kyu6

object CountingDuplicates extends App {
  //My solution
  def duplicateCount(str: String): Int = {
    var duplicates = Map.empty[Char, Int]
    for (a <- str.toLowerCase()) {
      if (duplicates.contains(a)) {
        duplicates += (a -> (duplicates(a) + 1))
      } else {
        duplicates += (a -> 1)
      }
    }
    var counter: Int = 0
    for (number <- duplicates) if (number._2 > 1) counter += 1
    counter
  }

  //Solution copied form CodeWars
  def duplicateCount_notMine(str: String): Int =
    str.groupBy(_.toLower).count { case (_, cs) => cs.size > 1 }
}
