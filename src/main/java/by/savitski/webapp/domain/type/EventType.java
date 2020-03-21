package by.savitski.webapp.domain.type;

/**
 * @author Ihar Savitski
 * @since 20.03.2020
 */

public enum EventType {
    SPORTS_EVENTS("Sporting events", "Спортивные мероприятия"),
    TOURIST_ACTIVITIES("Tourist activities", "Туристические мероприятия"),
    MUSICAL_EVENTS("Musical events", "Музыкальные мероприятия"),
    THEATRICAL_EVENTS("Theatrical events", "Театральные мероприятия"),
    CULTURAL_EVENTS("Cultural events", "Культурные мероприятия"),
    OTHER_EVENTS("Other events", "Другие мероприятия");

    private String name;
    private String nameRu;

    EventType(String name, String nameRu) {
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

    public static EventType fromString(String name) {
        for (EventType value : EventType.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return OTHER_EVENTS;
    }
}
