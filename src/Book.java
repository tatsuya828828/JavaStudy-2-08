import java.util.Date;

import org.apache.commons.lang3.builder.CompareToBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Book implements Comparable<Book>, Cloneable {
	private String title;
	private Date publishDate;
	private String comment;

	public boolean equals(Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	public int compareTo(Book obj) {
		return CompareToBuilder.reflectionCompare(this, obj);
	}

	public Book clone() {
		Book result = new Book();
		result.title = this.title;
		result.comment = this.comment;
		result.publishDate = (Date) this.publishDate.clone();
		return result;
	}
}
