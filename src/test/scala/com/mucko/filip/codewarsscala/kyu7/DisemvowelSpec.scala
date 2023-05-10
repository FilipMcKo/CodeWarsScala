package com.mucko.filip.codewarsscala.kyu7

import com.mucko.filip.codewarsscala.kyu7.TrollFighter.disemvowel
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DisemvowelSpec extends AnyFlatSpec with Matchers{
  "disemvowel(\"This website is for losers LOL!\")" should "return \"Ths wbst s fr lsrs LL!\"" in {
    disemvowel("This website is for losers LOL!") shouldBe "Ths wbst s fr lsrs LL!"
  }
  "disemvowel(\"No offense but, Your writing is among the worst I've ever read\")" should "return \"N ffns bt, Yr wrtng s mng th wrst 'v vr rd\"" in {
    disemvowel("No offense but, Your writing is among the worst I've ever read") shouldBe "N ffns bt, Yr wrtng s mng th wrst 'v vr rd"
  }
}
