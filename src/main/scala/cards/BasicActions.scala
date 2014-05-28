package mageknight.cards

sealed trait BasicAction extends Deed

case object Rage extends BasicAction
case object Determination extends BasicAction
case object Swiftness extends BasicAction
case object March extends BasicAction
case object Stamina extends BasicAction
case object Tranquility extends BasicAction
case object Promise extends BasicAction
case object Threaten extends BasicAction
case object Crystallize extends BasicAction
case object ManaDraw extends BasicAction
case object Concentration extends BasicAction
case object Improvisation extends BasicAction

case object WillFocus extends BasicAction
case object NobleManners extends BasicAction
case object ColdToughness extends BasicAction
case object BattleVersatility extends BasicAction