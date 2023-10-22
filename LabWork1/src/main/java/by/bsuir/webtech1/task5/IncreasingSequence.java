package by.bsuir.webtech1.task5;

public class IncreasingSequence {
    public static int CountRemovingElements(int[] array){
        int countOfRemovedElements = array.length + 1;
        int sizeOfIncreasingSequence = 1;

        for (int i = 0; i < array.length; i++) {
            long currentLargestElement = array[i];
            int currentCountOfRemovedElements = 0;
            int currentSizeOfIncreasingSequence = 0;
            for (int j = i + 1; j < array.length; j++) {
                if (currentLargestElement < array[j]) {
                    currentLargestElement = array[j];
                    currentSizeOfIncreasingSequence++;
                }
                else {
                    currentCountOfRemovedElements++;
                }
            }
            if (sizeOfIncreasingSequence < currentSizeOfIncreasingSequence
                    || (currentCountOfRemovedElements < countOfRemovedElements
                    && sizeOfIncreasingSequence == currentSizeOfIncreasingSequence)) {
                countOfRemovedElements = currentCountOfRemovedElements + i;
                sizeOfIncreasingSequence = currentSizeOfIncreasingSequence;
            }

        }
            return countOfRemovedElements;
    }
}
