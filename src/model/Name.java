package model;

import java.io.Serializable;
import java.util.Objects;

public class Name implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fName;
	private String mName;
	private String lName;
	
	public Name(String f, String l) {
		fName = f;
		lName = l;
	}
	
	public Name(String f, String m, String l) {
		fName = f;
		mName = m;
		lName = l;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fName, lName, mName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Name))
			return false;
		Name other = (Name) obj;
		return Objects.equals(fName, other.fName) && Objects.equals(lName, other.lName)
				&& Objects.equals(mName, other.mName);
	}

	@Override
	public String toString() {
		return "Name [fName=" + fName + ", mName=" + mName + ", lName=" + lName + "]";
	}
}
