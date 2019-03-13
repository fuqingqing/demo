@RestController
public class Hello {
@RequestMapping("/")
    public String sayHello(){
        //修改返回的字符串的内容
        return "this is demo. Hello jenkins, " + new Date();
    }
}
