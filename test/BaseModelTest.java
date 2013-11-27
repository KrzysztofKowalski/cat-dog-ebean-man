import org.junit.AfterClass;
import org.junit.BeforeClass;
import play.test.FakeApplication;
import play.test.Helpers;

/**
 * Created with IntelliJ IDEA.
 * User: k
 * Date: 27.11.13
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public class BaseModelTest {
    public static FakeApplication app;

    @BeforeClass
    public static void startApp() {
        app = Helpers.fakeApplication(Helpers.inMemoryDatabase());
        Helpers.start(app);
    }

    @AfterClass
    public static void stopApp() {
        Helpers.stop(app);
    }
}
