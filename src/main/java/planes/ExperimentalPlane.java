package planes;

import models.ClassificationLevel;
import models.ExperimentalType;

import java.util.Objects;

public class ExperimentalPlane extends Plane{

    private ExperimentalType experimentalType;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity,
                             ExperimentalType experimentalType, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentalType = experimentalType;
        this.classificationLevel = classificationLevel;
    }

    public ExperimentalType getExperimentalType() {
        return experimentalType;
    }

    public void setExperimentalType(ExperimentalType experimentalType) {
        this.experimentalType = experimentalType;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object){
            return true;
        }
        if (!(object instanceof ExperimentalPlane)){
            return false;
        }
        if (!super.equals(object)){
            return false;
        }
        ExperimentalPlane experimentalPlane = (ExperimentalPlane) object;
        return Objects.equals(experimentalType, experimentalPlane.experimentalType) &&
                Objects.equals(classificationLevel, experimentalPlane.classificationLevel);


    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), experimentalType, classificationLevel);
    }

    @Override
    public String toString() {
        return super.toString().replace("}",", ExperimentalType=" + experimentalType +
                ", ClassificationLevel=" + classificationLevel+'}');
    }
}
