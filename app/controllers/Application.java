package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok("My Special day home page");
        //return ok(index.render("Your new application is ready."));
    }

}
