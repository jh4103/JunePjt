package pjt.core.main.vo;

import lombok.Getter;

@Getter
public class LayoutCdVO {
    private String zoneId;      //구역 pk
    private String useYn;       //사용유무

    @Override
    public String toString() {
        return "LayoutCdVO{" +
                "zoneId='" + zoneId + '\'' +
                ", useYn='" + useYn + '\'' +
                '}';
    }
}
