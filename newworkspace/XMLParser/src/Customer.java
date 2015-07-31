import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlAttribute;
import com.sun.xml.internal.txw2.annotation.XmlElement;
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="Customer")
public class Customer {
String name;
int age;
int id;

public String getName()
{
	return name;
}
@XmlElement
public void setName(String name)
{
	this.name=name;
}

public int getAge()
{
	return age;
}
@XmlElement
public void setAge(int age)
{
	this.age=age;
}

public int getId()
{
	return id;
}
@XmlAttribute
public void setId(int id)
{
	this.id=id;
}
}
