package com.mucko.filip.codewarsscala.kyu6

import org.scalatest._
import flatspec._

class UniqueInOrderTest extends AnyFlatSpec{
  val testCases = List[(Iterable[Any], Seq[Any])](
    ("AAAABBBCCDAABBB", Seq('A', 'B', 'C', 'D', 'A', 'B')),
    ("ABBCcAD", Seq('A', 'B', 'C', 'c', 'A', 'D')),
    (Seq(1, 2, 2, 3, 3), Seq(1, 2, 3))
  )

  testCases.foreach {
    case (input, expected) =>
      s"uniqueInOrder($input)" should s"return $expected" in {
        assertResult(expected) {
          UniqueInOrder.uniqueInOrder(input)
        }
      }
  }
}
