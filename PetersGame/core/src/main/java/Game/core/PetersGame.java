package Game.core;

import playn.core.Image;
import playn.core.Platform;
import playn.scene.ImageLayer;
import playn.scene.Mouse;
import playn.scene.Pointer;
import playn.scene.SceneGame;

public class PetersGame extends SceneGame {
    private Pointer pointer;

    public PetersGame (Platform plat) {
    super(plat, 33); // update our "simulation" 33ms (30 times per second)

    // load assets
    Image bgImage = plat.assets().getImageSync("images/lel.gif");
    Image test = plat.assets().getImageSync("images/E.jpg");

    pointer = new Pointer(plat, rootLayer, false);
    plat.input().mouseEvents.connect(new Mouse.Dispatcher(rootLayer, false));
    Actor a = new Actor(test.tile(), 0,0, 200, 200);
    ActorLayer al = new ActorLayer();
    al.addActor(a);
    ImageLayer bgLayer = new ImageLayer(bgImage);
    rootLayer.add(bgLayer);
    rootLayer.add(al);
  }
}
