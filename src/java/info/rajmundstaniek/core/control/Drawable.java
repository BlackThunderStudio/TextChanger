package info.rajmundstaniek.core.control;

import javafx.beans.NamedArg;

import java.io.InputStream;

/**
 * Created by rajmu on 17.03.03.
 */
public class Drawable extends javafx.scene.image.Image {
    public Drawable(@NamedArg("url") String url) {
        super(url);
    }

    public Drawable(@NamedArg("url") String url, @NamedArg("backgroundLoading") boolean backgroundLoading) {
        super(url, backgroundLoading);
    }

    public Drawable(@NamedArg("url") String url, @NamedArg("requestedWidth") double requestedWidth, @NamedArg("requestedHeight") double requestedHeight, @NamedArg("preserveRatio") boolean preserveRatio, @NamedArg("smooth") boolean smooth) {
        super(url, requestedWidth, requestedHeight, preserveRatio, smooth);
    }

    public Drawable(@NamedArg(value = "url", defaultValue = "\"\"") String url, @NamedArg("requestedWidth") double requestedWidth, @NamedArg("requestedHeight") double requestedHeight, @NamedArg("preserveRatio") boolean preserveRatio, @NamedArg(value = "smooth", defaultValue = "true") boolean smooth, @NamedArg("backgroundLoading") boolean backgroundLoading) {
        super(url, requestedWidth, requestedHeight, preserveRatio, smooth, backgroundLoading);
    }

    public Drawable(@NamedArg("is") InputStream is) {
        super(is);
    }

    public Drawable(@NamedArg("is") InputStream is, @NamedArg("requestedWidth") double requestedWidth, @NamedArg("requestedHeight") double requestedHeight, @NamedArg("preserveRatio") boolean preserveRatio, @NamedArg("smooth") boolean smooth) {
        super(is, requestedWidth, requestedHeight, preserveRatio, smooth);
    }

    @Override
    public void cancel() {
        super.cancel();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    /***
     * Creates new image from the Drawables image library
     * @param c current class
     * @param d image enum
     */
    public static javafx.scene.image.Image getImage(Class c, Drawables d) {
        return new Drawable(c.getClass().getResource(d.getPath()).toString());
    }

    public enum Drawables {
        ICON("/drawable/"),
        SPLASH_SCR("/drawable/"),
        SPLASH_SMALL("/drawable/");

        private String path;

        Drawables(String path){
            this.path = path;
        }

        public String getPath(){
            return path;
        }
    }
}
