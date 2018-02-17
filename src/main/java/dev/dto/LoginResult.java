package dev.dto;

public class LoginResult {
    Boolean isSuccess;

    String msg;

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public String getMsg() {
        return msg;
    }

    public LoginResult(Boolean isSuccess, String msg) {
        this.isSuccess = isSuccess;
        this.msg = msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;

    }
}
