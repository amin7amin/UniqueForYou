package by.savitski.webapp.domain.type;

/**
 * @author Ihar Savitski
 * @since 21.03.2020
 */

public enum Region {
    BREST_REGION("Brest region", "Брестская область"),
    VITEBSK_REGION("Vitebsk region", "Витебская область"),
    GOMEL_REGION("Gomel region", "Гомельская область"),
    GRODNO_REGION("Grodno region", "Гродненская область"),
    MINSK_REGION("Minsk Region", "Минская область"),
    MOGILEV_REGION("Mogilev region", "Могилевская область"),
    UNKNOWN_REGION("Unknown region", "Неизвестная область");

    private String name;
    private String nameRu;

    Region(String name, String nameRu) {
        this.name = name;
        this.nameRu = nameRu;
    }

    public String getName() {
        return name;
    }

    public String getNameRu() {
        return nameRu;
    }

    @Override
    public String toString() {
        return "'" + name + "'";
    }

    public static Region fromString(String name) {
        for (Region value : Region.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return UNKNOWN_REGION;
    }
}
