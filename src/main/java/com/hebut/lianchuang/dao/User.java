package com.hebut.lianchuang.dao;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.user_name
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.token
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.type
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.birthday
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.profession
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    private String profession;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.user_name
     *
     * @return the value of user.user_name
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.user_name
     *
     * @param userName the value for user.user_name
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.token
     *
     * @return the value of user.token
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.token
     *
     * @param token the value for user.token
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.type
     *
     * @return the value of user.type
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.type
     *
     * @param type the value for user.type
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.birthday
     *
     * @return the value of user.birthday
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.birthday
     *
     * @param birthday the value for user.birthday
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.profession
     *
     * @return the value of user.profession
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public String getProfession() {
        return profession;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.profession
     *
     * @param profession the value for user.profession
     *
     * @mbg.generated Wed Apr 08 18:54:28 GMT+08:00 2020
     */
    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }
}