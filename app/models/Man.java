package models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import play.db.ebean.Model;

import javax.persistence.*;
import java.beans.Transient;
import java.sql.Timestamp;
import java.util.List;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;
@Entity
public class Man extends Model {

    @Id
    public java.util.UUID guid;

    @Version
    public Timestamp timestamp;


    @JsonIgnore
    @javax.persistence.Transient
    public Timestamp global_timestamp;

    public String name;

    @OneToMany
    public List<Cat> cats;

    @OneToMany
    public List<Dog> dogs;

}