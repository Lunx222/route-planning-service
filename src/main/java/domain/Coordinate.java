package domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Nirvana.L on 10/31/2017.
 */
@Getter
@Setter
public class Coordinate {
    Double latitude;
    Double longitude;
    public Coordinate(Double latitude, Double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
