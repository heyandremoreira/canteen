// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAdministrator Administrator = new controllers.ReverseAdministrator(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseManager Manager = new controllers.ReverseManager(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseStudent Student = new controllers.ReverseStudent(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAdministrator Administrator = new controllers.javascript.ReverseAdministrator(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseManager Manager = new controllers.javascript.ReverseManager(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseStudent Student = new controllers.javascript.ReverseStudent(RoutesPrefix.byNamePrefix());
  }

}
