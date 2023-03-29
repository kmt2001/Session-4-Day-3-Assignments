import AssignmentOne.CapitalizeAlphabetA
import org.scalatest.funsuite.AnyFunSuite

import scala.util.{Failure, Success}

class CapitalizeAlphabetATest extends AnyFunSuite {
  val capitalizeAlphabetA = new CapitalizeAlphabetA()

  test("CapitalizeAs should return string with all 'a's capitalized") {
    assert(capitalizeAlphabetA.capitalizeAs("apple") == "Apple")
    assert(capitalizeAlphabetA.capitalizeAs("Apple") == "Apple")
    assert(capitalizeAlphabetA.capitalizeAs("aPpLe") == "APpLe")
  }

  test("CapitalizeAs should throw NullPointerException when input string is null") {
    assertThrows[NullPointerException] {
      capitalizeAlphabetA.capitalizeAs(null)
    }
  }

  test("CapitalizeAllAs should return a new list of strings with all 'a's capitalized") {
    assert(capitalizeAlphabetA.capitalizeAllAs(List("apple", "banana", "cAr", "dog")) == Success(List("Apple", "bAnAnA", "cAr", "dog")))
    assert(capitalizeAlphabetA.capitalizeAllAs(List()) == Success(List()))
  }

  test("CapitalizeAllAs should return Failure when input list contains null") {
    assert(capitalizeAlphabetA.capitalizeAllAs(List("apple", null, "banana")).isInstanceOf[Failure[_]])
  }
}
