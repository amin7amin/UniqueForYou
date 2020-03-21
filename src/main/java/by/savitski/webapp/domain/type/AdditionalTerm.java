package by.savitski.webapp.domain.type;

/**
 * @author Ihar Savitski
 * @since 20.03.2020
 */

public enum AdditionalTerm {
    CHILDREN_WITH_PARENTS("children with parents", "Дети с родителями"),
    CHILDREN_WITHOUT_PARENTS("children without parents", "Дети без родителей"),
    NO_ADDITIONAL_TERMS("no additional terms", "Без дополнительных условий");

    private String name;
    private String nameRu;

    AdditionalTerm(String name, String nameRu) {
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

    public static AdditionalTerm fromString(String name) {
        for (AdditionalTerm value : AdditionalTerm.values()) {
            if (value.getName().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return NO_ADDITIONAL_TERMS;
    }

}
