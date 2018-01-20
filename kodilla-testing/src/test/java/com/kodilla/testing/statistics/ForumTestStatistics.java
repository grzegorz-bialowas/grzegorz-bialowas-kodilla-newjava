package com.kodilla.testing.statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumTestStatistics {
        @Before
        public void before() {
            System.out.println("Test Case: begin");
        }
        @After
        public void after() {
            System.out.println("Test Case: end");
        }
        @BeforeClass
        public static void beforeClass() {
            System.out.println("Test Suite: begin");
        }
        @AfterClass
        public static void afterClass() {
            System.out.println("Test Suite: end");
        }
    @Test
        public void testCalculateUsersQuantity() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(usersList);
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            //When
            int users = statisticsMock.usersNames().size();
            //Then
            Assert.assertEquals(0, users);
        }
    @Test
    public void testCalculateUsersQuantityWith100() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<100; i++)
            usersList.add("Users" + i);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int users = statisticsMock.usersNames().size();
        //Then
        Assert.assertEquals(100, users);
    }
    @Test
        public void testCalculatePostsQuantity() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            when(statisticsMock.postsCount()).thenReturn(0);
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            //When
            int posts = statisticsMock.postsCount();
            //Then
            Assert.assertEquals(0, posts);
        }
    @Test
    public void testCalculatePostsQuantityWith1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int posts = statisticsMock.postsCount();
        //Then
        Assert.assertEquals(1000, posts);
    }
    @Test
    public void testCalculateCommentsQuantity() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int comments = statisticsMock.commentsCount();
        //Then
        Assert.assertEquals(0, comments);
    }
    @Test
    public void testCalculateCommentsQuantityWithPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int comments = statisticsMock.commentsCount();
        int posts = statisticsMock.postsCount();
        //Then
        Assert.assertEquals(1000, comments);
        Assert.assertEquals(100, posts);
    }
    @Test
    public void testCalculatePostsQuantityWithComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int posts = statisticsMock.postsCount();
        int comments = statisticsMock.commentsCount();
        //Then
        Assert.assertEquals(1000, posts);
        Assert.assertEquals(100, comments);

    }
}


