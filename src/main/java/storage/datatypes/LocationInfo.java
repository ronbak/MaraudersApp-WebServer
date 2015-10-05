package storage.datatypes;

import storage.mongostoragemodel.Location;

import java.time.ZonedDateTime;

/**
 * Created by joe on 10/2/15
 */
public class LocationInfo implements Comparable<LocationInfo> {

    private double latitude;
    private double longitude;
    private ZonedDateTime time;

    public LocationInfo(double latitude, double longitude, ZonedDateTime time) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.time = time;
    }

    public LocationInfo(Location l) {
        this(l.getLatitude(), l.getLongitude(), l.getTime());
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    @Override
    public int compareTo(LocationInfo locationInfo) {
        return time.compareTo(locationInfo.time);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationInfo that = (LocationInfo) o;

        return time.equals(that.time);

    }

    @Override
    public int hashCode() {
        return time.hashCode();
    }
}