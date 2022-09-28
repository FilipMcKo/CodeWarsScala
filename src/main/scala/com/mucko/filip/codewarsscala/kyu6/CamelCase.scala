package com.mucko.filip.codewarsscala.kyu6

object CamelCase extends App {
  //My solution
  def toCamelCase(str: String): String = {
    str.split(Array('_', '-')).head + str.split(Array('_', '-')).tail.map(s => {s.substring(0,1).toUpperCase + s.substring(1)}).mkString("")
  }

  //Solution copied form CodeWars
  def toCamelCase_notMine(str: String): String = str.split("[_-]").reduce((a, b) => a + b.capitalize)
}
