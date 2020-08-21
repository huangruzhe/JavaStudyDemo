package huangruzhe.study.io.thread;

/**
 * @description: 创建守护线程
 * @author: Huangruzhe
 * @create: 2020-03-30 09:16
 */
public class CreateDaemonThread {
    public static void main(String[] args) {
        Thread daemonTread = new Thread();

        // 设定 daemonThread 为 守护线程，default false(非守护线程)
        daemonTread.setDaemon(true);

        // 验证当前线程是否为守护线程，返回 true 则为守护线程
        System.out.println(daemonTread.isDaemon());
    }
}

