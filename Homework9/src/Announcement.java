import java.util.Objects;

public class Announcement {
    private String text;
    private int sequentialNumber;

    public Announcement(String text) {
        this.text = text;

    }

    public String getAnnouncement() {
        return text;
    }

    public String getAnnouncementText() {
        return text;
    }

    public int getSequentialNumber() {
        return sequentialNumber;
    }

    public void setSequentialNumber(int sequentialNumber) {
        this.sequentialNumber = sequentialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Announcement that = (Announcement) o;
        return sequentialNumber == that.sequentialNumber;
    }

    @Override
    public String toString() {
        return text;
    }
}
