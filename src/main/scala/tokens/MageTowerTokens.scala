package mageknight.tokens

sealed trait MageTowerToken extends Token

case object FireGolem extends MageTowerToken
case object FireMages extends MageTowerToken
case object IceGolems extends MageTowerToken
case object IceMages extends MageTowerToken
case object Illusionist extends MageTowerToken
case object Monks extends MageTowerToken