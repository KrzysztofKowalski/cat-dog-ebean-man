package models;


import com.avaje.ebean.Ebean;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Version;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
public class Dog extends Model {


    @Id
    public UUID guid;

    @Version
    public Timestamp timestamp;

    public final String name;

    @ManyToOne
    public final Man man;

    public Dog(String name, Man man) {
        this.name = name;
        this.man = man;
    }

    @Override
    public void delete() {
        Ebean.refreshMany(man, "dogs");
        super.delete();
    }

}
