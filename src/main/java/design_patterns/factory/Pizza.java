package design_patterns.factory;

/**
 * Created by Nikasan
 */
public abstract class Pizza {

    abstract String getName();

  abstract void prepare();

  abstract void bake();

  abstract void cut();

  abstract void box();
}
