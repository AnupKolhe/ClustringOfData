package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Count.Count;
import Count.Line;
import Count.Space;
import Data.SendRec;
import Database.Database;
import StringWordCount.StringWordCount;

/**
 * Servlet implementation class server
 */
@WebServlet("/server")
public class server extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*Line  line = new Line();
		Space space = new Space();
		Count count = new Count();
	
		count.total();
		line.line();
		space.space();
		
		
		SendRec sendrec = new SendRec();
		
		int word =sendrec.getWord();
		System.out.println("New words are"+word);
		
		int setspace = sendrec.getSpace();
		System.out.println("New space are"+setspace);
		
		int linenumber = sendrec.getLine();
		System.out.println("New line number are"+linenumber);
		
		int countnumber = sendrec.getCount();
		System.out.println("New count nmber are"+countnumber);
	*/}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(req, resp);
		
		Line  line = new Line();
		Space space = new Space();
		Count count = new Count();
		StringWordCount StringCount = new StringWordCount();
		
		StringCount.StringCount();
		count.total();
		line.line();
		space.space();
		
		//asdfasd
		
		SendRec sendrec = new SendRec();
		
		int word =sendrec.getWord();
		//System.out.println("New words are"+word);
		
		int setspace = sendrec.getSpace();
		//System.out.println("New space are"+setspace);
		
		int linenumber = sendrec.getLine();
	//	System.out.println("New line number are"+linenumber);
		
		int countnumber = sendrec.getCount();
		//System.out.println("New count nmber are"+countnumber);
		
		sendrec.setWord(word);
		sendrec.setCount(countnumber);
		sendrec.setLine(linenumber);
		sendrec.setSpace(setspace);
		
		Database db = new Database();
		boolean flag = db.data(sendrec);
		
		
		resp.sendRedirect("NewPage.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
