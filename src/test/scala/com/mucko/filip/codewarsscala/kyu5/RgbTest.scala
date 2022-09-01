package com.mucko.filip.codewarsscala.kyu5

import org.scalatest.flatspec._

class RgbTest extends AnyFlatSpec {
  val testCases = List( //(r, g, b, expected)
    (0, 0, 0, "000000"),
    (1, 2, 3, "010203"),
    (255, 255, 255, "FFFFFF"),
    (254, 253, 252, "FEFDFC"),
    (-20, 275, 125, "00FF7D")
  )

  testCases.foreach {
    case (r, g, b, expected) =>
      s"rgb($r, $g, $b)" should s"return \"$expected\"" in {
        assertResult(expected) {
          Rgb.rgb(r, g, b)
        }
      }
  }
}
