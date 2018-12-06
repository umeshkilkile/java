package serialization;

import java.io.Serializable;

public class SerializationBox implements Serializable{
	private byte serializableProp = 10;

	public byte getSerializableProp() {
		return serializableProp;
	}

}
