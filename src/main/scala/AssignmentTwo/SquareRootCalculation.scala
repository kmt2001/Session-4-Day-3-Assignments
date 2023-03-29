package AssignmentTwo

import scala.util.{Try, Success, Failure}

/**
  * A calculator that takes a list of integers as input and returns a list of their square roots
  */
class SquareRootCalculator {

  /**
    * Calculates the square roots of the input numbers using the map function and returns a list of the results.
    * If an exception occurs during the calculation, returns an empty list.
    *
    * @param numbersList a list of integers to calculate square roots for
    * @return a list of the square roots of the input numbers, or an empty list if an exception occurs
    */
  def calculateSquareRoots(numbersList: List[Int]): List[Double] = {
    val result = Try {
      numbersList.map(number => Math.sqrt(number))
    } match {
      case Success(list) => list
      case Failure(_: IllegalArgumentException) => List.empty[Double] // handle invalid argument exception
      case Failure(_: ArithmeticException) => List.empty[Double] // handle division by zero
      case Failure(_: NullPointerException) => List.empty[Double] // handle null input list
      case Failure(_) => List.empty[Double] // handle any other exception
    }
    result
  }
}
