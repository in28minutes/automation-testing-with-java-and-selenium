package com.in28minutes.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

@Controller
@SessionAttributes("name")
public class FileUploadController {

	@RequestMapping(value = "/fileupload", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("file") MultipartFile file, Model model) {
		model.addAttribute("message", "You successfully uploaded " + file.getOriginalFilename() + "!");
		return "file-upload-successful";

	}

}