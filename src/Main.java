import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = new ArrayList<>(Arrays.asList(reader.readLine().split("\\s+")));
        ListManager.printList(list);

        while (true) {
            String[] commandArgs = reader.readLine().split("\\s+");

            switch (commandArgs[0]) {
                case "append":
                    ListManager.append(list, commandArgs);
                    break;
                case "prepend":
                    ListManager.prepend(list, commandArgs);
                    break;
                case"reverse":
                    ListManager.reverse(list, commandArgs);
                    break;
                case"insert":
                    ListManager.insert(list, commandArgs);
                    break;
                case"delete":
                    ListManager.delete(list,commandArgs);
                    break;
                    default:
                        System.out.println("Error: invalid command");
                        break;

            }

        }


    }

}
