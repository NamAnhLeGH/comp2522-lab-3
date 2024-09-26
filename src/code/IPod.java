package code;

import java.util.Objects;

/**
 * Class representing an iPod device.
 */
public class IPod extends IDevice {
    private int storedSongCount;
    private final double maxVolumeDB;

    /**
     * Constructs an IPod with the specified stored song count and maximum volume.
     *
     * @param storedSongCount the number of songs stored in the iPod
     * @param maxVolumeDB     the maximum volume of the iPod in decibels
     */
    public IPod(final int storedSongCount, final double maxVolumeDB) {
        super("music");

        validateStoredSongCount(storedSongCount);
        validateMaxVolumeDB(maxVolumeDB);
        this.storedSongCount = storedSongCount;
        this.maxVolumeDB = maxVolumeDB;
    }

    /**
     * Validates the stored song count.
     *
     * @param storedSongCount the number of songs stored in the iPod
     * @throws IllegalArgumentException if the stored song count is negative
     */
    private void validateStoredSongCount(final int storedSongCount) {
        if (storedSongCount < 0) {
            throw new IllegalArgumentException("Stored song count of iPod must be non-negative");
        }
    }

    /**
     * Validates the maximum volume in decibels.
     *
     * @param maxVolumeDB the maximum volume of the iPod in decibels
     * @throws IllegalArgumentException if the maximum volume is negative
     */
    private void validateMaxVolumeDB(final double maxVolumeDB) {
        if (maxVolumeDB < 0) {
            throw new IllegalArgumentException("Max volume of iPod must be non-negative");
        }
    }

    /**
     * Returns the stored song count of the iPod.
     *
     * @return the number of songs stored in the iPod
     */
    public int getStoredSongCount() {
        return storedSongCount;
    }

    /**
     * Returns the maximum volume of the iPod in decibels.
     *
     * @return the maximum volume of the iPod in decibels
     */
    public double getMaxVolumeDB() {
        return maxVolumeDB;
    }

    /**
     * Sets the stored song count of the iPod.
     *
     * @param storedSongCount the number of songs to set
     */
    public void setStoredSongCount(final int storedSongCount) {
        validateStoredSongCount(storedSongCount);
        this.storedSongCount = storedSongCount;
    }

    /**
     * Prints the details of the iPod.
     */
    @Override
    public void printDetails() {
        System.out.println(this);
    }

    /**
     * Returns a string representation of the iPod.
     *
     * @return a string representation of the iPod
     */
    @Override
    public String toString() {
        return String.format("%s, stored songs count = %d, max volume = %f decibels",
                super.toString(),
                storedSongCount,
                maxVolumeDB);
    }

    /**
     * Compares this iPod to the specified object.
     * The result is true if and only if the argument is not null and is an
     * IPod object that has the same stored song count as this object.
     *
     * @param o the object to compare this IPod against
     * @return true if the given object represents an IPod equivalent to this iPod, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IPod iPod)) return false;
        if (!super.equals(o)) return false;
        return storedSongCount == iPod.storedSongCount;
    }

    /**
     * Returns a hash code for this iPod.
     *
     * @return a hash code value for this iPod
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), storedSongCount);
    }
}