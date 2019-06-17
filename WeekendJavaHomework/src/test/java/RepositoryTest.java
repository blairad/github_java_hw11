import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    Repository repository;
    Repository repository1;
    Repository repository2;

    GitCommit gitCommit0;
    GitCommit gitCommit1;

    @Before
    public void before(){
        repository = new Repository("Project", "description here", RepositoryType.PUBLIC);
        repository1 = new Repository("Project1", "a description", RepositoryType.PRIVATE);
        repository2 = new Repository("project2", "another description",  RepositoryType.PUBLIC);

        gitCommit0 = new GitCommit("initial commit", CommitType.BUGFIX, "12345");
        gitCommit1 = new GitCommit("added to basics", CommitType.OTHER, "123456");
    }
    @Test
    public void checkHasName(){
        assertEquals("Project", repository.hasAName());
    }
    @Test
    public void checkHasADescription(){
        assertEquals("description here", repository.getDescription() );
    }
    @Test
    public void checkHasRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository.hasRepositoryType());
    }
    @Test
    public void numberAtStart(){
        assertEquals(0, repository.getCount());
    }
    @Test
    public void checkHasMultipleCommits(){
        repository.addCommitsToRepository(gitCommit0);
        repository.addCommitsToRepository(gitCommit1);
        assertEquals(2, repository.getCount());
    }
    @Test
    public void getCommitById(){
        repository.addCommitsToRepository(gitCommit0);
        repository.addCommitsToRepository(gitCommit1);
        assertEquals("initial commit", repository.getCommitId("12345"));


    }

}
