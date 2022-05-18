package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    final int userId;
    final String userName;
    final char gender;
    final LocalDate birthDate;
    final int postCount;

    public ForumUser(final int userId,final String userName,final  char gender,final LocalDate birthDate,final int postCount) {
        this.userId = userId;
        this.userName = userName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.postCount = postCount;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
