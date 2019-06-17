import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

   GitHubAccount gitHubAccount;
   Repository repository;
   Repository repository1;


   @Before
   public void setUp(){
      gitHubAccount = new GitHubAccount("SunOfGod", "Jesus", AccountType.FREE);
      repository = new Repository("Project", "description here", RepositoryType.PUBLIC);
      repository1 = new Repository("Project1", "a description", RepositoryType.PRIVATE);
   }

   @Test
   public void canGetUsername(){
      assertEquals("SunOfGod", gitHubAccount.getUsername());
   }
   @Test
    public void getAccountType(){
       assertEquals(AccountType.FREE, gitHubAccount.hasAccountType());
   }

    @Test
    public void isFree(){
       assertEquals(AccountType.FREE, gitHubAccount.isFreeAccount());
    }
    @Test
    public void canAddRepos(){
       assertEquals();
    }


}
