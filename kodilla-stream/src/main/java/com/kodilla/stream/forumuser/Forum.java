package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;
public final class Forum {
    final List<ForumUser> userList = new ArrayList<>();
    public Forum() {
        userList.add(new ForumUser(001, "Player1", 'M', 2000.04, 5));
        userList.add(new ForumUser(002, "Player2", 'M', 2002.03, 4));
        userList.add(new ForumUser(003, "Player3", 'F', 1998.09, 2));
        userList.add(new ForumUser(004, "Player4", 'M', 1995.02, 9));
        userList.add(new ForumUser(005, "Player5", 'F', 1973.12, 0));
        userList.add(new ForumUser(006, "Player6", 'M', 1985.06, 1));
        userList.add(new ForumUser(007, "Player7", 'F', 2001.04, 0));
        userList.add(new ForumUser(010, "Player8", 'F', 1992.09, 1));
        userList.add(new ForumUser(011, "Player9", 'M', 1965.02, 0));
        userList.add(new ForumUser(012, "Player10", 'F', 1978.08, 1));
    }
    public List<ForumUser> getList () {
        return new ArrayList<>(userList);
    }
}


