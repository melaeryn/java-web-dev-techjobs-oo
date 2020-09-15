package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer1, Location location1, PositionType position, CoreCompetency competency){
        this();
        this.name = name;
        this.employer = employer1;
        this.location = location1;
        this.positionType = position;
        this.coreCompetency = competency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString(){
        String toPrint ="\nID: "+ id + "\n";
        int oops = 0;
        if(name == null) {
            toPrint += "Name: Data not available\n";
            oops++;
        }
        else {
            toPrint += "Name: "+ name + "\n";
        }
        if(employer == null) {
            toPrint += "Employer: Data not available\n";
            oops++;
        }
        else {
            toPrint += "Employer: "+ employer.toString() + "\n";
        }

        if(location == null) {
            toPrint += "Location: Data not available\n";
            oops++;
        }
        else {
            toPrint += "Location: "+ location.toString() + "\n";
        }

        if(positionType == null) {
            toPrint += "Position Type: Data not available\n";
            oops++;
        }
        else {
            toPrint += "Position Type: "+ positionType.toString() + "\n";
        }

        if(coreCompetency == null) {
            toPrint += "Core Competency: Data not available\n";
            oops++;
        }
        else {
            toPrint += "Core Competency: "+ coreCompetency.toString() + "\n";
        }
        if(oops == 5){
            return "OOPS! This job does not seem to exist.";
        }

        return toPrint;
    }
}
