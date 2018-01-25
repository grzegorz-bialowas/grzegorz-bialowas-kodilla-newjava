package com.kodilla.stream.forumuser;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public final class Forum {
    final List<ForumUser> userList = new ArrayList<>();
    public Forum() {
        userList.add(new ForumUser(001, "Player1", 'M', LocalDate.of(1985,05,27), 5));
        userList.add(new ForumUser(002, "Player2", 'M', LocalDate.of(2000,04,5), 4));
        userList.add(new ForumUser(003, "Player3", 'F', LocalDate.of(2004,05,9), 2));
        userList.add(new ForumUser(004, "Player4", 'M', LocalDate.of(2008,05,19), 9));
        userList.add(new ForumUser(005, "Player5", 'F', LocalDate.of(2002,12,22), 0));
        userList.add(new ForumUser(006, "Player6", 'M', LocalDate.of(1975,05,06), 1));
        userList.add(new ForumUser(007, "Player7", 'F', LocalDate.of(1995,05,10), 0));
        userList.add(new ForumUser(010, "Player8", 'F', LocalDate.of(2001,07,28), 1));
        userList.add(new ForumUser(011, "Player9", 'M', LocalDate.of(1976,07,29), 0));
        userList.add(new ForumUser(012, "Player10", 'F', LocalDate.of(2002,11,03), 1));
    }
    public List<ForumUser> getList () {
        return new ArrayList<>(userList);
    }
}


