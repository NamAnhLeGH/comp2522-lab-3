package code;

import java.util.Objects;

/**
 * Class representing an iPhone device.
 */
public class IPhone extends IDevice {
    private double minutesRemaining;
    private String carrier;

    /**
     * Constructs an IPhone with the specified minutes remaining and carrier.
     *
     * @param minutesRemaining the minutes remaining on the phone plan
     * @param carrier          the carrier of the iPhone
     */
    public IPhone(final double minutesRemaining, final String carrier) {
        super("talking");

        validateMinutesRemaining(minutesRemaining);
        validateCarrier(carrier);
        this.minutesRemaining = minutesRemaining;
        this.carrier = carrier;
    }

    /**
     * Validates the minutes remaining on the phone plan.
     *
     * @param minutesRemaining the minutes remaining on the phone plan
     */
    private void validateMinutesRemaining(double minutesRemaining) {
        if (minutesRemaining < 0) {
            throw new IllegalArgumentException("Remaining minutes must be non-negative");
        }
    }

    /**
     * Validates the carrier of the iPhone.
     *
     * @param carrier the carrier of the iPhone
     */
    private void validateCarrier(String carrier) {
        if (carrier == null || carrier.isBlank()) {
            throw new IllegalArgumentException("Carrier must not be null or blank");
        }
    }

    /**
     * Returns the minutes remaining on the phone plan.
     *
     * @return the minutes remaining on the phone plan
     */
    public double getMinutesRemaining() {
        return minutesRemaining;
    }

    /**
     * Returns the carrier of the iPhone.
     *
     * @return the carrier of the iPhone
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the minutes remaining on the phone plan.
     *
     * @param minutesRemaining the minutes remaining to set
     */
    public void setMinutesRemaining(final double minutesRemaining) {
        this.minutesRemaining = minutesRemaining;
    }

    /**
     * Sets the carrier of the iPhone.
     *
     * @param carrier the carrier to set
     */
    public void setCarrier(final String carrier) {
        this.carrier = carrier;
    }

    /**
     * Prints the details of the iPhone.
     */
    @Override
    public void printDetails() {
        System.out.println(this);
    }

    /**
     * Returns a string representation of the iPhone.
     *
     * @return a string representation of the iPhone
     */
    @Override
    public String toString() {
        return String.format("%s, minutes remaining on phone plan = %f, carrier = %s",
                super.toString(),
                minutesRemaining,
                carrier);
    }

    /**
     * Compares this iPhone to the specified object.
     * The result is true if and only if the argument is not null and is an
     * IPhone object that has the same minutes remaining as this object.
     *
     * @param o the object to compare this IPhone against
     * @return true if the given object represents an IPhone equivalent to this iPhone, false otherwise
     */
    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof IPhone iPhone)) return false;
        if (!super.equals(o)) return false;
        return Double.compare(minutesRemaining, iPhone.minutesRemaining) == 0;
    }

    /**
     * Returns a hash code for this iPhone.
     *
     * @return a hash code value for this iPhone
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), minutesRemaining);
    }
}