package dev.sdkssh.gameapi.api.properties;

public class Properties {
    public static Property<Integer> PLAYERS = new Property<>(6);
    @Deprecated
    public static Property<Boolean> MULTIARENA = new Property<>(false);
    public static Property<Boolean> BUNGEE = new Property<>(false);
    public static Property<String> BUNGEE_SERVER = new Property<>("");
    public static Property<Boolean> TEAMS = new Property<>(false);
    public static Property<Integer> PLAYERS_START = new Property<>(2);
    public static Property<Integer> PLAYERS_FORCE_START = new Property<>(6);
    public static Property<Integer> START_TIMER = new Property<>(30);
}
