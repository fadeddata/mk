package mageknight.gamestate

import mageknight._, cards._, tiles._

case class Decks(
  advancedActions: Deck[AdvancedAction],
  eliteUnits: Deck[EliteUnit],
  regularUnits: Deck[RegularUnit],
  tiles: Deck[Tile],
  spells: Deck[Spell],
  artifacts: Deck[Artifact]
)