import AssignmentOne.CapitalizeAlphabetA
import AssignmentThree.KthElementFromEnd
import AssignmentTwo.SquareRootCalculator


object Driver extends App
  {
    //Driver code for KthElementFromEnd
    val list = List(1, 2, 3, 4, 5, 6)
    private val kthElement = new KthElementFromEnd(list).getKthElementFromEnd(2)
    kthElement match {
    case Some(value) => println(s"The 2nd element from the end of $list is $value")
    case None => println("The list is empty or k is less than or equal to 0")
  }

    // Driver code for SquareRootCalculator
  {
    val calculator = new SquareRootCalculator()
    val numbersList = List(4, 16, 25, 36)
    val squareRootsList = calculator.calculateSquareRoots(numbersList)
    println(squareRootsList)
  }

    // Driver code for CapitalizeAlphabetA
  {
    val capitalizeAlphabetA = new CapitalizeAlphabetA()
    val inputList = List("My", "name", "is", "Michael", "Scott")
    val outputList = capitalizeAlphabetA.capitalizeAllAs(inputList)
    println(outputList) // Prints: List(My, nAme, is, MichAel, Scott)
  }

}
