package controllers;

import models.User;
import play.Logger;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.time.*;

public class Application extends Controller {

    @Transactional
    public Result index() {
        return ok(User.findAll().get(0).name);
    }

}
