package Game.core;

import playn.core.Surface;
import playn.scene.Layer;

import java.util.ArrayList;

/**
 * Created by peter on 27.04.2017.
 */
public class ActorLayer extends Layer {
    private ArrayList<Actor> actors;

    public ActorLayer(){
        actors = new ArrayList<>();
    }

    public void addActor(Actor a){
        actors.add(a);
    }

    protected void paintImpl(Surface surface) {
        for(Actor a: actors){
            a.draw(surface);
        }
    }
}
