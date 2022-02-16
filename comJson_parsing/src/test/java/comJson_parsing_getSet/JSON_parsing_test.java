package comJson_parsing_getSet;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON_parsing_test {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] jsonData=Files.readAllBytes(Paths.get("C:\\Users\\SukhjeetKaur\\eclipse-workspace\\comJson_parsing\\empData.json"));
		ObjectMapper mapper=new ObjectMapper();
		
		Person person=mapper.readValue(jsonData, Person.class);
		
		System.out.println(person.getEmail());
		System.out.println(person.getAddress().getState());
		
	}

}
