package mageknight.tokens

sealed trait OrcToken extends Token

case object CursedHags extends OrcToken
case object Diggers extends OrcToken
case object Ironclads extends OrcToken
case object OrcSummoners extends OrcToken
case object Prowlers extends OrcToken
case object WolfRiders extends OrcToken
