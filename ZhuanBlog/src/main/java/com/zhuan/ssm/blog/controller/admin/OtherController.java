package com.liuyanzhao.ssm.blog.controller.admin;


import com.liuyanzhao.ssm.blog.entity.Category;
import com.liuyanzhao.ssm.blog.entity.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/other")
/**
 * 后台浏览博客背景
 *
 * @param articleParam
 * @return
 */
public class OtherController {
    @RequestMapping(value = "/111")
    public String aaa(Model model) {

        return "Admin/About/111";
    }


    @RequestMapping(value = "/222")
    public String bbb(Model model) {

        return "Admin/About/222";
    }


    @RequestMapping(value = "/333")
    public String ccc(Model model) {

        return "Admin/About/333";
    }
}