public class GitCommit {

    private String message;
    private CommitType commitType;
    private String uniqueId;

    public GitCommit(String message, CommitType commitType, String uniqueId) {
        this.message = message;
        this.commitType = commitType;
        this.uniqueId = uniqueId;
    }
        public String getMessage() {
            return message;
        }

        public CommitType getCommitType() {
            return this.commitType;
        }

        public String getUniqueId() {
            return uniqueId;
        }

}


