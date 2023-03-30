package AssignmentFourTest

import AssignmentFour.OperationPerformer
import org.scalatest.funsuite.AnyFunSuite

import scala.util.Success

class OperationPerformerTest extends AnyFunSuite {

  test("perform addition with valid input") {
    val performer = new OperationPerformer()
    val input = List(Some(1.0), Some(2.0), Some(3.0))
    assert(performer.performArithmeticOperation(input, "addition") == Success(6.0))
  }

  test("perform addition with no valid input") {
    val performer = new OperationPerformer()
    val input = List(None, None, None)
    assert(performer.performArithmeticOperation(input, "addition").isFailure)
  }

  test("perform subtraction with valid input") {
    val performer = new OperationPerformer()
    val input = List(Some(10.0), Some(3.0))
    assert(performer.performArithmeticOperation(input, "subtraction") == Success(7.0))
  }

  test("perform subtraction with no valid input") {
    val performer = new OperationPerformer()
    val input = List(None, None)
    assert(performer.performArithmeticOperation(input, "subtraction").isFailure)
  }

  test("perform multiplication with valid input") {
    val performer = new OperationPerformer()
    val input = List(Some(2.0), Some(3.0), Some(4.0))
    assert(performer.performArithmeticOperation(input, "multiplication") == Success(24.0))
  }

  test("perform multiplication with no valid input") {
    val performer = new OperationPerformer()
    val input = List(None, None)
    assert(performer.performArithmeticOperation(input, "multiplication").isFailure)
  }

  test("perform division with valid input") {
    val performer = new OperationPerformer()
    val input = List(Some(10.0), Some(2.0), Some(5.0))
    assert(performer.performArithmeticOperation(input, "division") == Success(1.0))
  }

  test("perform division with only one valid input") {
    val performer = new OperationPerformer()
    val input = List(Some(5.0))
    assert(performer.performArithmeticOperation(input, "division").isFailure)
  }

  test("perform division with no valid input") {
    val performer = new OperationPerformer()
    val input = List(None, None)
    assert(performer.performArithmeticOperation(input, "division").isFailure)
  }

  test("perform unknown operation") {
    val performer = new OperationPerformer()
    val input = List(Some(1.0), Some(2.0), Some(3.0))
    assert(performer.performArithmeticOperation(input, "unknown").isFailure)
  }

}
