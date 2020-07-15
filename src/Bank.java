import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
// apache commons-langを使用

public class Bank {
	String name;
	String address;

	public boolean equals(Object o) {
		// EqualsBuilderのreflectionEqualsメソッドは、そのクラスが持つ全てのフィールドが等価であるかを自動的に調べてくれる
		// 一部のフィールドを等価判定から除外するような使い方も可能
		return EqualsBuilder.reflectionEquals(this, o);
	}
	// hashCodeにもつかうことができる
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
