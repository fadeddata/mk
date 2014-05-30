package mageknight.gamestate

import mageknight._, cards._, skills._, heroes._

case class PlayerState(
  hero: Hero,
  skillPile: Deck[Skill],
  deedDeck: Deck[Deed],
  hand: List[Deed],
  discard: List[Deed],
  skills: List[Skill],
  units: List[AnyUnit]
  )

object PlayerState {
  val norowas = PlayerState(
    hero = Norowas,
    skillPile = Deck(
      ForwardMarch,
      DaySharpshooting,
      Inspiration,
      BrightNegotiation,
      LeavesInTheWind,
      WhispersInTheTreetops,
      Leadership,
      BondsOfLoyalty,
      Motivation_Norowas,
      PrayerOfWeather
    ),
    deedDeck = Deck(
      Rage,
      Determination,
      Swiftness,
      March,
      Stamina,
      Tranquility,
      Promise,
      Threaten,
      Crystallize,
      ManaDraw,
      Concentration,
      Improvisation,
      NobleManners
    ),
    hand = List.empty[Deed],
    discard = List.empty[Deed],
    skills = List.empty[Skill],
    units = List.empty[AnyUnit]
  )

  val arythea = PlayerState(
    hero = Arythea,
    skillPile = Deck(
      DarkPaths,
      BurningPower,
      HotSwordsmanship,
      DarkNegotiation,
      DarkFireMagic,
      PowerOfPain,
      Invocation,
      Polarization,
      Motivation_Arythea,
      HealingRitual
    ),
    deedDeck = Deck(
      Rage,
      Determination,
      Swiftness,
      March,
      Stamina,
      Tranquility,
      Promise,
      Threaten,
      Crystallize,
      ManaDraw,
      Concentration,
      Improvisation,
      BattleVersatility
    ),
    hand = List.empty[Deed],
    discard = List.empty[Deed],
    skills = List.empty[Skill],
    units = List.empty[AnyUnit]
  )

  val tovak = PlayerState(
    hero = Tovak,
    skillPile = Deck(
      DoubleTime,
      NightSharpshooting,
      ColdSwordsmanship,
      ShieldMastery,
      ResistanceBreak,
      IFeelNoPain,
      IDontGiveADamn,
      WhoNeedsMagic,
      Motivation_Tovak,
      ManaExploit
    ),
    deedDeck = Deck(
      Rage,
      Determination,
      Swiftness,
      March,
      Stamina,
      Tranquility,
      Promise,
      Threaten,
      Crystallize,
      ManaDraw,
      Concentration,
      Improvisation,
      ColdToughness
    ),
    hand = List.empty[Deed],
    discard = List.empty[Deed],
    skills = List.empty[Skill],
    units = List.empty[AnyUnit]
  )

  val goldyx = PlayerState(
    hero = Goldyx,
    skillPile = Deck(
      FreezingPowers,
      PotionMaking,
      WhiteCrystalCraft,
      GreenCrystalCraft,
      RedCrystalCraft,
      GlitteringFortune,
      Flight,
      UniversalPower,
      Motivation_Goldyx,
      SourceFreeze
    ),
    deedDeck = Deck(
      Rage,
      Determination,
      Swiftness,
      March,
      Stamina,
      Tranquility,
      Promise,
      Threaten,
      Crystallize,
      ManaDraw,
      Concentration,
      Improvisation,
      WillFocus
    ),
    hand = List.empty[Deed],
    discard = List.empty[Deed],
    skills = List.empty[Skill],
    units = List.empty[AnyUnit]
  )
}