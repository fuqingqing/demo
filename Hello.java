@RestController
public class Hello {
@RequestMapping("/")
    public String sayHello(){
        //修改返回的字符串的内容
        return "this is new demo. Hello jenkins, " + new Date();
    }
}
