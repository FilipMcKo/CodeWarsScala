package com.mucko.filip.codewarsscala.kyu6

import scala.reflect.ClassTag

object UniqueInOrder {

  def uniqueInOrder[T](xs: Iterable[T])(implicit ct: ClassTag[T]): Seq[T] = {
    var myList = xs.toList
    var newList: List[T] = List()
    for (List(prev,current) <- myList.sliding(2)) {
      if(prev.!=(current)) {
        newList = newList.:+(prev)
      }
    }
    if(myList.nonEmpty){
      newList = newList.:+(myList.last)
    }
    newList
  }

}

/*somebody else's solution:
  if (xs.isEmpty) Nil else xs.head +: uniqueInOrder(xs.dropWhile(_ == xs.head))*/
