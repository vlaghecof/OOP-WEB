package transformer;

import java.sql.ResultSet;
import java.util.List;

import model.AbstractEntity;

public interface Transformer<T extends AbstractEntity> {

	T toModel(ResultSet resultSet);
	
	List<T> toModelList(ResultSet resultSet);
	 
	
}
