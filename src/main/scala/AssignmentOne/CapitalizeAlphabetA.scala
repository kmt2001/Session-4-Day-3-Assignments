package AssignmentOne

import scala.util.Try

class CapitalizeAlphabetA {

  /**
   * Capitalizes all occurrences of 'a' or 'A' in a list of strings.
   *
   * @param strings A list of strings to capitalize.
   * @return A new list of strings with all 'a's capitalized.
   */
  def capitalizeAllAs(strings: List[String]): Try[List[String]] = {
    Try {
      strings.map { string =>
        capitalizeAs(string)
      }
    }
  }

  /**
   * Capitalizes all occurrences of 'a' or 'A' in a single string.
   *
   * @param inputString The string to capitalize.
   * @return A new string with all 'a's capitalized.
   */
  def capitalizeAs(inputString: String): String = {
    if (inputString.isEmpty) {
      throw new IllegalArgumentException("Input string is empty")
    } else {
      inputString.map(character => if (character == 'a' || character == 'A') 'A' else character)
    }
  }
}

//TEST CASES ARE IN TEST FOLDER.