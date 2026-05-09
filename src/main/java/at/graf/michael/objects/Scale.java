package at.graf.michael.objects;

import java.util.ArrayList;
import java.util.Arrays;

public class Scale {
    private final String[] NOTES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};


    private Note rootNote;
    private ArrayList<Note> notesInScale = new ArrayList<Note>(7);
    private ArrayList<Chord> diatonicChords = new ArrayList<Chord>(7);

    public Scale(Note rootNote) {
        this.rootNote = rootNote;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // header
        sb.append("--- ").append(rootNote.getName()).append(" MAJOR SCALE ---\n");

        // displaying all notes of the major scale
        sb.append("Notes: ");
        for (int i = 0; i < notesInScale.size(); i++) {
            sb.append(notesInScale.get(i).getName());
            if (i < notesInScale.size() - 1) {
                sb.append(", ");
            }
        }

        sb.append("\n\n");

        // diplaying all diatonic chords
        sb.append("Diatonic Chords:\n");
        for (Chord chord : diatonicChords) {
            sb.append(chord.toString());
            if(chord.getType() != "dim") {
                sb.append(" - ");
            }
        }

        return sb.toString();
    }

    public void calulateNotesAndChords() {
        // Major-Scale steps
        int[] steps = {2, 2, 1, 2, 2, 2, 1};

        // starting with the root note
        Note currentNote = rootNote;

        for (int i = 0; i < 7; i++) {
            // add current note to scale
            notesInScale.add(currentNote);

            // determining chord type (I, ii, iii, IV, V, vi, VII°)
            String type;
            if (i == 0 || i == 3 || i == 4) {
                type = ""; // this is Major but for output readability its ""
            } else if (i == 6) {
                type = "dim";
            } else {
                type = "m";
            }
            diatonicChords.add(new Chord(currentNote, type));

            // calculate next note by adding the steps fromt the array
            int nextValue = (currentNote.getValue() + steps[i]) % 12;

            // Hier erstellen wir ein neues Note-Objekt für den nächsten Durchgang
            currentNote = Note.fromValue(nextValue);
        }



    }
}
