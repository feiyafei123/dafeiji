package comchinashft.test.springmvc;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("springmvc")
@SessionAttributes("name")
public class HelloWord {
	
	@RequestMapping(value="/testRest",method=RequestMethod.POST)
	public String HellowWord(Map<String, Object> map){
		System.out.println("Asdasdas");
//		System.out.println("用户名"+eUser.getUsername() );
//		System.out.println("密码"+eUser.getPassword() );
//		System.out.println("角色"+eUser.getRole().getRole_name() );
		map.put("name", "asdas");
		return "success";
	}
	
	
}