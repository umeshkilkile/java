import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;


public class ReadFromProperties {
public static void main(String[] args) {
	Map map = readPropsFromFile("C://Italy_TS_ES_BillingCodes.PROPERTIES");
	
	System.out.println(map.containsValue("ZNF2"));
}

public static Map<String, String> readPropsFromFile(String filePath) {
	InputStream in = null;
	Map<String, String> map = new HashMap<String, String>();
	Properties props = new Properties();

	if (null != filePath && !filePath.isEmpty()) {
		try {
			in = new FileInputStream(filePath);
			props.load(in);
			Iterator<?> iterator = props.keySet().iterator();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				String value = props.getProperty(key);
				map.put(key, value);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	return map;
}
}
