package com.knoldus

class PatternGuards {
  def patternGuards(toMatch: Any, maxLength: Int): String = {
    toMatch match {
      case list: List[_] if list.size <= maxLength => "List is of acceptable size"
      case _: List[_] => "List has not an acceptable size"
      case string: String if string.length <= maxLength => "String is of acceptable size"
      case _: String => "String has not an acceptable size"
      case _ => "Input is neither a List nor a String"
    }
  }
}
