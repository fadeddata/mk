package mageknight.tokens

sealed trait DraconumToken extends Token

case object FireDragon extends DraconumToken
case object HighDragon extends DraconumToken
case object IceDragon extends DraconumToken
case object SwampDragon extends DraconumToken

