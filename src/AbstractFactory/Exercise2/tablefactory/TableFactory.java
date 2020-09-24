package AbstractFactory.Exercise2.tablefactory;

import AbstractFactory.Exercise2.factory.Factory;
import AbstractFactory.Exercise2.factory.Link;
import AbstractFactory.Exercise2.factory.Page;
import AbstractFactory.Exercise2.factory.Tray;

public class TableFactory extends Factory {

    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }

}
