package at.graf.michael;

import at.graf.michael.objects.*;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("--- Major Scale Master ---");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a root note (e.g., C, C#, D...) or type 'exit' to quit: ");
            String input = scanner.nextLine().toUpperCase().trim();

            if (input.equals("EXIT")) {
                System.out.println("Happy songwriting! Goodbye.");
                break;
            }

            // converting String input to Enum
            Note root = null;
            for (Note n : Note.values()) {
                if (n.getName().equalsIgnoreCase(input)) {
                    root = n;
                    break;
                }
            }

            if (root != null) {
                // Initialize and calculate
                Scale scale = new Scale(root);
                scale.calulateNotesAndChords();

                // Display Results
                System.out.println(scale.toString());
            } else {
                System.out.println("Invalid note! Please use standard notation (C, C#, D, D#, E, F, F#, G, G#, A, A#, B).");
            }
        }

        scanner.close();

    }
}
