package code;

import java.util.Objects;

/**
 * Abstract class representing a generic device.
 */
public abstract class IDevice {
    private final String purpose;

    /**
     * Constructs an IDevice with the specified purpose.
     *
     * @param purpose the purpose of the device
     */
    public IDevice(String purpose) {
        validatePurpose(purpose);

        this.purpose = purpose;
    }

    /**
     * Validates IDevice's purpose.
     *
     * @param purpose the purpose of the device
     */
    private void validatePurpose(String purpose) {
        if(purpose == null || purpose.isBlank()) {
            throw new IllegalArgumentException("Purpose must not be null or blank");
        }
    }

    /**
     * Returns the purpose of the device.
     *
     * @return the purpose of the device
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Prints the details of the device.
     * This method must be implemented by subclasses.
     */
    public abstract void printDetails();

    /**
     * Returns a string representation of the device.
     *
     * @return a string representation of the device
     */
    @Override
    public String toString() {
        return "Purpose: " + purpose;
    }

    /**
     * Compares this device to the specified object.
     * The result is true if and only if the argument is not null and is an
     * IDevice object that has the same purpose as this object.
     *
     * @param o the object to compare this IDevice against
     * @return true if the given object represents an IDevice equivalent to this device, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IDevice iDevice)) return false;
        return Objects.equals(purpose, iDevice.purpose);
    }

    /**
     * Returns a hash code for this device.
     *
     * @return a hash code value for this device
     */
    @Override
    public int hashCode() {
        return Objects.hashCode(purpose);
    }
}