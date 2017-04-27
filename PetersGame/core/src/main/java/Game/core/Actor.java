package Game.core;

import playn.core.Image;
import playn.core.Surface;
import playn.core.Tile;

/**
 * Created by peter on 27.04.2017.
 */
public class Actor {
    Tile sprite;
    float x;
    float y;
    float width;
    float height;
    double rotation;

    public Actor(Tile sprite, float x, float y, float width, float height,  double rotation){
        this.sprite = sprite;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.rotation = rotation;
    }

    public Actor(Tile sprite, float x, float y, float width, float height){
        this(sprite, x, y, width, height, 0);
    }

    public void draw(Surface surf){
        surf.draw(sprite, x, y, x+width, y+height, 0, 0, sprite.width(), sprite.height());
    }

    public void update(){
        //stuff
    }

    public Tile getSprite() {
        return sprite;
    }

    public void setSprite(Tile sprite) {
        this.sprite = sprite;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public double getRotation() {
        return rotation;
    }

    public void setRotation(double rotation) {
        this.rotation = rotation;
    }
}
