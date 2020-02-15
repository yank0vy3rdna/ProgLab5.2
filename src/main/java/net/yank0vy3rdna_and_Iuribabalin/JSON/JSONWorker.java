package net.yank0vy3rdna_and_Iuribabalin.JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.Storable;
import net.yank0vy3rdna_and_Iuribabalin.App.ObjectInterfaces.StoredType;

import java.io.*;

public class JSONWorker implements Workerable {
	private final Gson gson;
	public JSONWorker(JsonDeserializer<? extends Object> des) {
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(StoredType.class, des);
		gson = builder.create();
	}

	@SuppressWarnings("unchecked")
	public Object readValue(String json, Class cls){
		return (gson).fromJson(json, cls);
	}
	public String writeValue(Object object){
		return (new GsonBuilder().setPrettyPrinting().create()).toJson(object);
	}
	public Object load(String filename, Class cls){
		try {
			Object object;
			BufferedReader file = new BufferedReader(new FileReader(new File(filename)));
			StringBuilder jsonBuilder = new StringBuilder();
			int c;
			while(file.ready()){
				String string = Character.toString((char)(file.read()));
				jsonBuilder.append(string);
			}
			String json = jsonBuilder.toString();
			object =  cls.cast( readValue(json, cls));
			file.close();
			return object;
		}
		catch (FileNotFoundException e){
			return null;
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public void save(Storable objects, String filename) {
		try{
			BufferedOutputStream file = new BufferedOutputStream(new FileOutputStream(filename));
			String json;
			json = writeValue(objects);
			byte[] buffer = json.getBytes();
			file.write(buffer);
			file.close();
		}
		catch(IOException ex){
			ex.printStackTrace();
		}
	}
}