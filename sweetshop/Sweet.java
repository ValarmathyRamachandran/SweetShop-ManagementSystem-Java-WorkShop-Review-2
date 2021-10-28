package bridgelabz.sweetshop;
import java.util.Objects;

public class Sweet {
	
	enum Color{
		BROWN, RED, GREEN, WHITE, BROWN_WHITE,YELLOW;
	}
	enum Category{
		MILK, SUGARLESS,JAGGERY,GHEE;
	}
	enum PropertyType{
		DIET , NORMAL
	}
	
	Color color;
	Category category;
	String name;
	String id;
	int price;
	PropertyType propertyType;

	
	@Override
	public String toString() {
		return "Sweet [color=" + color + ", category=" + category + ", name=" + name + ", id=" + id + ", price=" + price
				+ ", propertyType=" + propertyType + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash( id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweet other = (Sweet) obj;
		return  Objects.equals(id, other.id);
	}
}
	
	
	
