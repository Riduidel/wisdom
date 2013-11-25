package controllers;

import org.ow2.chameleon.wisdom.api.DefaultController;
import org.ow2.chameleon.wisdom.api.annotations.Controller;
import org.ow2.chameleon.wisdom.api.annotations.Parameter;
import org.ow2.chameleon.wisdom.api.annotations.Path;
import org.ow2.chameleon.wisdom.api.annotations.Route;
import org.ow2.chameleon.wisdom.api.http.HttpMethod;
import org.ow2.chameleon.wisdom.api.http.Result;

@Controller
@Path("/photo")
public class PhotoController extends DefaultController {

    @Route(method= HttpMethod.GET, uri="/")
    public Result all() {
        return ok();
    }

    @Route(method= HttpMethod.POST, uri="/")
    public Result upload() {
        return ok();
    }

    @Route(method= HttpMethod.GET, uri="/{id}")
    public Result get(@Parameter("id") String id) {
        return ok();
    }

    // ...
}