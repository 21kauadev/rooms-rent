package entities;

public class RoomRentalManager {

    private int roomNumber;
    private String renterName;
    private String renterEmail;

    public RoomRentalManager(int roomNumber, String renterName, String renterEmail) {
        this.roomNumber = roomNumber;
        this.renterName = renterName;
        this.renterEmail = renterEmail;
    }

    public String getRenterName() {
        return this.renterName;
    }

    public String getRenterEmail() {
        return this.renterEmail;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

}
