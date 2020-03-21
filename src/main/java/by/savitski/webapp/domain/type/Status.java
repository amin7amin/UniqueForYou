package by.savitski.webapp.domain.type;

/**
 * @author Ihar Savitski
 * @since 20.03.2020
 */

public enum Status {
    MODERATION("Moderation", "На модерации"),
    ACTIVE("Active", "Активное"),
    ARCHIVAL("Archival", "Архивное");

    private String name;
    private String nameRu;

    Status(String name, String nameRu) {
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

    public static Status fromString(String name) {
        for (Status value : Status.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return MODERATION;
    }
}
