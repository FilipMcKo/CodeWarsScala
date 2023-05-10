package com.mucko.filip.codewarsscala.kyu5

import com.mucko.filip.codewarsscala.kyu5.MoveZeros.moveZeroes
import org.scalatest.flatspec.AnyFlatSpec

class MoveZeroesSpec extends AnyFlatSpec{
  "moveZeroes" should "pass basic tests" in {
    val testCases = List(
      (List(1, 2, 0, 1, 0, 1, 0, 3, 0, 1), List(1, 2, 1, 1, 3, 1, 0, 0, 0, 0)),
      (List(9, 0, 0, 9, 1, 2, 0, 1, 0, 1, 0, 3, 0, 1, 9, 0, 0, 0, 0, 9), List(9, 9, 1, 2, 1, 1, 3, 1, 9, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)),
      (List(0, 0), List(0, 0)),
      (List(0), List(0)),
      (List[Int](), List[Int]())
    )

    testCases.foreach {
      case (lst, expected) => assertResult(expected, s"\nInput\n  lst = $lst")(moveZeroes(lst))
    }
  }
}
