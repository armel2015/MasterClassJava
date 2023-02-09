package CollectionsStudy.Set;

public class Planet extends HashSetHeavenlyBody {

    public Planet(String name, double orbintalPeriod) {
        super(name, orbintalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HashSetHeavenlyBody moon) {
        if(moon.getKey().getBodyType() == BodyType.MOON) {
            return super.addSatellite(moon);
        } else {
            return false;
        }
    }

}
