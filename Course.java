import java.util.ArrayList;

public class Course {
    private String id;
    private ArrayList<Timeslot> timeslots;
    private Course preRequire;

    public Course(String id) {
        this.id = id;
        this.timeslots = new ArrayList<>();
    }

    public Course(String id, Course preRequire) {
        this(id);
        this.preRequire = preRequire;
    }

    public boolean isEqualTo(Course o) {
        return this.id.equals(o.id);
    }

    public boolean isEqualTo(String o) {
        return this.id.equals(o);
    }

    public boolean hasPreRequire() {
        return preRequire != null;
    }

    public void addTimeslot(Timeslot t) {
        timeslots.add(t);
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        // String str = String.format("%s:{\n\stype:%s,\n\scrn:%s\n}", id, type, crn);
        String str = String.format("%s", id);
        for (Timeslot t : timeslots) {
            str += "\n\t" + t;
        }
        return str;
    }

    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }

}
