package lang_package;

//For every Object in java, JVM will create a unique number and that is what we called as hashcode. Its not the address of the object.
//JVM will use this hashcode while saving objects to hashing related data strctures for search perpose.(HashTable,Hasmap,Hashset)
//Syntax. public native int hashCode()
// HashCode uses adress of the object in its alogrithm to generate the unique number, But it doesn't mean it generates exacly same number as adress of the object

public class hashCode_example {
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
public static void main(String[] args) {
	hashCode_example hashCode_example = new  hashCode_example();
	System.out.println("Hash Code ==>"+hashCode_example.hashCode());
}
}
