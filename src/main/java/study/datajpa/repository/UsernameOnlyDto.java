package study.datajpa.repository;

public class UsernameOnlyDto {

    private final String username;

    //parameter명으로 분석
    public UsernameOnlyDto(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
