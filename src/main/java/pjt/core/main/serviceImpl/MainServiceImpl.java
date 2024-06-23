package pjt.core.main.serviceImpl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pjt.core.main.mapper.MainMapper;
import pjt.core.main.service.MainService;
import pjt.core.main.vo.LayoutCdVO;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MainServiceImpl implements MainService {

    @Autowired
    private final MainMapper mainMapper;

    @Override
    public List<LayoutCdVO> openLayoutView() {
        return mainMapper.selectLayoutCd();
    }
}
