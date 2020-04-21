import java.util.ArrayList;

public class AnnouncementRepository implements Repository<Announcement> {
    private int lastSequentialNumber;
    private ArrayList<Announcement> announcements;

    AnnouncementRepository() {
        lastSequentialNumber = -1;
        announcements = new ArrayList<>();
    }

    public ArrayList<Announcement> getAll() {
        return announcements;
    }

    public void save(Announcement announcement) {
        lastSequentialNumber++;
        announcement.setSequentialNumber(lastSequentialNumber);
        announcements.add(announcement);
    }
}
