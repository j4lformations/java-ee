package fr.esic.solutec.web.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MonFiltre implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("doFilter");
		
		//on verifie les condiitions d'acces à la ressource demandée
		if(true) {
			//On laisse passer
			chain.doFilter(request, response);
		}else {
			//on redirige vers une autre ressource
		}
	}
}
