package b_filter.e_life;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeFilter implements Filter{

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println("filter 666");
	}

	@Override
	public void destroy() {
		System.out.println("filter 444");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("filter 555");
	}
	
}
