package com.knoldus

sealed abstract class CardSuit

case class Spike() extends CardSuit

case class Club() extends CardSuit

case class Heart() extends CardSuit

case class Diamond() extends CardSuit

class MatchingWithSealedClasses {
  def sealedClass(cardsuit: CardSuit): String = {
    cardsuit match {
      case Spike() => "Card is Spike"
      case Club() => "Card is Club"
      case Heart() => "Card is Heart"
      case Diamond() => "Card is Diamond"
    }
  }
}
