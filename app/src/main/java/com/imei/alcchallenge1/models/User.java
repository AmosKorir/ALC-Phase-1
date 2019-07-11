package com.imei.alcchallenge1.models;

/**
 * Created by Korir on 7/11/19.
 * amoskrr@gmail.com
 */
public class User {
  private String name = "Korir Kipkoech Amos";
  private String phone = "0707389304";
  private String email = "amoskrr@gmail.com";
  private String track = "Android";
  private String slack = "@korir";
  private String country="Kenya";

  public User() {
  }

  public String getName() {
    return name;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTrack() {
    return track;
  }

  public void setTrack(String track) {
    this.track = track;
  }

  public String getSlack() {
    return slack;
  }

  public void setSlack(String slack) {
    this.slack = slack;
  }
}
