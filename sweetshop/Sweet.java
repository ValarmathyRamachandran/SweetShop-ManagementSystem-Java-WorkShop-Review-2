package bridgelabz.sweetshop;

import java.util.Objects;

public abstract class Sweet {
	
	enum Color{
		BROWN, RED, GREEN, WHITE, BROWN_WHITE,YELLOW;
	}
	enum Category{
		MILK, SUGARLESS,JAGGERY,GHEE;
	}
	
	
	Color color;
	Category category;
	String name;
	public String id;
	public int price;

	@Override
	public String toString() {
		return "Sweet [id=" + id + ", color=" + color + ", price=" + price + ", category=" + category + ", name=" + name
				+ "]";
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
	
	
	
