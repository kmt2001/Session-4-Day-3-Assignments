package AssignmentFour

import scala.util.{Failure, Success, Try}

class OperationPerformer {
  /**
   * Performs an arithmetic operation on a list of numbers.
   *
   * @param numbers   A list of optional numbers
   * @param operation The operation to perform ("addition", "subtraction", "multiplication", and "division")
   * @return A Try containing the result of the operation, or a Failure if any errors occur
   */
  def performArithmeticOperation(numbers: List[Option[Double]], operation: String): Try[Double] = {
    // Filter out any None values from the list and extract the values of the remaining Some values
    val validNumbers = for {
      numberOption <- numbers
      if numberOption.isDefined
    } yield numberOption.get

    // If there are no valid numbers, return a Failure with an appropriate error message
    if (validNumbers.isEmpty) {
      Failure(new IllegalArgumentException("Input list should contain at least one non-empty element"))
    } else {
      // Perform the specified operation on the valid numbers and return a Success containing the result
      operation match {
        case "addition" =>
          Success(validNumbers.sum)
        case "subtraction" =>
          Success(validNumbers.reduce(_ - _))
        case "multiplication" =>
          Success(validNumbers.product)
        //extra feature
        case "division" =>
          validNumbers match {
            case numerator :: tail =>
              // Make sure that there is at least one valid number besides the numerator
              if (tail.isEmpty) {
                Failure(new IllegalArgumentException("Division operation requires at least two non-empty elements"))
              } else {
                // Perform the division operation on the valid numbers and return a Success containing the result
                val denominator = tail.product
                Success(numerator / denominator)
              }
            case _ =>
              Failure(new IllegalArgumentException("Division operation requires at least one non-empty element"))
          }
        // If an unsupported operation is requested, return a Failure with an appropriate error message
        case _ =>
          Failure(new IllegalArgumentException(s"Unsupported operation: $operation"))
      }
    }
  }
}
