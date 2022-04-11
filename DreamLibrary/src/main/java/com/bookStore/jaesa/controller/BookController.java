package com.bookStore.jaesa.controller;

import com.bookStore.jaesa.domain.Book;
import com.bookStore.jaesa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@Log4j
@RequestMapping("/")
public class BookController {

	@Autowired
	BookService bookService;

//	@Autowired
//	NaverBookService naverBookService;
	
	@GetMapping("/book")
	public String list(@RequestParam(required=false)String keyword, Model m) throws Exception {

		List<Book> book = bookService.getBookList();
		m.addAttribute("book", book);

		return "/book/store";
	}


}
