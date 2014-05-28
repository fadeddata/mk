package mageknight.gamestate

import mageknight._, scenarios._, cards._
import shapeless._

case class GameState(
  scenario: Scenario,
  players: List[PlayerState],
  dayNight: DayNight,
  fame: Map[PlayerState, Int],
  reputation: Map[PlayerState, Int],
  dayTactics: List[DayTactic],
  nightTactics: List[NightTactic],
  roundOrder: List[RoundOrder],
  map: GameMap,
  piles: TokenPiles,
  decks: Decks,
  offers: Offers
  )

object GameState {
  val scenarioLens     = lens[GameState] >> 'scenario
}