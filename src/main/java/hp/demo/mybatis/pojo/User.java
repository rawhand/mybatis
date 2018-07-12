package hp.demo.mybatis.pojo;

import hp.demo.mybatis.entity.StatusEnum;

import java.sql.Timestamp;

public class User {
    private Integer userId;

    private String userName;

    private Long numOne;

    private Long numTwo;

    private Timestamp addTime;

    private StatusEnum status;

    public User() {
    }

    public User(Integer userId, String userName, Long numOne, Long numTwo, Timestamp addTime, StatusEnum status) {
        this.userId = userId;
        this.userName = userName;
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.addTime = addTime;
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Long getNumOne() {
        return numOne;
    }

    public void setNumOne(Long numOne) {
        this.numOne = numOne;
    }

    public Long getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(Long numTwo) {
        this.numTwo = numTwo;
    }

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}