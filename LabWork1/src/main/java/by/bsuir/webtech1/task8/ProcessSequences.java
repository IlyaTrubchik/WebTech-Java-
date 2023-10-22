package by.bsuir.webtech1.task8;


import java.util.ArrayList;

public class ProcessSequences {
    public static ArrayList<Integer> mergeSequences(int[] firstSequence, int[] secondSequence){
        ArrayList<Integer> indexes = new ArrayList<>();
        int fIndex = 0 ;
        int sIndex = 0;
        int[] mergedSequence = new int[firstSequence.length+secondSequence.length];
        int i = 0;

        while( i<mergedSequence.length && fIndex<firstSequence.length && sIndex<secondSequence.length )
        {
            if(firstSequence[fIndex]<=secondSequence[sIndex])
            {
                mergedSequence[i] = firstSequence[fIndex];
                fIndex++;
            }else
            {
                mergedSequence[i] = secondSequence[sIndex];
                indexes.add(i);
                sIndex++;
            }
            i++;
        }
        if (fIndex >= firstSequence.length) {
            while (i < mergedSequence.length) {
                mergedSequence[i] = secondSequence[sIndex];
                indexes.add(i);
                sIndex++;
                i++;
            }
        } else {
            while(i < mergedSequence.length){
                mergedSequence[i] = firstSequence[fIndex];
                fIndex++;
                i++;
            }
        }
        return indexes;

    }

}
