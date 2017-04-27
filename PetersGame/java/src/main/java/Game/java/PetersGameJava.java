package Game.java;

import playn.java.LWJGLPlatform;

import Game.core.PetersGame;

public class PetersGameJava {

  public static void main (String[] args) {
    LWJGLPlatform.Config config = new LWJGLPlatform.Config();
    config.width = 1280;
    config.height = 720;
    LWJGLPlatform plat = new LWJGLPlatform(config);
    new PetersGame(plat);
    plat.start();
  }
}
