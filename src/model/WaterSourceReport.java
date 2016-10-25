package model;


import javafx.beans.property.*;
import java.time.LocalDate;

/**
 * Created by Taiga on 10/12/2016.
 */
public class WaterSourceReport {
    private final StringProperty time = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();
    private Location location;
    private final ObjectProperty<WaterCondition> condition = new SimpleObjectProperty<>();
    private final ObjectProperty<WaterType> type = new SimpleObjectProperty<>();
    private final ObjectProperty<LocalDate> date = new SimpleObjectProperty<>();
    private final IntegerProperty reportNum = new SimpleIntegerProperty();

    /**
     * initializes report time, water condition and type, and location object
     * @param condition water's condition
     * @param type water's type
     */
    public WaterSourceReport(int reportNum, String name, LocalDate date, String time, Location location, WaterCondition condition,
                             WaterType type) {
        this.name.set(name);
        this.reportNum.setValue(reportNum);
        this.date.set(date);
        this.time.set(time);
        this.location = location;
        this.condition.set(condition);
        this.type.set(type);
    }

    /**
     * returns time of report
     * @return time of report
     */
    public String getTime() {return time.get();}

    /**
     * returns location of report
     * @return location of report
     */
    public int getReportNum() {return reportNum.getValue();}

    /**
     * returns name of reporter
     * @return name of reporter of water report
     */
    public String getReporterName() {return name.get();}

    /**
     * returns time of report
     * @return time of report
     */
    public LocalDate getDate() {return date.get();}

    /**
     * returns location of report
     * @return location of report
     */
    public Location getLocation() {return location;}

    /**
     * returns location object of report
     * @return location object of report
     */
    public Location getLocationObject() {return location;}

    /**
     * returns water condition of report
     * @return water condition of report
     */
    public WaterCondition getCondition() {return condition.get();}

    /**
     * returns water type of report
     * @return water type of report
     */
    public WaterType getType() {return type.get();}

    /**
     * change time of report
     * @param time new time of report
     */
    public void setTime(String time) {this.time.set(time);}

    /**
     * change location of report
     * @param location new location of report
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * change water condition in report
     * @param condition new condition of water
     */
    public void setCondition(WaterCondition condition) {this.condition.set(condition);}

    /**
     * change water type in report
     * @param type new type of water
     */
    public void setType(WaterType type) {this.type.set(type);}

    /**
     * change water type in report
     * @param num new report number
     */
    public void setReportNum(int num) {this.reportNum.setValue(num);}

    /**
     * returns the string concatenation of the water report data
     * @return
     */
    @Override
    public String toString() {
        return "Source: " + reportNum.get() + " / "
                + date.get() + " / "
                + time.get() + " / "
                + location.getLatLongString() + "* / "
                + condition.get().toString() + " / "
                + type.get().toString();
    }
}