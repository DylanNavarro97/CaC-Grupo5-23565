package mappers;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MapperJson {
	ObjectMapper mapper = new ObjectMapper();
	
	public ObjectMapper getMapper() {
		return this.mapper;
	}
}
