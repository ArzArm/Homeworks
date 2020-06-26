package App;

import java.util.Objects;

public class FriendshipRequest  {
    private RegularUser from;
    private RegularUser to;
    FriendshipRequest(RegularUser from, RegularUser to) {
        this.from = from;
        this.to = to;

    }

    public RegularUser getFrom() {
        return from;
    }


    public RegularUser getTo() {
        return to;
    }


    public String toString() {
        return getFrom().getUsername();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FriendshipRequest that = (FriendshipRequest) o;
        return this.from.getId() == that.from.getId() &&
                this.to.getId() == that.to.getId();

    }


}
