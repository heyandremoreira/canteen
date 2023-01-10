package controllers;

import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Set;

public class HomeController extends Controller {
    private final FormFactory formFactory;

    /*public Result index(){
        Set<Profile> profiles = Profile.allProfiles();
        return ok(index.render(profiles));
    }
    public Result create(){
        Form<Profile> profileForm = FormFactory.form(Profile.class);
        return ok(create.render(profileForm));
    }

    public Result save(){
        Form<Profile> profileForm = formFactory.form(Profile.class).bindFromRequest();
        Profile profile = profileForm.get();
        Profile.add(profile);
        return redirect(routes.HomeController.home());
    }

    public Result edit(Integer id){
        Profile profile = Profile.findById(id);
        if(profile==null){

            return notFound("Profile not found");
        }
        Form<Profile> profileForm = formFactory.form(Profile.class).fill(profile);
        return ok(edit.render(profileForm));
    }

    public Result update(){
        Profile profile = formFactory.form(Profile.class).bindFromRequest().get();
        Profile oldProfile = Profile.findById(Profile.id);
        if(oldProfile == null){
            return  notFound("Profile Not Found");
        }
        oldProfile.getName() = profile.name;
        oldProfile.getNationality() = profile.nacionality;
        oldProfile.getAddress() = profile.address;
        oldProfile.getEmail() = profile.email;
        oldProfile.getNif() = profile.nif;

        return redirect(routes.HomeController.home());
    }*/

    @Inject
    public HomeController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result landing(Http.Request request) {
        return ok(views.html.landing.render());
    }

    public Result home(Http.Request request) {
        return ok(views.html.home.render());
    }

    public Result login(Http.Request request) {
        return ok(views.html.login.render(request));
    }

    public Result profile(Http.Request request) {
        return ok(views.html.profile.render());
    }

    public Result recoverpassword(Http.Request request) {
        return ok(views.html.recoverpassword.render());
    }

    public Result signup(Http.Request request) {
        return ok(views.html.signup.render(request));
    }

    public Result termsofuse(Http.Request request) {
        return ok(views.html.Settings.termsofuse.render());
    }

    public Result privacypolicy(Http.Request request) {
        return ok(views.html.Settings.privacypolicy.render());
    }

    public Result help(Http.Request request) {
        return ok(views.html.Settings.help.render());
    }

    public Result calendar(Http.Request request) {
        return ok(views.html.calendar.render());
    }

}