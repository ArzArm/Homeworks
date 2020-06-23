public class Message {
    private String message;
    private RegularUser from;
    private RegularUser to;
    protected int sequentialNumber;


    public Message(String message, RegularUser from, RegularUser to) {
        this.message = message;
        this.from = from;
        this.to = to;
        sequentialNumber = -1;
    }

    public Message(RegularUser from, RegularUser to) {
        this.from = from;
        this.to = to;

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RegularUser getFrom() {
        return from;
    }

    public void setFrom(RegularUser from) {
        this.from = from;
    }

    public RegularUser getTo() {
        return to;
    }

    public void setTo(RegularUser to) {
        this.to = to;
    }
}