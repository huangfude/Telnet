package util.telnet;

public class ClientTest {

	public static void main(String[] args) throws Exception {
		String hostname = "localhost"; // or:127.0.0.1
		int port = 23;
		String username = "Lijinsheng";
		String password = "abc123";
		WindowsTelnetClient client = new WindowsTelnetClient(hostname, port, username, password);
		System.out.print(client.connect());
		System.out.print(client.sendCommand("dir")); // 执行windows命令
		System.out.print(client.sendCommand("D:\\Temp\\bat\\demo.bat abc123")); // 执行批处理脚本
		System.out.print(client.disconnect());
	}

}
