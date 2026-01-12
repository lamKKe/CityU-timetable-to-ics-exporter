public class Timeslot {
    private String crn, startTime, endTime, startDate, endDate, weekday, location, type;

    /**
     * Constructor for Timeslot.
     * 
     * @param crn
     * @param type
     * @param startTime
     * @param endTime
     * @param startDate
     * @param endDate
     * @param weekday
     * @param location
     * 
     */
    public Timeslot(String crn, String type, String startTime, String endTime, String startDate, String endDate,
            String weekday,
            String location) {
        this.crn = crn;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startDate = startDate;
        this.endDate = endDate;
        this.weekday = weekday;
        this.location = location;
        this.type = type;
    }

    public String toString() {
        return String.format("%s %s %s-%s %s-%s %s %s", crn, type, startTime, endTime, startDate, endDate, weekday,
                location);
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }
}
