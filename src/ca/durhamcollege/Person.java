package ca.durhamcollege;

public class Person
{


    //private instance variables

    private String m_name;
    private int m_age;

    //Default Constructor

    public Person()
    {
        m_name = "unknown";
        m_age = 0;
    }

    //Constructor

    public Person(String name)
    {
        this.m_name = name;
        m_age = 0;
    }
    //Constructor

    public Person(int age)
    {
        this.m_age = age;
        m_name = "Unknown";
    }
    //Constructor

    public Person(String name, int age)
    {
        this.m_name = name;
        this.m_age = age;
    }

    //public properties

    public String getName()
    {
        return m_name;
    }

    public void setName(String name)
    {
        this.m_name = name;
    }

    public int getAge()
    {
        return m_age;
    }

    public void setAge(int age)
    {
        this.m_age = age;
    }

//METHODS

    /**
     * This method lets the Person say Hello to the Console
     * @return {Void}
     */
    public void saysHello()
    {
        System.out.println(this.m_name += " says Hello!");
    }

    /**
     * Method overrides the builtin toString method for the Person class. Returns Person properties
     * @return {string}
     */
    @Override
    public String toString()
    {
        String output = "";
        output += "Name:  " + this.m_name + " ";
        output += "Age :  " + this.m_age;
        return output;
    }
}
