package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialVersionUIDTest_1 {
	public static void main(String args[]) throws IOException,
			ClassNotFoundException {
		Lion leo = new Lion("roar");
		// serialize
		System.out.println("Serialization done.");
		FileOutputStream fos = new FileOutputStream("serial.out");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(leo);

		// deserialize
		FileInputStream fis = new FileInputStream("serial.out");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion deserializedObj = (Lion) ois.readObject();
		System.out.println("DeSerialization done. Lion: "
				+ deserializedObj.getSound());
	}

}
