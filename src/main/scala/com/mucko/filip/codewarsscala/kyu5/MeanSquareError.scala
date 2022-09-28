package com.mucko.filip.codewarsscala.kyu5

object MeanSquareError extends App {

  //My solution
  def solution(a: Array[Int], b: Array[Int]): Double = {
    val squares = a.zip(b).map(i => scala.math.pow(i._1 - i._2, 2))
    var sum: Double = 0
    for (i <- squares) {
      sum += i
    }
    sum./(squares.length)
  }

  //Solution copied form CodeWars
  def solution_notMine(a: Array[Int], b: Array[Int]): Double =
    a.zip(b).map { case (x, y) => math.pow(x - y, 2) }.sum / a.size
}
