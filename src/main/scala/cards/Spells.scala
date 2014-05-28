package mageknight.cards

sealed trait Spell extends Deed

case object Fireball_Firestorm extends Spell
case object Snowstorm_Blizzard extends Spell
case object Expose_MassExpose extends Spell
case object Tremor_Earthquake extends Spell
case object FlameWall_FlameWave extends Spell
case object ManaBolt_ManaThunderbolt extends Spell
case object Whirlwind_Tornado extends Spell
case object UndergroundTravel_UndergroundAttack extends Spell
case object BurningShield_ExplodingShield extends Spell
case object Chill_LethalChill extends Spell
case object WingsOfWind_WingsOfNight extends Spell
case object Restoration_Rebirth extends Spell
case object Demolish_Disintegrate extends Spell
case object SpaceBending_TimeBending extends Spell
case object CallToArms_CallToGlory extends Spell
case object Meditation_Trance extends Spell
case object ManaMeltdown_ManaRadiance extends Spell
case object ManaClaim_ManaCurse extends Spell
case object MindRead_MindSteal extends Spell
case object EnergyFlow_EnergyStealcase extends Spell