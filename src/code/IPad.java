package code;

import java.util.Objects;

/**
 * Class representing an iPad device.
 */
public class IPad extends IDevice {
    private boolean hasCase;
    private String OSVersion;

    /**
     * Constructs an IPad with the specified case status and OS version.
     *
     * @param hasCase  whether the iPad has a case
     * @param OSVersion the OS version of the iPad
     */
    public IPad(boolean hasCase, String OSVersion) {
        super("learning");

        validateOSVersion(OSVersion);
        this.hasCase = hasCase;
        this.OSVersion = OSVersion;
    }

    /**
     * Validates IPad's OS version.
     *
     * @param OSVersion the OS version of the iPad
     */
    private void validateOSVersion(String OSVersion) {
        if (OSVersion == null || OSVersion.isBlank()) {
            throw new IllegalArgumentException("OSVersion must not be null or blank");
        }
    }

    /**
     * Returns whether the iPad has a case.
     *
     * @return true if the iPad has a case, false otherwise
     */
    public boolean isHasCase() {
        return hasCase;
    }

    /**
     * Returns the OS version of the iPad.
     *
     * @return the OS version of the iPad
     */
    public String getOSVersion() {
        return OSVersion;
    }

    /**
     * Sets whether the iPad has a case.
     *
     * @param hasCase the case status to set
     */
    public void setHasCase(boolean hasCase) {
        this.hasCase = hasCase;
    }

    /**
     * Sets the OS version of the iPad.
     *
     * @param OSVersion the OS version to set
     */
    public void setOSVersion(String OSVersion) {
        this.OSVersion = OSVersion;
    }

    /**
     * Prints the details of the iPad.
     */
    @Override
    public void printDetails() {
        System.out.println(this);
    }

    /**
     * Returns a string representation of the iPad.
     *
     * @return a string representation of the iPad
     */
    @Override
    public String toString() {
        return String.format("%s, %s, OS version = %s",
                super.toString(),
                hasCase ? "has a case" : "doesn't have a case",
                OSVersion);
    }

    /**
     * Compares this iPad to the specified object.
     * The result is true if and only if the argument is not null and is an
     * IPad object that has the same OS version as this object.
     *
     * @param o the object to compare this IPad against
     * @return true if the given object represents an IPad equivalent to this iPad, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IPad iPad)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(OSVersion, iPad.OSVersion);
    }

    /**
     * Returns a hash code for this iPad.
     *
     * @return a hash code value for this iPad
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), OSVersion);
    }
}