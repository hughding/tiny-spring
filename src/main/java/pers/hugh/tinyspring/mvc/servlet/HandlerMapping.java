package pers.hugh.tinyspring.mvc.servlet;

import javax.servlet.http.HttpServletRequest;

/**
 * @author xzding
 * @version 1.0
 * @since <pre>2018/1/19</pre>
 */
public interface HandlerMapping {

    HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception;
}
