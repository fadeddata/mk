package mageknight.cards

trait AnyUnit

sealed trait RegularUnit extends AnyUnit

case object Peasants extends RegularUnit
case object Herbalists extends RegularUnit
case object Foresters extends RegularUnit
case object UtemCrossbowmen extends RegularUnit
case object UtemGuardsmen extends RegularUnit
case object UtemSwordsmen extends RegularUnit
case object GuardianGolems extends RegularUnit
case object Illusionists extends RegularUnit
case object RedCapeMonks extends RegularUnit
case object NorthernMonks extends RegularUnit
case object SavageMonks extends RegularUnit

sealed trait EliteUnit extends AnyUnit

case object FireGolems extends EliteUnit
case object IceGolems extends EliteUnit
case object FireMages extends EliteUnit
case object IceMages extends EliteUnit
case object AmotepGunners extends EliteUnit
case object AmotepFreezers extends EliteUnit
case object Catapults extends EliteUnit
case object AltemMages extends EliteUnit
case object AltemGuardians extends EliteUnit