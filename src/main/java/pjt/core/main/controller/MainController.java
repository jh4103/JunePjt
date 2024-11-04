package pjt.core.main.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pjt.core.main.service.MainService;
import pjt.core.main.vo.LayoutCdVO;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MainController {
    private final MainService mainService;

    @GetMapping("/")
    public String openMain(Model model){
        return "/main/main";
    }


    //레이아웃 코드 화면 조회
    @GetMapping("/main/layoutCd.do")
    public String openLayoutView(Model model){
        List<LayoutCdVO> LayoutCdVO = mainService.openLayoutView();
        model.addAttribute("LayoutCd", LayoutCdVO);
        return "main/layoutCd_p";
    }
}
