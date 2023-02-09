package CollectionsStudy.Set;

import java.util.HashSet;
import java.util.Set;

public abstract class HashSetHeavenlyBody {

    private final Key key;
    private final double orbintalPeriod;
    private final Set<HashSetHeavenlyBody> satellites;
    public enum BodyType {PLANET, DWARF_PLANET, MOON};

    public HashSetHeavenlyBody(String name, double orbintalPeriod, BodyType bodyType) {
        this.orbintalPeriod = orbintalPeriod;
        this.satellites = new HashSet<>();
        this.key = new Key(name, bodyType);

    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HashSetHeavenlyBody moon) {
        return this.satellites.add(moon);
    }

    public double getOrbintalPeriod() {
        return orbintalPeriod;
    }

    public Set<HashSetHeavenlyBody> getSatellites() {
        //for security way we return a new list
        return new HashSet<>(this.satellites);
    }

    public boolean addMoon(HashSetHeavenlyBody moon){

        return this.satellites.add(moon);
    }
    @Override
    public final boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if(obj instanceof HashSetHeavenlyBody) {
            HashSetHeavenlyBody theObject = (HashSetHeavenlyBody) obj;
            return this.key.equals(theObject.getKey());
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    public static Key makeKey(String name, BodyType bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbintalPeriod;
    }

    public static final class Key{
        private final String name;
        private final BodyType bodyType;

        public Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }
        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            if(this.name.equals(key.getName())) {
                return(this.bodyType == key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }

}
