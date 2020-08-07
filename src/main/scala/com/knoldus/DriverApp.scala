package com.knoldus

object DriverApp extends App {
  println("/////////////////////////////////// Wildcard Patterns ///////////////////////////////////")
  val wildcardPatterns = new WildcardPatterns
  println(wildcardPatterns.patternMatching(10))
  println(wildcardPatterns.patternMatching("Ten"))
  println("/////////////////////////////////// Constant Patterns ///////////////////////////////////")
  val constantPatterns = new ConstantPatterns
  println(constantPatterns.patternMatching(0))
  println(constantPatterns.patternMatching(4.5d))
  println(constantPatterns.patternMatching("hello"))
  println(constantPatterns.patternMatching(false))
  println(constantPatterns.patternMatching(Nil))
  println(constantPatterns.patternMatching(Option(1)))
  println("/////////////////////////////////// Variable Patterns ///////////////////////////////////")
  val variablePatterns = new VariablePatterns
  println(variablePatterns.patternMatching(0))
  println(variablePatterns.patternMatching(1))
  println("/////////////////////////////////// Constructor Patterns ///////////////////////////////////")
  val constructorPatterns = new ConstructorPatterns
  println(constructorPatterns.patternMatching(Add(10, 5)))
  println(constructorPatterns.patternMatching(Mult(6, 2)))
  println(constructorPatterns.patternMatching(Neg(4)))
  println(constructorPatterns.patternMatching(Div(9, 3)))
  println("/////////////////////////////////// Sequence Patterns ///////////////////////////////////")
  val sequencePatterns = new SequencePatterns
  println(sequencePatterns.patternMatching(List(1)))
  println(sequencePatterns.patternMatching(List(1, 2, 3)))
  println(sequencePatterns.patternMatching(Vector(1, 2)))
  println(sequencePatterns.patternMatching(Array(10)))
  println(sequencePatterns.patternMatching((2, 4)))
  println("/////////////////////////////////// List Patterns ///////////////////////////////////")
  val listPatterns = new ListPatterns
  println(listPatterns.patternMatching(List.empty))
  println(listPatterns.patternMatching(List(1)))
  println(listPatterns.patternMatching(List(1, 2)))
  println(listPatterns.patternMatching(List(1, 2, 3)))
  println(listPatterns.patternMatching(List(1, 2, 3, 4, 5)))
  println("/////////////////////////////////// Tuple Patterns ///////////////////////////////////")
  val tuplePatterns = new TuplePatterns
  println(tuplePatterns.patternMatching((1, "Two")))
  println(tuplePatterns.patternMatching((1, "Two", 3.0)))
  tuplePatterns.patternMatching(List(1, 2, 3))
  println("/////////////////////////////////// Typed Patterns ///////////////////////////////////")
  val typedPatterns = new TypedPatterns
  println(typedPatterns.patternMatching("Mansi Babbar"))
  println(typedPatterns.patternMatching(Map(1 -> "One", 2 -> "Two", 3 -> "Three")))
  println(typedPatterns.patternMatching(Array(3, 6, 9, 15)))
  println(typedPatterns.patternMatching(List('A', 'B', 'C', 'D', 'E')))
  println(typedPatterns.patternMatching((10, "Twenty")))
  println("/////////////////////////////////// Option Type Patterns ///////////////////////////////////")
  val optionTypePatterns = new OptionTypePatterns
  println(optionTypePatterns.patternMatching(Option("Hello")))
  println(optionTypePatterns.patternMatching(Option(null)))
  println("/////////////////////////////////// Pattern Guards ///////////////////////////////////")
  val patternGuards = new PatternGuards
  println(patternGuards.patternGuards(List(2, 4, 6, 8), 5))
  println(patternGuards.patternGuards(List(3, 6, 9, 15, 18), 5))
  println(patternGuards.patternGuards("Good Morning", 15))
  println(patternGuards.patternGuards("Good Morning World", 15))
  println(patternGuards.patternGuards(100, 10))
  println("/////////////////////////////////// Matching with Sealed Classes ///////////////////////////////////")
  val matchingWithSealedClasses = new MatchingWithSealedClasses
  println(matchingWithSealedClasses.sealedClass(Spike()))
  println(matchingWithSealedClasses.sealedClass(Club()))
  println(matchingWithSealedClasses.sealedClass(Heart()))
  println(matchingWithSealedClasses.sealedClass(Diamond()))
  println("/////////////////////////////////// Matching with Extractors ///////////////////////////////////")
  val matchingWithExtractors = new MatchingWithExtractors
  println(matchingWithExtractors.extractors("Mansi Babbar"))
  println(matchingWithExtractors.extractors(10))
}
