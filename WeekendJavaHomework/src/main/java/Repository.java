import java.util.ArrayList;

public class Repository {

    private String name;
    private String description;
    private RepositoryType repositoryType;
    private ArrayList<GitCommit> commits;

    public Repository(String name, String description, RepositoryType repositoryType) {
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<GitCommit>();
    }

    public String hasAName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public RepositoryType hasRepositoryType() {
        return repositoryType;
    }

    public int getCount() {
        return this.commits.size();
    }

    public void addCommitsToRepository(GitCommit gitCommit) {
        this.commits.add(gitCommit);
    }

    public String getCommitId(String id) {
        String result = null;
        for (GitCommit gitCommit : this.commits) {
            if (gitCommit.getUniqueId() == id) {
                result = gitCommit.getMessage();
                ;
            }
        }
        return result;
    }
}