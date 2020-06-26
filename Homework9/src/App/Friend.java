package App;

import java.util.Objects;

public class Friend {

    private RegularUser user1;
    private RegularUser user2;
    Friend(RegularUser user1, RegularUser user2) {
        this.user1 = user1;
        this.user2 = user2;

    }

    public RegularUser getUser1() {
        return user1;
    }

    public RegularUser getUser2() {
        return user2;
    }
    public String getFriendUsername (RegularUser user){
        //Friend friend = new Friend(user, user1);
        if (user.getId() == user1.getId()){
            return user2.getUsername();
        } else{
            return user1.getUsername();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Friend friend = (Friend) o;
        return (friend.getUser1().getId() == this.getUser1().getId() & friend.getUser2().getId() == this.getUser2().getId() ||
                friend.getUser1().getId() == this.getUser2().getId() & friend.getUser2().getId() == this.getUser1().getId());

    }


}
