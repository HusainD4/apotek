package konektor;

public class Profile {
    private int ID_AKUN;
    private String FULLNAME;
    private String USERNAME;
    private String PASSWORD;
    private String LEVEL;

    public int getId() {
        return ID_AKUN;
    }

    public void setId(int ID_AKUN) {
        this.ID_AKUN = ID_AKUN;
    }

    public String getFullname() {
        return FULLNAME;
    }

    public void setFullname(String FULLNAME) {
        this.FULLNAME = FULLNAME;
    }

    public String getUsername() {
        return USERNAME;
    }

    public void setUsername(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPassword() {
        return PASSWORD;
    }

    public void setPassword(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getLevel() {
        return LEVEL;
    }

    public void setLevel(String LEVEL) {
        this.LEVEL = LEVEL;
    }
    
    
}
