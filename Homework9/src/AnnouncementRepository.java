import java.util.ArrayList;

public class AnnouncementRepository {
    private int lastSequentialNumber;
    private ArrayList<Announcement> announcements;

    AnnouncementRepository() {
        lastSequentialNumber = -1;
        announcements = new ArrayList<>();
    }

    public ArrayList<Announcement> getAll() {
        return announcements;
    }

    void save(Announcement announcement) {
        lastSequentialNumber++;
        announcement.setSequentialNumber(lastSequentialNumber);
        announcements.add(announcement);
    }
}
