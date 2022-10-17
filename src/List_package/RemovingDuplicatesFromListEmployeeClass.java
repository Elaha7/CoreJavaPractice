package List_package;

import java.util.Objects;

public class RemovingDuplicatesFromListEmployeeClass {

	 private String Firstname;
		private String Lastname;	
		private String address;
		private int age;
		@Override
		public int hashCode() {
			return Objects.hash(Firstname, Lastname, address, age);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			RemovingDuplicatesFromListEmployeeClass other = (RemovingDuplicatesFromListEmployeeClass) obj;
			return Objects.equals(Firstname, other.Firstname) && Objects.equals(Lastname, other.Lastname)
					&& Objects.equals(address, other.address) && age == other.age;
		} 
}
