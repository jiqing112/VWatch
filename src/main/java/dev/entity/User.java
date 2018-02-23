package dev.entity;

import dev.validator.GenderName;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 用户
 */
public class User implements Serializable {

    private long userId;

    @NotEmpty(message = "用户名不能为空")
    private String userName;

    @NotEmpty(message = "用户密码不能为空")
    @Size(min = 3, max = 18, message = "密码长度应在3到18个字符以内")
    private String userPassword;

    @Email(message = "请输入正确的邮箱地址")
    private String userEmail;

    private long userPhone;

    @GenderName
    private String userGender;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    private Date userBirthday;

    private Date createTime;

    private int score;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", createTime=" + createTime + ", score=" + score
                + "]";
    }
}
