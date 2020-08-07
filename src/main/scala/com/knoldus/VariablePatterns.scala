package com.knoldus

class VariablePatterns {
  def patternMatching(variable: Any): String = {
    variable match {
      case 0 => "Variable is zero"
      case nonZero => s"Variable is not zero and equal to $nonZero"
    }
  }
}
