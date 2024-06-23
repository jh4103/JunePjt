package pjt.core.main.vo;

import lombok.Getter;

@Getter
public class LayoutResVO {
    private String zoneId;          //구역 pk
    private int sn;                 //일련번호
    private String url;             //URL
    private String useYn;           //사용유무
    private int menuId;             //메뉴아이디
    private String firstTxt;        //텍스트1
    private String secondTxt;       //텍스트2
    private String thirdTxt;        //텍스트3
    private String originalFName;   //원파일이름
    private String savedFName;      //저장파일이름
    private int fSize;              //사이즈
    private String createdDt;       //생성일시
    private String modifiedDt;      //수정일시
}
