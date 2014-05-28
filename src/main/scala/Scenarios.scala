package mageknight.scenarios

import mageknight.gamestate._
import mageknight._, tokens._, cards._, tiles._, skills._

sealed trait Scenario {
  val emptyPiles = TokenPiles(
    orcs = Deck.empty[OrcToken],
    keeps = Deck.empty[KeepToken],
    mageTowers = Deck.empty[MageTowerToken],
    dungeons = Deck.empty[DungeonToken],
    cities = Deck.empty[CityToken],
    draconum = Deck.empty[DraconumToken],
    ruins = Deck.empty[RuinsToken]
    )

  val emptyDecks = Decks(
    advancedActions = Deck.empty[AdvancedAction],
    eliteUnits = Deck.empty[EliteUnit],
    regularUnits = Deck.empty[RegularUnit],
    tiles = Deck.empty[Tile],
    spells = Deck.empty[Spell],
    artifacts = Deck.empty[Artifact]
    )

  val emptyOffers = Offers(
    advancedAction = List.empty[AdvancedAction],
    unit = List.empty[AnyUnit],
    spell = List.empty[Spell],
    commonSkillOffer = List.empty[Skill]
    )

  val emptyGameState = GameState(
    scenario = FirstReconnaissance,
    players = List.empty[PlayerState],
    dayNight = DayNight(),
    fame = Map.empty[PlayerState, Int],
    reputation = Map.empty[PlayerState, Int],
    dayTactics = List.empty[DayTactic],
    nightTactics = List.empty[NightTactic],
    roundOrder = List.empty[RoundOrder],
    map = GameMap(),
    piles = emptyPiles,
    decks = emptyDecks,
    offers = emptyOffers
    )

  def init(): GameState
}

case object FirstReconnaissance extends Scenario {
  def init() = emptyGameState
}

case object FullConquest extends Scenario {
  def init() = emptyGameState
}

case object BlitzConquest extends Scenario {
  def init() = emptyGameState
}

case object FullCooperation extends Scenario {
  def init() = emptyGameState
}

case object BlitzCooperation extends Scenario {
  def init() = emptyGameState
}

case object SoloConquest extends Scenario {
  def init() = emptyGameState
}

case object MinesLiberation extends Scenario {
  def init() = emptyGameState
}

case object DruidNights extends Scenario {
  def init() = emptyGameState
}

case object DungeonLords extends Scenario {
  def init() = emptyGameState
}

case object ConquerAndHold extends Scenario {
  def init() = emptyGameState
}

case object OneToReturn extends Scenario {
  def init() = emptyGameState
}
