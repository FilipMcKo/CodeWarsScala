package com.mucko.filip.codewarsscala.kyu5

object Rgb extends App {
  //My solution
  def rgb(r: Int, g: Int, b: Int): String =
    fillWithZero(validate(r).toHexString.toUpperCase) + fillWithZero(validate(g).toHexString.toUpperCase) + fillWithZero(validate(b).toHexString.toUpperCase)

  def fillWithZero(hex: String): String =
    if (hex.length == 1) "0" + hex else hex

  def validate(number: Int): Int =
    if (number < 0) 0 else if (number > 255) 255 else number

  
  //Solution copied form CodeWars
  def rgb_notMine(r: Int, g: Int, b: Int): String =
    Seq(r, g, b).map(x => f"${255 min (x max 0)}%02X").mkString
}
