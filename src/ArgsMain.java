import java.util.Arrays;

import com.objectmentor.utilities.args.Args;
import com.objectmentor.utilities.args.ArgsException;

class ArgsMain {
	public static void main(String[] args) {
		try {
			Args arg = new Args("l,p#,d*", args);
			boolean logging = arg.getBoolean('l');
			int port = arg.getInteger('p');
			String directory = arg.getString('d');
			System.out.println("### logging : " + logging);
			System.out.println("### port : " + port);
			System.out.println("### directory : " + directory);
			// executeApplication(logging, port, directory);
		} catch (ArgsException e) {
			System.out.printf("Argument error: %s\n", e.errorMessage());
		}
	}
}