package Game.android;

import playn.android.GameActivity;

import Game.core.PetersGame;

public class PetersGameActivity extends GameActivity {

  @Override public void main () {
    new PetersGame(platform());
  }
}
