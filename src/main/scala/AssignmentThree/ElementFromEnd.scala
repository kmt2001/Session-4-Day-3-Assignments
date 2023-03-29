package AssignmentThree

class KthElementFromEnd[A](list: List[A]) {

  /**
   * Returns the kth element from the end of the list, where k is a positive integer.
   * If k is greater than the length of the list or the list is empty, None is returned.
   *
   * @param kthPosition the position of the element to be returned from the end of the list
   * @return an Option that contains the kth element from the end of the list, or None if k is invalid or the list is empty
   */
  def getKthElementFromEnd(kthPosition: Int): Option[A] = {
    try {
      if (kthPosition <= 0 || list.isEmpty) None
      else {
        val kthElementFromStart = list.drop(list.length - kthPosition).headOption
        kthElementFromStart
      }
    } catch {
      case _: Throwable => None // catch any exception and return None
    }
  }
}
