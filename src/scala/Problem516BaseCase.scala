package scala

import utils.Euler
import scala.collection.JavaConversions._

object Problem516BaseCase extends App {
  def isHamming(n: Int): Boolean = {
    val factors = Euler.primeFactorList(Euler.phi(n))
    factors.isEmpty || factors.max <= 5
  }
  def S(L: Int): Int = {
    (1 to L).filter(isHamming).sum
  }
  println(S(100))
}
