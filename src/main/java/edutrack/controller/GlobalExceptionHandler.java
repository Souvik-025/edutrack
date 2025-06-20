package edutrack.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Exception.class)
	public String handleException(RuntimeException e, Model m)
	{
		m.addAttribute("exception", e);
		return "error";
	}
}
