package at.graf.michael.objects;

import java.util.ArrayList;

public class Scale {
    private final String[] NOTES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};


    private Note rootNote;
    private Boolean majorScale;
    private ArrayList<Note> notesInScale = new ArrayList<Note>(7);
    private ArrayList<Chord> diatonicChords = new ArrayList<Chord>(7);

    public Scale(Note rootNote, Boolean majorScale) {
        this.rootNote = rootNote;
        this.majorScale = majorScale;
    }

    public void calulateNotesAndChords() {
        String scaleSteps = "";
        if(this.majorScale == true) {
            scaleSteps = "WWHWWWH";
        } else {
            scaleSteps = "WHWWHWW";
        }

        Note currentNote = rootNote;

        for (int i = 0; i < scaleSteps.length(); i++) {

            if(scaleSteps.charAt(i) == 'W') {

            }

        }
    }
}
