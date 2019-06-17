import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitCommitTest {

    GitCommit gitCommit;
    GitCommit gitCommit2;

    @Before
    public void setUp() {
        gitCommit = new GitCommit("initial commit", CommitType.BUGFIX, "12345");
        gitCommit2 = new GitCommit("added to basics", CommitType.OTHER, "123456");

    }
    @Test
    public void canGetMessage() {
        assertEquals("initial commit", gitCommit.getMessage());
    }
    @Test
    public void canGetCommit() {
        assertEquals(CommitType.BUGFIX, gitCommit.getCommitType());
    }
    @Test
    public void getUniqueId(){ assertEquals("12345", gitCommit.getUniqueId()); }
}
