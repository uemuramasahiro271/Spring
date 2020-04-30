package example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.app.form.EchoForm;

@Controller
@RequestMapping("echo")
public class EchoController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {
	    EchoForm form = new EchoForm();
		model.addAttribute(form);

		return "echo/input";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String echo(@Validated EchoForm form, BindingResult result) {
		if(result.hasErrors()) {
			return "echo/input";
		}
		return "echo/output";
	}

}
