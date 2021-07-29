package com.example.pojo;

public class ParkTable {
    private Integer id;

    private String parkName;

    private String parkFile;

    private Integer parkHot;

    private Double parkLongitude;

    private Double parkLatitude;

    private Integer parkMaxpeople;

    private String parkIntime;

    private String parkOuttime;

    private Integer parkNewpeople;

    private Integer parkWaittime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParkName() {
        return parkName;
    }

    public void setParkName(String parkName) {
        this.parkName = parkName == null ? null : parkName.trim();
    }

    public String getParkFile() {
        return parkFile;
    }

    public void setParkFile(String parkFile) {
        this.parkFile = parkFile == null ? null : parkFile.trim();
    }

    public Integer getParkHot() {
        return parkHot;
    }

    public void setParkHot(Integer parkHot) {
        this.parkHot = parkHot;
    }

    public Double getParkLongitude() {
        return parkLongitude;
    }

    public void setParkLongitude(Double parkLongitude) {
        this.parkLongitude = parkLongitude;
    }

    public Double getParkLatitude() {
        return parkLatitude;
    }

    public void setParkLatitude(Double parkLatitude) {
        this.parkLatitude = parkLatitude;
    }

    public Integer getParkMaxpeople() {
        return parkMaxpeople;
    }

    public void setParkMaxpeople(Integer parkMaxpeople) {
        this.parkMaxpeople = parkMaxpeople;
    }

    public String getParkIntime() {
        return parkIntime;
    }

    public void setParkIntime(String parkIntime) {
        this.parkIntime = parkIntime == null ? null : parkIntime.trim();
    }

    public String getParkOuttime() {
        return parkOuttime;
    }

    public void setParkOuttime(String parkOuttime) {
        this.parkOuttime = parkOuttime == null ? null : parkOuttime.trim();
    }

    public Integer getParkNewpeople() {
        return parkNewpeople;
    }

    public void setParkNewpeople(Integer parkNewpeople) {
        this.parkNewpeople = parkNewpeople;
    }

    public Integer getParkWaittime() {
        return parkWaittime;
    }

    public void setParkWaittime(Integer parkWaittime) {
        this.parkWaittime = parkWaittime;
    }
}