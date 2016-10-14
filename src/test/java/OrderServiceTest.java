/**
 * Created by mat on 12/10/2016.
 */
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.Application;

public class OrderServiceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(OrderService.class);
    }

    @Test
    public void nameTest() {
        String response = target("/Jean").request().get(String.class);
        Assert.assertTrue("Bonjour : Jean".equals(response));
    }

    @Test
    public void notNameTest() {
        String response = target("/Truc").request().get(String.class);
        Assert.assertTrue("Bonjour : Truc".equals(response));
    }

    /*@Test
    public void notNameFailTest() {
        String response = target("/Fails").request().get(String.class);
        Assert.assertTrue("Bonjour : Truc".equals(response));
    }*/

}
