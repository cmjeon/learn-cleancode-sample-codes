import java.text.ParseException;

import com.objectmentor.utilities.args.Args;

class ArgsMain {
	public static void main(String[] args) throws ParseException {
		Args arg = new Args("l,p#,d*", args);
		boolean logging = arg.getBoolean('l');
		int port = arg.getInteger('p');
		String directory = arg.getString('d');
		System.out.println("### logging : " + logging);
		System.out.println("### port : " + port);
		System.out.println("### directory : " + directory);
		// executeApplication(logging, port, directory);
	}
}