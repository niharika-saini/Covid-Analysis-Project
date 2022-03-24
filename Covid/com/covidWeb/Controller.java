package com.covidWeb;


@Controller
public class Controller {
	
	@RequestMapping('/web')
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("index.jsp");

		return mv;

	}

}
