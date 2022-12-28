package controllers;

import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

public class Student extends Controller {
    private final FormFactory formFactory;

    @Inject
    public Student(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result tickets(Http.Request request) {
        return ok(views.html.Student.tickets.render());
    }

    public Result wallet(Http.Request request) {
        return ok(views.html.Student.wallet.render());
    }

}
