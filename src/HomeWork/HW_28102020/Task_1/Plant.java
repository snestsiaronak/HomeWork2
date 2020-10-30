package HomeWork.HW_28102020.Task_1;

import java.util.Objects;

public class Plant {
    private String plantType;
    private String plantName;

    public Plant(String plantType, String plantName) {
        this.plantType = plantType;
        this.plantName = plantName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plant plant = (Plant) o;
        return Objects.equals(plantType, plant.plantType) &&
                Objects.equals(plantName, plant.plantName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plantType, plantName);
    }

    public String getPlantType() {
        return plantType;
    }

    public String getPlantName() {
        return plantName;
    }
}
