package gov.nysenate.ess.supply.shipment;

import gov.nysenate.ess.core.model.personnel.Employee;

public final class ShipmentVersion {

    private final int id;
    private final ShipmentStatus status;
    private final Employee issuingEmployee;
    private final Employee modifiedBy;

    private ShipmentVersion(Builder builder) {
        this.id = builder.id;
        this.status = builder.status;
        this.issuingEmployee = builder.issuingEmployee;
        this.modifiedBy = builder.modifiedBy;
    }

    private Builder copy() {
        return new Builder(id, status, issuingEmployee, modifiedBy);
    }

    /** Basic setters. Return new instances. */

    public ShipmentVersion setId(int id) {
        return copy().withId(id).build();
    }

    public ShipmentVersion setStatus(ShipmentStatus status) {
        return copy().withStatus(status).build();
    }

    public ShipmentVersion setIssuingEmployee(Employee issuingEmployee) {
        return copy().withIssuingEmployee(issuingEmployee).build();
    }

    public ShipmentVersion setModifiedBy(Employee modifiedBy) {
        return copy().withModifiedBy(modifiedBy).build();
    }

    /** Getters */

    public int getId() {
        return id;
    }

    public ShipmentStatus getStatus() {
        return status;
    }

    public Employee getIssuingEmployee() {
        return issuingEmployee;
    }

    public Employee getModifiedBy() {
        return modifiedBy;
    }

    @Override
    public String toString() {
        return "ShipmentVersion{" +
               "id=" + id +
               ", status=" + status +
               ", issuingEmployee=" + issuingEmployee +
               ", modifiedBy=" + modifiedBy +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShipmentVersion that = (ShipmentVersion) o;

        if (id != that.id) return false;
        if (status != that.status) return false;
        if (issuingEmployee != null ? !issuingEmployee.equals(that.issuingEmployee) : that.issuingEmployee != null)
            return false;
        return !(modifiedBy != null ? !modifiedBy.equals(that.modifiedBy) : that.modifiedBy != null);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (issuingEmployee != null ? issuingEmployee.hashCode() : 0);
        result = 31 * result + (modifiedBy != null ? modifiedBy.hashCode() : 0);
        return result;
    }

    /** Builder class */

    public static class Builder {
        private int id;
        private ShipmentStatus status;
        private Employee issuingEmployee;
        private Employee modifiedBy;

        public Builder() {
        }

        public Builder(int id, ShipmentStatus status, Employee issuingEmployee, Employee modifiedBy) {
            this.id = id;
            this.status = status;
            this.issuingEmployee = issuingEmployee;
            this.modifiedBy = modifiedBy;
        }

        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withStatus(ShipmentStatus status) {
            this.status = status;
            return this;
        }

        public Builder withIssuingEmployee(Employee issuingEmployee) {
            this.issuingEmployee = issuingEmployee;
            return this;
        }

        public Builder withModifiedBy(Employee modifiedByEmployee) {
            this.modifiedBy = modifiedByEmployee;
            return this;
        }

        public ShipmentVersion build() {
            return new ShipmentVersion(this);
        }
    }
}
