package thread;

/**
 * @description: 查看安全管理器
 * @author: Huangruzhe
 * @create: 2020-03-30 09:16
 */
public class SecurityManager {
    public static void main(String[] args) {
        //在java虚拟机中，它在访问控制-对于外部资源的访问控制-起到中枢作用
        System.out.println(System.getSecurityManager());
    }
}

