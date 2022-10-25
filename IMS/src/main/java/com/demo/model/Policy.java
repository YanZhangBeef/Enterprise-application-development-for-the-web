package com.demo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Policy{
    @Id
    //@GeneratedValue annotations to indicate that this field is primary key and its value is auto generated
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;
    private String type;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_user_policy",
            joinColumns = {@JoinColumn(name = "policy_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")}
    )
    private List<User> userList;
    private String description;

    public Policy() {
    }
    //relationship
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<User> getUserList() {
        return userList;
    }
    public void setAgentList(List<User> userList) {
        this.userList = userList;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
