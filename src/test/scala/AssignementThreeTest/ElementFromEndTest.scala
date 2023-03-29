package AssignementThreeTest

import AssignmentThree.KthElementFromEnd
import org.scalatest.funsuite.AnyFunSuite

class KthElementFromEndTest extends AnyFunSuite {

  test("getKthElementFromEnd returns None when k is less than or equal to 0") {
    val list = List(1, 2, 3, 4, 5)
    val kthElementFromEnd = new KthElementFromEnd(list)

    assert(kthElementFromEnd.getKthElementFromEnd(0) === None)
    assert(kthElementFromEnd.getKthElementFromEnd(-1) === None)
  }

  test("getKthElementFromEnd returns None when the list is empty") {
    val list = List.empty[Int]
    val kthElementFromEnd = new KthElementFromEnd(list)

    assert(kthElementFromEnd.getKthElementFromEnd(1) === None)
  }
}