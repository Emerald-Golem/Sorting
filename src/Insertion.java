import java.util.ArrayList;

public class Insertion {
    public static <T extends Comparable<T>> void sort(T[]arr){
        for(int j = 1; j<arr.length; j++){
            T temp = arr[j];
            for(int i = j; i>=-1;i--){
                if(i>=0&&temp.compareTo(arr[i])>0){
                    arr[i+1] = arr[i];
                }else{
                    arr[i] = temp;
                    break;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sort(ArrayList<T> arr){
        for(int j = 1; j<arr.size(); j++){
            T temp = arr.get(j);
            for(int i = j; i>=-1;i--){
                if(i>=0&&temp.compareTo(arr.get(i))>0){
                    arr.set(i+1, arr.get(i));
                }else{
                    arr.set(i,temp);
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        Integer[] arr = new Integer[10];
        for(int i = 9; i>=0; i--){
            arr[i]=i;
        }
        String[] arr2 = {"b","a","z","zebra","abel","big","large","hamburger","not ham","small"};
        sort(arr);
        sort(arr2);
        for( int i = 0; i<10; i++) {
            System.out.println(arr[i]);
        }
        for( int i = 0; i<10; i++) {
            System.out.println(arr2[i]);
        }
        ArrayList<Integer> arr3 = new ArrayList<>();
        for(int i = 9; i>=0; i--){
            arr3.add(i);
        }
        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("b");
        arr4.add("a");
        arr4.add("z");
        arr4.add("zebra");
        arr4.add("abel");
        arr4.add("big");
        arr4.add("large");
        arr4.add("hamburger");
        arr4.add("not ham");
        arr4.add("small");
        sort(arr3);
        sort(arr4);
        for( int i = 0; i<10; i++) {
            System.out.println(arr3.get(i));
        }
        for( int i = 0; i<10; i++) {
            System.out.println(arr4.get(i));
        }

    }
}

