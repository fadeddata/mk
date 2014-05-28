package mageknight.gamestate

import mageknight._, cards._, tiles._, skills._

case class Offers(
  advancedAction: List[AdvancedAction],
  unit: List[AnyUnit],
  spell: List[Spell],
  commonSkillOffer: List[Skill]
  )