import java.util.List;

class ListManager {

    static void printList(List<String> list) {
        System.out.println(String.join(" ", list));
    }

    static void append(List<String> list, String[] arr) {
        if (arr.length > 2) {
            System.out.println("Error: invalid command parameters");
        } else {
            list.add(arr[1]);
            ListManager.printList(list);
        }
    }

    static void prepend(List<String> list, String[] arr) {
        if (arr.length > 2) {
            System.out.println("Error: invalid command parameters");
        } else {
            list.add(0, arr[1]);
            ListManager.printList(list);
        }
    }
}
