package mageknight

import scala.collection._
import scala.collection.mutable.{ArrayBuffer,ListBuffer, Builder}
import scala.collection.generic._
import scala.collection.immutable.VectorBuilder

object Deck extends SeqFactory[Deck] {  
  implicit def canBuildFrom[A]: CanBuildFrom[Coll, A, Deck[A]] =
    new GenericCanBuildFrom[A]
  def newBuilder[A] = new ListBuffer[A] mapResult (x => new Deck(x:_*))
}
 
class Deck[A](seq : A*) 
  extends Seq[A]
  with GenericTraversableTemplate[A, Deck]
  with SeqLike[A, Deck[A]] {
  
  override def companion = Deck
  def iterator: Iterator[A] = seq.iterator
  def apply(idx: Int): A = {
    if (idx < 0 || idx>=length) throw new IndexOutOfBoundsException
    seq(idx)
  }
  def length: Int = seq.size
  def shuffle = scala.util.Random.shuffle(this)
  def draw(n: Int = 1) = (this.take(n), this.drop(n))
}