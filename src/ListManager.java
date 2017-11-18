import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class ListManager {

    static void printList(List<String> list) {
        System.out.println(String.join(" ", list));
    }

    static void append(List<String> list, String[] arr) {
        if (arr.length != 2) {
            System.out.println("Error: invalid command parameters");
        } else {
            list.add(arr[1]);
            ListManager.printList(list);
        }
    }

    static void prepend(List<String> list, String[] arr) {
        if (arr.length != 2) {
            System.out.println("Error: invalid command parameters");
        } else {
            list.add(0, arr[1]);
            ListManager.printList(list);
        }
    }

    public static void reverse(List<String> list, String[] arr) {
        if (arr.length != 1){
            System.out.println("Error: invalid command parameters");
        } else {
            Collections.reverse(list);
            ListManager.printList(list);
        }
    }

    public static void insert(List<String> list, String[] arr) {
        if (arr.length != 3 || !arr[1].matches("-*\\d")){
            System.out.println("Error: invalid command parameters");
        }
        else {
            int index = Integer.parseInt(arr[1]);
            if (index < 0 || index > list.size()-1){
                System.out.printf("Error: invalid index %d%n", index);
            }
            else{
                list.add(index, arr[2]);
                ListManager.printList(list);
            }
        }
    }

    public static void delete(List<String> list, String[] arr) {
        if (arr.length != 2 || !arr[1].matches("\\d")){
            System.out.println("Error: invalid command parameters");
        }
        else{
            int index = Integer.parseInt(arr[1]);
            if (index < 0 || index > list.size()-1){
                System.out.printf("Error: invalid index %d%n", index);
            }
            else{
                list.remove(index);
                ListManager.printList(list);
            }
        }
    }

    public static void roll(List<String> list, String[] arr){
        if (arr.length != 2 || !arr[1].equals("left") && !arr[1].equals("right")){

            System.out.println("Error: invalid command parameters");

        } else if(arr[1].equals("right")){

            Collections.rotate(list,1);

            ListManager.printList(list);
        } else {
            Collections.rotate(list,-1);

            ListManager.printList(list);
        }
    }

    public static void sort(List<String> list, String[] arr){
        if (arr.length != 1){

            System.out.println("Error: invalid command parameters");

        } else {
            Collections.sort(list);

            ListManager.printList(list);
        }
    }
    public static void count(List<String> list, String[] arr){
        if (arr.length != 2) {
            System.out.println("Error: invalid command parameters");
        }
        else {
            int frequency = Collections.frequency(list, arr[1]);
            System.out.println(frequency);
        }
    }
    public static void end(List<String> list, String[] arr) {
        if  (arr.length != 1) {
            System.out.println( "Error: invalid command parameters");
        }
        else {
            System.out.println( "Finished");
            System.exit(0);
        }
    }

}
