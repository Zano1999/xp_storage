package com.github.charlyb01.xpstorage.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "books")
public class BookConfig implements ConfigData {
    @ConfigEntry.Gui.CollapsibleObject
    public Book book1 = new Book(30, 85);

    @ConfigEntry.Gui.CollapsibleObject
    public Book book2 = new Book(42, 90);

    @ConfigEntry.Gui.CollapsibleObject
    public Book book3 = new Book(69, 95);

    public static class Book {
        @ConfigEntry.BoundedDiscrete(min = 10, max = 200)
        @ConfigEntry.Gui.RequiresRestart
        public int maxLevel;

        @ConfigEntry.BoundedDiscrete(min = 50, max = 100)
        public int xpFromUsing;

        public Book(final int maxLevel, final int xpFromUsing) {
            this.maxLevel = maxLevel;
            this.xpFromUsing = xpFromUsing;
        }
    }
}
