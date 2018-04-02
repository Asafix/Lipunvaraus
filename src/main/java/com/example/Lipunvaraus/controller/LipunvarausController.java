package com.example.Lipunvaraus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.Lipunvaraus.bean.Lipunvaraus;
import com.example.Lipunvaraus.bean.LipunvarausRepository;

@Controller
public class LipunvarausController {

	@Autowired
	LipunvarausRepository repository;
	
	@RequestMapping(value = "/lipunvarauslista", method = RequestMethod.GET)
	public String LipunvarausFront(Model model) {

		model.addAttribute("varaus", new Lipunvaraus());
		model.addAttribute("varaukset", repository.findAll());
		return "varaukset";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveLipunvaraus(@ModelAttribute Lipunvaraus lipunvaraus, BindingResult errors,
			Model model) {

		repository.save(lipunvaraus);
		return "redirect:lipunvarauslista";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String deleteBook(@PathVariable("id") Long id, Model model) {

		repository.delete(id);
		return "redirect:../lipunvarauslista";
	}
	
}
