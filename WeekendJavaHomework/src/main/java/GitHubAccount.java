import java.util.HashMap;

public class GitHubAccount {

    private String username;
    private String name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name, AccountType accountType){
        this.username = username;
        this.name = name;
        this.repositories = repositories;
        this.accountType = accountType;
    }

    public String getUsername(){
        return username;
    }

    public AccountType hasAccountType() {
        return accountType;
    }

    public AccountType isFreeAccount() {

    }
}
