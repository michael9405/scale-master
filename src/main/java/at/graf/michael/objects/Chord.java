package at.graf.michael.objects;

public class Chord {
    private Note rootNote;
    private String type;

    public Chord(Note rootNote, String type) {
        this.rootNote = rootNote;
        this.type = type;
    }

    public Note getRootNote() {
        return rootNote;
    }

    public void setRootNote(Note rootNote) {
        this.rootNote = rootNote;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return rootNote.getName() + type;
    }
}
