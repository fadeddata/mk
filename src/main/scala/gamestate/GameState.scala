package mageknight.gamestate

import mageknight._, scenarios._, cards._, heroes._
import shapeless._

case class GameState(
  scenario: Scenario,
  players: List[PlayerState],
  dayNight: DayNight,
  fame: Map[Hero, Int],
  reputation: Map[Hero, Int],
  dayTactics: List[DayTactic],
  nightTactics: List[NightTactic],
  roundOrder: List[Hero],
  map: GameMap,
  piles: TokenPiles,
  decks: Decks,
  offers: Offers
  )

object GameState {
  val fameLens         = lens[GameState] >> 'fame
  val reputationLens   = lens[GameState] >> 'reputation
  val roundOrderLens   = lens[GameState] >> 'roundOrder
  val scenarioLens     = lens[GameState] >> 'scenario
  val playersLens      = lens[GameState] >> 'players
}