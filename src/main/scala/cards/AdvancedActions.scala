package mageknight.cards

sealed trait AdvancedAction extends Deed

case object FireBolt extends AdvancedAction
case object IceBolt extends AdvancedAction
case object SwiftBolt extends AdvancedAction
case object CrushingBolt extends AdvancedAction
case object BloodRage extends AdvancedAction
case object IceShield extends AdvancedAction
case object Agility extends AdvancedAction
case object RefreshingWalk extends AdvancedAction
case object Intimidate extends AdvancedAction
case object FrostBridge extends AdvancedAction
case object SongOfWind extends AdvancedAction
case object PathFinding extends AdvancedAction
case object BloodRitual extends AdvancedAction
case object PureMagic extends AdvancedAction
case object HeroicTale extends AdvancedAction
case object Regeneration extends AdvancedAction
case object IntoTheHeat extends AdvancedAction
case object SteadyTempo extends AdvancedAction
case object Diplomacy extends AdvancedAction
case object InNeed extends AdvancedAction
case object Decompose extends AdvancedAction
case object CrystalMastery extends AdvancedAction
case object ManaStorm extends AdvancedAction
case object Ambush extends AdvancedAction
case object MaximalEffect extends AdvancedAction
case object MagicTalent extends AdvancedAction
case object Learning extends AdvancedAction
case object Training extends AdvancedAction
