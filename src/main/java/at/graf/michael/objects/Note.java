package at.graf.michael.objects;

public enum Note {
    C("C",0), C_SHARP("C#",1), D("D",2), D_SHARP("D#",3), E("E",4), F("F",5),
    F_SHARP("F#",6), G("G",7), G_SHARP("G#",8), A("A",9), A_SHARP("A#",10), B("B",11);

    private final String name;
    private final Integer value;

    Note(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

    public static Note fromValue(int value) {
        // If value is above 11 > restarts at 0
        int normalized = value % 12;
        for (Note n : Note.values()) {
            if (n.getValue() == normalized) {
                return n;
            }
        }
        return C;
    }

}
