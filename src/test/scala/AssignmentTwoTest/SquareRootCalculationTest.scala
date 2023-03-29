package AssignmentTwoTest

import AssignmentTwo.SquareRootCalculator
import org.scalatest.funsuite.AnyFunSuite


class SquareRootCalculationTest extends AnyFunSuite {

  test("calculateSquareRoots returns the correct result for a valid input list") {
    val calculator = new SquareRootCalculator()
    assert(calculator.calculateSquareRoots(List(4, 9, 16)) === List(2.0, 3.0, 4.0))
  }

  test("calculateSquareRoots returns an empty list for an empty input list") {
    val calculator = new SquareRootCalculator()
    assert(calculator.calculateSquareRoots(List.empty[Int]) === List.empty[Double])
  }

  test("calculateSquareRoots handles IllegalArgumentException correctly") {
    val calculator = new SquareRootCalculator()
    assert(calculator.calculateSquareRoots(List(-1, 4, 9)) === List(Double.NaN, 2.0, 3.0))
  }

  test("calculateSquareRoots handles ArithmeticException correctly") {
    val calculator = new SquareRootCalculator()
    assert(calculator.calculateSquareRoots(List(4, 0, 9)) === List.empty[Double])
  }

  test("calculateSquareRoots handles NullPointerException correctly") {
    val calculator = new SquareRootCalculator()
    assert(calculator.calculateSquareRoots(null) === List.empty[Double])
  }
}
