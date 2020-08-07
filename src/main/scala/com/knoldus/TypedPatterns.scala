package com.knoldus

class TypedPatterns {
  def patternMatching(anyTypeVariable: Any): Any = {
    anyTypeVariable match {
      case stringVariable: String => stringVariable.length
      case mapVariable: Map[_, _] => mapVariable.size
      case arrayVariable: Array[_] => arrayVariable.length
      case listVariable: List[_] => listVariable.size
      case _ => "Undefined type"
    }
  }
}
