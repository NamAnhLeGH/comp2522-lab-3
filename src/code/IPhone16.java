package code;

import java.util.Objects;

/**
 * Class representing an iPhone16 device.
 */
public class IPhone16 extends IPhone {
    private final boolean hasHighResolutionCamera;
    private final int memoryInGB;

    /**
     * Constructs an IPhone16 with the specified attributes.
     *
     * @param minutesRemaining    the minutes remaining on the phone plan
     * @param carrier             the carrier of the iPhone16
     * @param hasHighResolutionCamera whether the iPhone16 has a high resolution camera
     * @param memoryInGB          the memory size of the iPhone16 in gigabytes
     */
    public IPhone16(final double minutesRemaining, final String carrier, final boolean hasHighResolutionCamera, final int memoryInGB) {
        super(minutesRemaining, carrier);

        validateMemoryInGB(memoryInGB);
        this.hasHighResolutionCamera = hasHighResolutionCamera;
        this.memoryInGB = memoryInGB;
    }

    /**
     * Validates the memory size of the iPhone16 in gigabytes.
     *
     * @param memoryInGB the memory size of the iPhone16 in gigabytes
     */
    private void validateMemoryInGB(final int memoryInGB) {
        if(memoryInGB < 0) {
            throw new IllegalArgumentException("Memory size of iPhone16 must be non-negative");
        }
    }

    /**
     * Returns whether the iPhone16 has a high resolution camera.
     *
     * @return true if the iPhone16 has a high resolution camera, false otherwise
     */
    public boolean isHasHighResolutionCamera() {
        return hasHighResolutionCamera;
    }

    /**
     * Returns the memory size of the iPhone16 in gigabytes.
     *
     * @return the memory size of the iPhone16 in gigabytes
     */
    public int getMemoryInGB() {
        return memoryInGB;
    }

    /**
     * Returns a string representation of the iPhone16.
     *
     * @return a string representation of the iPhone16
     */
    @Override
    public String toString() {
        return String.format("%s, %s, memory = %d GB",
                super.toString(),
                hasHighResolutionCamera ? "has a high resolution camera" : "doesn't have a high resolution camera",
                memoryInGB);
    }

    /**
     * Compares this iPhone16 to the specified object.
     * The result is true if and only if the argument is not null and is an
     * IPhone16 object that has the same high-resolution camera status as this object.
     *
     * @param o the object to compare this IPhone16 against
     * @return true if the given object represents an IPhone16 equivalent to this iPhone16, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IPhone16 iPhone16)) return false;
        if (!super.equals(o)) return false;
        return hasHighResolutionCamera == iPhone16.hasHighResolutionCamera;
    }

    /**
     * Returns a hash code for this iPhone16.
     *
     * @return a hash code value for this iPhone16
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasHighResolutionCamera);
    }
}