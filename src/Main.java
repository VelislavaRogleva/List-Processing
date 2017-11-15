import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> list = Arrays.asList(reader.readLine().split("\\s+"));
        ListManager.printList(list);

        while (true) {
            String[] commandArgs = reader.readLine().split("\\s+");
            if (commandArgs[0].equals("end")) {
                break;
            }

            switch (commandArgs[0]) {

            }

        }


    }

}
