package pers.hugh.tinyspring.mvc.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author xzding
 * @version 1.0
 * @since <pre>2018/1/19</pre>
 */
public interface View {
    void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception;
}
