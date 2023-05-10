package com.mucko.filip.codewarsscala.kyu5

object MoveZeros {
  def moveZeroes(lst: List[Int]): List[Int] = {
    lst.filter(e => e != 0) ++ lst.filter(f => f == 0)
  }
}
