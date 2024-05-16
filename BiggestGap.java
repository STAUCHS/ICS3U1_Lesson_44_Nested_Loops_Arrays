class BiggestGap extends ConsoleProgram {

  public void run() {
    int[] test = {1,5,7,2,4};
    System.out.println(biggestGap(test));
  }

  /**
  * Calculates the biggest gap within the numbers in the array
  * @param numArray	array of integers
  * @return the largest gap
  */ 
  public int biggestGap(int[] intArray) {
    int largestGap = 0; // keeps track of the current largest gap
    int gap; // keeps track of the current gap

    for (int i = 0; i < intArray.length-1; i++) {
      for (int j = i+1; j < intArray.length; j++) {
        gap = Math.abs(intArray[i] - intArray[j]);

        // Updates the largest gap if current gap is bigger
        if (gap > largestGap) {
          largestGap = gap;
        }
      }
    }

    return largestGap;
  }

}
