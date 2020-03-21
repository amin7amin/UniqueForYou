package by.savitski.webapp.domain.type;

/**
 * @author Ihar Savitski
 * @since 19.03.2020
 */

public enum Role {
    ADMINISTRATOR("administrator", "администратор"),
    ORGANIZER("organizer", "организатор"),
    CUSTOMER("customer", "покупатель"),
    GUEST("guest", "гость");

    private String name;
    private String nameRu;

    Role(String name, String nameRu) {
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

    public static Role fromString(String name) {
        for (Role value : Role.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return GUEST;
    }
}
