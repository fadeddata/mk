package mageknight.tokens

sealed trait KeepToken extends Token

case object Crossbowmen extends KeepToken
case object Golems extends KeepToken
case object Guardsmen extends KeepToken
case object Swordmen extends KeepToken
