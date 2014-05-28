package mageknight.tokens

sealed trait RuinsToken extends Token

case object BlueMana extends RuinsToken
case object OrcMana extends RuinsToken
case object DraconumMana extends RuinsToken
case object CityMana extends RuinsToken

case object DungeonMageTower extends RuinsToken
case object DungeonDraconum extends RuinsToken
case object OrcDungeon extends RuinsToken
case object OrcOrc extends RuinsToken
case object OrcDraconum extends RuinsToken
case object KeepDungeon extends RuinsToken
case object KeepMageTower extends RuinsToken
case object KeepCity extends RuinsToken
