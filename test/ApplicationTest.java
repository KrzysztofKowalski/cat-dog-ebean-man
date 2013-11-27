import com.avaje.ebean.Ebean;
import models.Cat;
import models.Dog;
import models.Man;
import org.junit.*;


/**
 * Simple (JUnit) tests that can call all parts of a play app.
 * If you are interested in mocking a whole application, see the wiki for more details.
 */
public class ApplicationTest extends BaseModelTest {

    @Test
    public void addCatAndMan() {
        Man m = new Man();
        m.save();
        Cat c = new Cat("meow", m);
        c.save();
        Cat c2 = new Cat("shrek", m);
        c2.save();
        //returns 2 elems
        Ebean.refreshMany(m, "cats");
        System.out.println(m.cats);
        assert (m.cats.size() == 2);

        c2.delete();
        //returns 2 elems as well because of no refresh
        System.out.println(m.cats);

        assert (m.cats.size() == 2);

        Dog d1 = new Dog("diablo", m);
        d1.save();
        Dog d2 = new Dog("potato", m);
        d2.save();

        //empty
        System.out.println(m.dogs);
        assert (m.dogs.size() == 0);

        d2.delete();
        //returns 1 dog
        System.out.println(m.dogs);
        assert (m.dogs.size() == 1);

    }


}
