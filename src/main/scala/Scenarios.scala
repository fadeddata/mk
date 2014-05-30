package mageknight.scenarios

import mageknight._, tokens._, cards._, tiles._, skills._, gamestate._, heroes._
import GameState._

sealed trait Scenario {
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
    dayNight = Day,
    fame = Map.empty[Hero, Int],
    reputation = Map.empty[Hero, Int],
    dayTactics = DayTactic.tactics,
    nightTactics = NightTactic.tactics,
    roundOrder = List.empty[Hero],
    map = GameMap(),
    piles = TokenPiles(),
    decks = emptyDecks,
    offers = emptyOffers
    )

  def init( playerStates: List[PlayerState] ): GameState = {
    (playersLens ~ fameLens ~ reputationLens ~ roundOrderLens).
      set(emptyGameState)(
        playerStates,
        playerStates.map(_.hero -> 0).toMap[Hero, Int],
        playerStates.map(_.hero -> 0).toMap[Hero, Int],
        playerStates.map(_.hero)
      )
  }
}

case object FirstReconnaissance extends Scenario {
}

case object FullConquest extends Scenario {
}

case object BlitzConquest extends Scenario {
}

case object FullCooperation extends Scenario {
}

case object BlitzCooperation extends Scenario {
}

case object SoloConquest extends Scenario {
}

case object MinesLiberation extends Scenario {
}

case object DruidNights extends Scenario {
}

case object DungeonLords extends Scenario {
}

case object ConquerAndHold extends Scenario {
}

case object OneToReturn extends Scenario {
}
