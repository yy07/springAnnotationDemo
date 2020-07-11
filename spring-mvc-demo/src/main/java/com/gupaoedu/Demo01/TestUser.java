package com.gupaoedu.Demo01;

import org.springframework.stereotype.Service;

/**
 * @Author:jinboxaing
 * @date:2020/7/8 16:03
 */
public class TestUser {
    private String username;
    private String password;

    public TestUser() {
    }

    public TestUser(String username) {
        this.username = username;
    }

    public TestUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
