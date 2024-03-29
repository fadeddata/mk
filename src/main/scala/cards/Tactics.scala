package mageknight.cards

sealed trait DayTactic
case object EarlyBird extends DayTactic
case object Rethink extends DayTactic
case object ManaSteal extends DayTactic
case object Planning extends DayTactic
case object GreatStart extends DayTactic
case object TheRightMoment extends DayTactic

object DayTactic {
  val tactics = List(
    EarlyBird,
    Rethink,
    ManaSteal,
    Planning,
    GreatStart,
    TheRightMoment
  )
}


sealed trait NightTactic
case object FromTheDusk extends NightTactic
case object LongNight extends NightTactic
case object ManaSearch extends NightTactic
case object MidnightMeditation extends NightTactic
case object Preparation extends NightTactic
case object SparingPowercase extends NightTactic

object NightTactic {
  val tactics = List(
    FromTheDusk,
    LongNight,
    ManaSearch,
    MidnightMeditation,
    Preparation,
    SparingPowercase
  )
}