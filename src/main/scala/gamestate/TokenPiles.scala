package mageknight.gamestate

import mageknight._, tokens._

case class TokenPiles(
  orcs: Deck[OrcToken] = TokenPiles.orcs.shuffle,
  keeps: Deck[KeepToken] = TokenPiles.keeps.shuffle,
  mageTowers: Deck[MageTowerToken] = TokenPiles.mageTowers.shuffle,
  dungeons: Deck[DungeonToken] = TokenPiles.dungeons.shuffle,
  cities: Deck[CityToken] = TokenPiles.cities.shuffle,
  draconum: Deck[DraconumToken] = TokenPiles.draconum.shuffle,
  ruins: Deck[RuinsToken] = TokenPiles.ruins.shuffle
)

object TokenPiles {
  val orcs: Deck[OrcToken] = Deck(
    CursedHags,
    CursedHags,
    Diggers,
    Diggers,
    Ironclads,
    Ironclads,
    OrcSummoners,
    OrcSummoners,
    Prowlers,
    Prowlers,
    WolfRiders,
    WolfRiders 
  )

  val keeps: Deck[KeepToken] = Deck(
    Crossbowmen,
    Crossbowmen,
    Crossbowmen,
    Golems,
    Golems,
    Guardsmen,
    Guardsmen,
    Guardsmen,
    Swordmen,
    Swordmen
  )

  val mageTowers: Deck[MageTowerToken] = Deck(
    FireGolem,
    FireMages,
    FireMages,
    IceGolems,
    IceMages,
    IceMages,
    Illusionist,
    Illusionist,
    Monks,
    Monks
  )

  val dungeons: Deck[DungeonToken] = Deck(
    CryptWorm,
    CryptWorm,
    Gargoyle,
    Gargoyle,
    Medusa,
    Medusa,
    Minotaur,
    Minotaur,
    Werewolf,
    Werewolf
  )

  val cities: Deck[CityToken] = Deck(
    AltemGuardsmen,
    AltemGuardsmen,
    AltemMage,
    AltemMage,
    Freezers,
    Freezers,
    Freezers,
    Gunners,
    Gunners,
    Gunners
  )

  val draconum: Deck[DraconumToken] = Deck(
    FireDragon,
    FireDragon,
    HighDragon,
    HighDragon,
    IceDragon,
    IceDragon,
    SwampDragon,
    SwampDragon
  )

  val ruins: Deck[RuinsToken] = Deck(
    BlueMana,
    OrcMana,
    DraconumMana,
    CityMana,
    DungeonMageTower,
    DungeonDraconum,
    OrcDungeon,
    OrcOrc,
    OrcDraconum,
    KeepDungeon,
    KeepMageTower,
    KeepCity
  )
}
