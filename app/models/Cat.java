package models;


import play.db.ebean.Model;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import java.sql.Timestamp;

@Entity
public class Cat extends Model {


    @Id
    public java.util.UUID guid;

    @Version
    public Timestamp timestamp;

    public final String name;

    @ManyToOne
    public final Man man;

    public Cat(String name, Man man) {
        this.name = name;
        this.man = man;
    }
}
