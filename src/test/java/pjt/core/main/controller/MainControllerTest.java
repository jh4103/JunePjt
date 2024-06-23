package pjt.core.main.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pjt.core.main.mapper.MainMapper;
import pjt.core.main.vo.LayoutCdVO;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class MainControllerTest {

    @Autowired
    MainMapper mainMapper;

    @Test
    void selectLayoutCd(){
        List<LayoutCdVO> layoutCdVOs = mainMapper.selectLayoutCd();
        System.out.println("layoutCdVOs.size() = " + layoutCdVOs.size());

        for(LayoutCdVO a : layoutCdVOs){
            System.out.println("a.getZoneId() = " + a.getZoneId() + " " + a.getUseYn());
        }
    }


}