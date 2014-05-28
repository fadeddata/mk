package mageknight.gamestate

import mageknight._, cards._, skills._, heroes._

case class PlayerState(
  hero: Hero,
  skillPile: Deck[Skill],
  deedDeck: Deck[Deed],
  hand: List[Deed],
  discard: List[Deed],
  skills: List[Skill],
  units: List[AnyUnit]
  )