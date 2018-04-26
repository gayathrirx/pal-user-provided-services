package io.pivotal.pal.paluserprovidedservices;


import javax.persistence.*;

@Entity
public class Cohort {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String name;
    private String nickName;

    public Cohort(String name, String nickName) {
        this.name = name;
        this.nickName = nickName;
    }

    public Cohort() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
