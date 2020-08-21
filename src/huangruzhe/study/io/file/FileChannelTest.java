package huangruzhe.study.io.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {
 
	public static void main(String[] args) throws IOException {
		FileChannelTest fcChannelTest = new FileChannelTest();
		fcChannelTest.readFile();
	}
 
	public void readFile() throws IOException {
		//创建缓冲区
		ByteBuffer buffer= ByteBuffer.allocate(1024);
		CharBuffer cBuf = CharBuffer.allocate(1024);

		// 文件编码是utf8,需要用utf8解码
		Charset charset = Charset.forName("utf-8");
		CharsetDecoder decoder = charset.newDecoder();
 
		File file = new File(getClass().getResource("").getPath(), "中文测试.txt");
		FileInputStream fileInputStream=null;
		fileInputStream=new FileInputStream(file);

		//创建通道
		FileChannel channel = fileInputStream.getChannel();
		//从通道数据读取到缓冲区
		channel.read(buffer);
		//反转缓冲区
		buffer.flip();
		decoder.decode(buffer, cBuf, true);
		cBuf.flip();
		//判断position和limit之间是否有元素
		char[] chars=new char[cBuf.length()];
		while (cBuf.hasRemaining()){
			cBuf.get(chars);
			System.out.println(chars);
		}
	}
}