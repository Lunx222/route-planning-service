package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Trajectory {
    Long taxiId;
    List<LoadedRecord> records;
    Integer duration;  //秒数
    public Coordinate getStartCoord(){
        if(records.size() > 0)
            return records.get(0).getCoordinate();
        else
            return null;
    }
    public Coordinate getEndCoord(){
        if(records.size() > 0)
            return records.get(records.size()-1).getCoordinate();
        else
            return null;
    }
    public Integer calculateDura(){
        if(records.size()>0) {
            LoadedRecord start = records.get(0);
            LoadedRecord end = records.get(records.size()-1);
            Long startTime = start.getTime().getTime();
            Long endTime = end.getTime().getTime();
            return (int)(endTime - startTime)/1000;
        }
        else
            return 0;
    }
}
