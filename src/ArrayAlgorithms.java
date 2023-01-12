import java.util.Locale;

public class ArrayAlgorithms {
    public static void printExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(wordList[i] + "!");
        }
    }
    public static int sum(int[] numList)
    {int total = 0;
        for (int i = 0; i < numList.length; i++) {
            total += numList[i];
        }
        return total;
    }
    public static double average(int[] numList)
    { return sum(numList)/(double)numList.length;
    }
    public static int minimum(int[] numList)
    {int min = numList[0];
        for (int i = 1; i < numList.length; i++) {
            if(numList[i] < min){
                min = numList[i];
            }
        }
        return min;
    }
    public static int maximum(int[] numList)
    {int max = numList[0];
        for (int i = 1; i < numList.length; i++){
            if(numList[i] > max){
                max= numList[i];
            }
        }
        return max;
    }
    public static void multiplyBy(int[] numList, int multiplier)
    {for (int i = 0; i < numList.length; i++)
    {
        numList[i] = numList[i] * multiplier;
    }
    }
    public static int[] squares(int[] numList)
    {
        int[] squaredList = new int[numList.length];
        for (int i = 0; i < numList.length; i++)
        {
            squaredList[i] = (int)Math.pow(numList[i], 2);
        }
        return squaredList;
    }

    public static void flipBool(boolean[] boolList)
    {
        for (int i = 0; i < boolList.length; i++)
        {
            boolList[i] = !boolList[i];
        }

    }
    public static String customToString(int[] numList)
    { String toString = "[";
        if (numList.length > 1) {
            for (int i = 0; i < numList.length - 1; i++) {
                toString += numList[i] + ", ";
            }
        }
        return toString + numList[numList.length - 1] + "]";
    }
    public static int longestString(String[] stringList)
    {
        int max = 0;
        for(String longe : stringList){
            int length = longe.length();
            if(length > max){
                max = length;
            }
        }
        return max;
    }
    public static void makeUppercase(String[] wordList)
    {
        for(int i = 0; i < wordList.length; i++){
            wordList[i]= wordList[i].toUpperCase();
        }
    }


    public static boolean containsPositive(int[] numList)
    {
        int count = 0;
        for(int i = 0; i < numList.length; i++){
            if(numList[i] > 0){
                count++;
            }
        }
        return(count > 0);
    }

    public static boolean containsString(String[] stringList, String searchStr)
    {
        int count = 0;
        for(int i = 0; i < stringList.length; i++){
            if(stringList[i].toLowerCase().contains(searchStr.toLowerCase())){
                count++;
            }
        }
        return (count>0);
    }
    public static String[] makeLowercase(String[] wordList)
    {
        String[] lower = new String[wordList.length];

        for(int i = 0; i < wordList.length; i++){
            lower[i] = wordList[i].toLowerCase();
        }
        return lower;
    }
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] max = new int[intArr1.length];
        for(int i = 0; i < intArr1.length; i++){
            if(intArr1[i] > intArr2[i]){
                max[i] = intArr1[i];
            }
            else if(intArr1[i] < intArr2[i]){
                max[i] = intArr2[i];
            }
            else{
                max[i] = intArr2[i];
            }
        }
        return max;
    }
    public static int endsInExclamations(String[] stringList)
    {
        int count = 0;
        for (String str : stringList){
            if (str.substring(str.length()-1) .equals("!")){
                count++;
            }
        }
        return count;

    }
    public static int countConsecutiveDoubles(int[] numList)
    {
        int current = numList[0];
        int next = 0;
        int count = 0;
        for(int i = 0; i < numList.length-1; i++){
            current = numList[i];
            next = numList[i+1];
            if(current == next){
                count++;
            }
        }
        return count;
    }
    public static int[] shiftLeft(int[] numList)
    {
        int[] list = new int[numList.length];
        int max = numList.length-1;
        for(int i = 0;i< numList.length;i++){
            int a = i;
            if ((a - 1) == -1){
                a = max;
            }
            else a = a - 1;
            list[a] = numList[i];
        }
        return list;
    }
    public static void shiftLeftModify(int[] numList)
    {
        int max = numList.length-1;
        for(int i = 0;i< numList.length;i++){
            int a  = i;
            if((a-1) == -1){
                a = max;
                numList[a] = numList[i];
            }
            else  a =a-1;
            numList[a] = numList[i];
        }
    }

}
