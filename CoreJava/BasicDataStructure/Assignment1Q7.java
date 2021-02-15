package DataStructure;

public class Assignment1Q7 {
    public static void main(String[] args) {
        int[] arr = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valueToCheck = 20;
        SearchArray obj = new SearchArray();

        boolean searchArray = obj.searchArray(arr,valueToCheck);
        System.out.println(searchArray);


    }
}
class SearchArray{
    public boolean searchArray(int[] arr, int valueToCheck){
        for (int element : arr){
            if (element == valueToCheck){
                return true;
            }
        }
        return false;
    }
}
