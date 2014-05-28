package mageknight.tokens

sealed trait CityToken extends Token

case object AltemGuardsmen extends CityToken
case object AltemMage extends CityToken
case object Freezers extends CityToken
case object Gunners extends CityToken