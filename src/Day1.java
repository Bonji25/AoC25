import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
    static int count = 50;
    static int zeroCount = 0;

    public static void main(String[] args) throws FileNotFoundException {
        String temp;
        File myObj = new File("resources/input.txt");
        Scanner sc = new Scanner(myObj);

        while (sc.hasNextLine()) {
            temp = sc.nextLine();
            if (temp.charAt(0) == 'L') {
                leftDial(temp.substring(1));

            } else
                rightDial(temp.substring(1));

        }
        System.out.println(zeroCount);

    }

    private static void leftDial(String dial) {
        int temp = Integer.parseInt(dial);
        count = count - temp;
        count = count % 100;
        if (count < 0) {
            count = count + 100;
        }
        if (count == 0) {
            zeroCount++;
        }
    }

    private static void rightDial(String dial) {
        int temp = Integer.parseInt(dial);
        count = temp + count;
        if (count < 0) {
            count = count + 100;
        }
        if (count % 100 == 0) {
            zeroCount++;
        }
    }
}


