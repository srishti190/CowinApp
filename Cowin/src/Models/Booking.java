package Models;

public class Booking {
    String username;
    String centreId;

    public Booking(String username, String centreId) {
        this.username = username;
        this.centreId = centreId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCentreId() {
        return centreId;
    }

    public void setCentreId(String centreId) {
        this.centreId = centreId;
    }
}
