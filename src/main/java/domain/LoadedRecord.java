package domain;

import Utils.TimeHelper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class LoadedRecord {
    Long taxiId;
    Coordinate coordinate;
    Date time;
    public LoadedRecord(Long taxiId, Coordinate coordinate, Date utcTime){
        this.taxiId = taxiId;
        this.coordinate = coordinate;
        this.time = TimeHelper.fromUTCStamp(utcTime);
    }
}
