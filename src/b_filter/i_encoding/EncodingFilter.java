package b_filter.i_encoding;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		//1.强转
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		
		//2.放行 将包装过的request传递回来
		arg2.doFilter(new MyRequest(request), response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		Filter.super.destroy();
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		Filter.super.init(filterConfig);
	}

}

class MyRequest extends HttpServletRequestWrapper{

	private HttpServletRequest request;


	public MyRequest(HttpServletRequest request) {
		super(request);
		this.request = request;
	}
	
	
	@Override
	public String getParameter(String name) {
		//获取请求方式
		String m = request.getMethod();
		if("get".equalsIgnoreCase(m)){
			//get请求
			String value = request.getParameter(name);
			try {
				return new String(value.getBytes("iso8859-1"),"utf-8");
			} catch (UnsupportedEncodingException e) {
			} 
		}else if("post".equalsIgnoreCase(m)){
			try {
				request.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
			}
			return request.getParameter(name);
		}
		return super.getParameter(name);
	}
}
