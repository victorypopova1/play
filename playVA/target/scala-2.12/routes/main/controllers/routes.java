
// @GENERATOR:play-routes-compiler
// @SOURCE:F:/web/copy/playVA/playVA/conf/routes
// @DATE:Fri Nov 24 17:15:23 IRKT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAuth Auth = new controllers.ReverseAuth(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAuth Auth = new controllers.javascript.ReverseAuth(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
