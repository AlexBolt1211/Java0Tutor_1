package by.traning.tutor.classes.task13;

public class Town {
    private String name;
    private Boolean districtTown = null;
    public Boolean capitalTown = null;

    public Town(){};

    public Town(String name, Boolean districtTown, Boolean capitalTown) {
        this.name = name;
        this.districtTown = districtTown;
        this.capitalTown = capitalTown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDistrictTown() {
        return districtTown;
    }

    public void setDistrictTown(Boolean districtTown) {
        this.districtTown = districtTown;
    }

    public Boolean getCapitalTown() {
        return capitalTown;
    }

    public void setCapitalTown(Boolean capitalTown) {
        this.capitalTown = capitalTown;
    }
}
