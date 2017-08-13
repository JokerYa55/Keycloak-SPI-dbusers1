/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keycloak.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author vasil
 */
@Entity
@Table(name = "t_users_log")
public class logUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "t_users_log_id_seq")
    @SequenceGenerator(name = "t_users_log_id_seq", sequenceName = "t_users_log_id_seq")
    int id;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    public logUser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "logUser{" + "id=" + id + ", user_id=" + user_id + ", username=" + username + ", password=" + password + '}';
    }
}
