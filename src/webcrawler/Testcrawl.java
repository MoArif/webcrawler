package webcrawler;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class Testcrawl {
	private static String url  = "http://en.wikipedia.org/";
	Document doc = Jsoup.connect(url).get();
	Elements newsHeadlines = doc.select("#mp-itn b a");

}
