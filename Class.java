public class Class {

    private String roomNumber;
    private int capacity;
    private boolean hasProjector;

    

    public Class(String roomNumber, int capacity, boolean hasProjector) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.hasProjector = hasProjector;
    }

    // setRoomNumber()
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    // getRoomNumber()
    public String getRoomNumber() {
        return roomNumber;
    }

    // setCapacity()
    public void setCapacity(int capacity) {
        if (capacity < 0) capacity = 0;
        this.capacity = capacity;
    }

    // getCapacity()
    public int getCapacity() {
        return capacity;
    }

    // setHasProjector()
    public void setHasProjector(boolean hasProjector) {
        this.hasProjector = hasProjector;
    }

    // getHasProjector()
    public boolean getHasProjector() {
        return hasProjector;
    }

    // boolean isFull(int currentCount)
    // (الـ UML كاتب isFull(int currentCount))
    public boolean isFull(int currentCount) {
        return currentCount >= capacity;
    }

    // String getRoomDetails()
    public String getRoomDetails() {
        return "Room Number: " + roomNumber +
               ", Capacity: " + capacity +
               ", Has Projector: " + (hasProjector ? "Yes" : "No");
    }
}
