package pjt.core.main.mapper;

import org.apache.ibatis.annotations.Mapper;
import pjt.core.main.vo.LayoutCdVO;
import pjt.core.main.vo.LayoutReqVO;
import pjt.core.main.vo.LayoutResVO;

import java.util.List;

@Mapper
public interface MainMapper {
    /**
     * 메인 구역 저장
     * @param params - 메인코드 정보
     */
    void updateLayoutCd(LayoutCdVO params);

    /**
     * 메인 구역 조회
     * @param params -
     */
    List<LayoutCdVO> selectLayoutCd();

    /**
     * 메인 구역 상세 배치 생성
     * @param params - 메인 레이아웃 정보
     */
    void insertLayoutDetail(LayoutReqVO params);

    /**
     * 메인 구역 상세 배치 전체 조회
     * @param params -
     */

    List<LayoutResVO> selectLayoutDetailAll();

    /**
     * 메인 구역 상세 배치 부분 조회
     * @param params - 메인 레이아웃 정보
     */

    List<LayoutResVO> selectLayoutDetailPart(LayoutCdVO params);

    /**
     * 메인 구역 상세 배치 수정
     * @param params - 메인 레이아웃 정보
     */
    void updateLayoutDetail(LayoutReqVO params);

    /**
     * 메인 구역 상세 배치 삭제
     * @param params - 메인 레이아웃 정보
     */
    void deleteLayoutDetail(LayoutReqVO params);



}
