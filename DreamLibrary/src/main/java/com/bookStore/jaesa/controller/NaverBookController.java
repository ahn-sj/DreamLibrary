package com.bookStore.jaesa.controller;

import com.bookStore.jaesa.domain.NaverBook;
import com.bookStore.jaesa.service.NaverBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class NaverBookController {

    @Autowired
    private NaverBookService service;

    @RequestMapping("bookList.do")
    public ModelAndView bookList(@RequestParam(required=false)String keyword){
        ModelAndView mav = new ModelAndView();

        if(keyword !=null)
        {
            List<NaverBook> bookList = service.searchBook(keyword,20,1);
            mav.addObject("bookList", bookList);
            System.out.println(bookList.size());
        }
        mav.setViewName("bookList");
        return mav;
    }

}
