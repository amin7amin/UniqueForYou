package by.savitski.webapp.domain.type;

/**
 * @author Ihar Savitski
 * @since 20.03.2020
 */

public enum AgeGroup {
    NO_LIMITS("no limits", "Без ограничений"),
    OLDER_50_YEARS("older 50 years old", "50 лет и старше"),
    OVER_18_YEARS("over 18 years old", "Cтарше 18 лет"),
    OVER_16_YEARS("over 16 years old", "Cтарше 16 лет"),
    OVER_12_YEARS("over 12 years old", "Cтарше 12 лет"),
    OVER_8_YEARS("over 8 years old", "Cтарше 8 лет"),
    OVER_5_YEARS("over 5 years old", "Cтарше 5 лет"),
    CHILDREN_UNDER_2_YEARS("children under 2 years old", "Дети до 2 лет"),
    CHILDREN_FROM_2_TO_5_YEARS("children from 2 to 5 years old", "Дети от 2 до 5 лет"),
    CHILDREN_FROM_5_TO_8_YEARS("children from 5 to 8 years old", "Дети от 5 до 8 лет"),
    CHILDREN_FROM_8_TO_12_YEARS("children from 8 to 12 years old", "Дети от 8 до 12 лет");

    private String name;
    private String nameRu;

    AgeGroup(String name, String nameRu) {
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

    public static AgeGroup fromString(String name) {
        for (AgeGroup value : AgeGroup.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return NO_LIMITS;
    }

}
