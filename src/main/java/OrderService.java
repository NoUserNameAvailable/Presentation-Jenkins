/**
 * Created by mat on 12/10/2016.
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("")
public class OrderService {

    @GET
    @Path("{nom}")
    public String getOrders(@PathParam("nom") String nom) {
        return "Bonjour : " + nom;
    }

}