package com.kodilla.testing.statistics;
import com.kodilla.testing.forum.statistics.ForumStatistics;
import com.kodilla.testing.forum.statistics.Statistics;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ForumTestStatistics {
    private static final double DELTA = 1e-15;
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
        public void testCalculateUsersQuantityWithZero() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            forumStatistics.calculateAdvStatistics(statisticsMock);
            //When
            int users = forumStatistics.getUserCount();
            int posts = forumStatistics.getPostCount();
            int comments = forumStatistics.getCommentsCount();
            double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
            double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
            double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
            //Then
            Assert.assertEquals(0, users);
            Assert.assertEquals(0, posts);
            Assert.assertEquals(0, comments);
            Assert.assertEquals(0, avgUsersPost,DELTA );
            Assert.assertEquals(0, avgUsersComents,DELTA );
            Assert.assertEquals(0, avgCommentsPosts,DELTA );
        }
    @Test
        public void testCalculateUsersQuantityWith100() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
                for(int i=0; i<100; i++)
                    usersList.add("Users" + i);
            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(500);
            when(statisticsMock.commentsCount()).thenReturn(1000);
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            forumStatistics.calculateAdvStatistics(statisticsMock);
            //When
            int users = forumStatistics.getUserCount();
            int posts = forumStatistics.getPostCount();
            int comments = forumStatistics.getCommentsCount();
            double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
            double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
            double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
            //Then
            Assert.assertEquals(100, users);
            Assert.assertEquals(500, posts);
            Assert.assertEquals(1000, comments);
            Assert.assertEquals(5.00, avgUsersPost,DELTA);
            Assert.assertEquals(10.00, avgUsersComents,DELTA);
            Assert.assertEquals(2.00, avgCommentsPosts,DELTA);
    }
    @Test
        public void testCalculatePostsQuantityWithZero() {
            //Given
            Statistics statisticsMock = mock(Statistics.class);
            List<String> usersList = new ArrayList<>();
                for(int i=0; i<10; i++)
                    usersList.add("Users" + i);
            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(0);
            when(statisticsMock.commentsCount()).thenReturn(0);
            ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
            forumStatistics.calculateAdvStatistics(statisticsMock);
            //When
            int users = forumStatistics.getUserCount();
            int posts = forumStatistics.getPostCount();
            int comments = forumStatistics.getCommentsCount();
            double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
            double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
            double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
            //Then
            Assert.assertEquals(10, users);
            Assert.assertEquals(0, posts);
            Assert.assertEquals(0, comments);
            Assert.assertEquals(0.00, avgUsersPost,DELTA);
            Assert.assertEquals(0.00, avgUsersComents,DELTA);
            Assert.assertEquals(0.00, avgCommentsPosts,DELTA);
            }
    @Test
    public void testCalculatePostsQuantityWith1000() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<50; i++)
            usersList.add("Users" + i);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int users = forumStatistics.getUserCount();
        int posts = forumStatistics.getPostCount();
        int comments = forumStatistics.getCommentsCount();
        double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
        double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
        double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
        //Then
        Assert.assertEquals(50, users);
        Assert.assertEquals(1000, posts);
        Assert.assertEquals(2000, comments);
        Assert.assertEquals(20.00, avgUsersPost,DELTA);
        Assert.assertEquals(40.00, avgUsersComents,DELTA);
        Assert.assertEquals(2.00, avgCommentsPosts,DELTA);
    }
    @Test
    public void testCalculateCommentsQuantityWithZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<200; i++)
            usersList.add("Users" + i);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int users = forumStatistics.getUserCount();
        int posts = forumStatistics.getPostCount();
        int comments = forumStatistics.getCommentsCount();
        double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
        double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
        double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
        //Then
        Assert.assertEquals(200, users);
        Assert.assertEquals(1000, posts);
        Assert.assertEquals(0, comments);
        Assert.assertEquals(5.00, avgUsersPost,DELTA);
        Assert.assertEquals(0.00, avgUsersComents,DELTA);
        Assert.assertEquals(0.00, avgCommentsPosts,DELTA);
    }
    @Test
    public void testCalculateCommentsQuantityMoreThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<50; i++)
            usersList.add("Users" + i);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int users = forumStatistics.getUserCount();
        int posts = forumStatistics.getPostCount();
        int comments = forumStatistics.getCommentsCount();
        double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
        double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
        double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
        //Then
        Assert.assertEquals(50, users);
        Assert.assertEquals(100, posts);
        Assert.assertEquals(1000, comments);
        Assert.assertEquals(2.00, avgUsersPost,DELTA);
        Assert.assertEquals(20.00, avgUsersComents,DELTA);
        Assert.assertEquals(10.00, avgCommentsPosts,DELTA);
    }
    @Test
    public void testCalculatePostsQuantityMoreThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<10; i++)
            usersList.add("Users" + i);
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //When
        int users = forumStatistics.getUserCount();
        int posts = forumStatistics.getPostCount();
        int comments = forumStatistics.getCommentsCount();
        double avgUsersPost = forumStatistics.getAveragePostCountPerUser();
        double avgUsersComents = forumStatistics.getAverageCommentsCountPerUser();
        double avgCommentsPosts = forumStatistics.getAveragePostCommentsPerPostCount();
        //Then
        Assert.assertEquals(10, users );
        Assert.assertEquals(1000, posts );
        Assert.assertEquals(100, comments );
        Assert.assertEquals(100.00, avgUsersPost,DELTA);
        Assert.assertEquals(10.00, avgUsersComents,DELTA);
        Assert.assertEquals(0.10, avgCommentsPosts,DELTA);
    }
}


