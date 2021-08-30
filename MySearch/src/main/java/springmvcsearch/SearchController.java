package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

/**
 * Controller class for mapping requests, receiving and sending data
 * 
 * @author palakkharbanda
 *
 */
@Controller
public class SearchController {

	/**
	 * This method redirects the user to the "home.jsp" page which is the main page
	 * of this application as it displays a search bar and a button for searching
	 * something.
	 * 
	 * @return view to be seen(search page)
	 */
	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	/**
	 * This method receives the keyword typed by the user in the text box and then
	 * makes a url suitable for google and places that keyword in google's search
	 * url to fetch search results from google. This thing can be done using other
	 * search engines too.
	 * 
	 * @param query
	 * @return
	 * 
	 */
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		String url = "https://www.google.com/search?q=" + query;
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}

}
