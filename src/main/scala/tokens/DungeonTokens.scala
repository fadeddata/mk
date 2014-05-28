package mageknight.tokens

sealed trait DungeonToken extends Token

case object CryptWorm extends DungeonToken
case object Gargoyle extends DungeonToken
case object Medusa extends DungeonToken
case object Minotaur extends DungeonToken
case object Werewolf extends DungeonToken
