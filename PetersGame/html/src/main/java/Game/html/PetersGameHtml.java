package Game.html;

import com.google.gwt.core.client.EntryPoint;
import playn.html.HtmlPlatform;
import Game.core.PetersGame;

public class PetersGameHtml implements EntryPoint {

  @Override public void onModuleLoad () {
    HtmlPlatform.Config config = new HtmlPlatform.Config();
    // use config to customize the HTML platform, if needed
    HtmlPlatform plat = new HtmlPlatform(config);
    plat.assets().setPathPrefix("PetersGame/");
    new PetersGame(plat);
    plat.start();
  }
}
