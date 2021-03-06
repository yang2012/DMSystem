package common;

import org.restlet.representation.Representation;
import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;

public interface LoginResourceInterface {

	@Get
    public void login();
    
    @Post
    public void redirect(Representation input);
    
    @Delete
    public Representation logout(String username);
}
