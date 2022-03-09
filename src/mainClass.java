/**
 * Created by Grant on 3/28/2018.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;




public class mainClass extends Test1 implements BirthDateCalc{
    @Override
    public String AgeCalc(String Birth) {
        return null;
    }

    @Override
    public String WhoisOlder(Person P1, Person P2) {
        return null;
    }


/*
    public class inputGUI extends JFrame implements ActionListener{

    /*
        JPanel GUIMain = new JPanel();
        JPanel GUIPerson = new JPanel();
        JPanel GUIStudent = new JPanel();
        JPanel GUIGradStudent = new JPanel();
        Container GUIContainer = getContentPane();


        JButton makePerson = new JButton();
        JButton makeStudent = new JButton();
        JButton makeGrad = new JButton();
        JButton clearData = new JButton();
        JButton saveData = new JButton();

        //All Icons and Labels Below

        //Name Text fields
        JTextField firstName = new JTextField();
            JLabel firstNameLabel = new JLabel("Enter First Name:");

        JTextField middleInitial = new JTextField();
            JLabel middleInitialLabel = new JLabel("Enter Middle Initial:");

        JTextField lastName = new JTextField();
            JLabel LastNameLabel = new JLabel("Enter Last Name:");
        //Addreess
        JTextField Address1 = new JTextField();
            JLabel Address1Label = new JLabel("Enter Street Address 1:");
        JTextField Address2 = new JTextField();
            JLabel Address2Label = new JLabel("Enter Street Address 1:");
        JTextField City = new JTextField();
            JLabel CityLabel = new JLabel("Enter City Name:");
        JTextField State = new JTextField();
            JLabel StateLabel = new JLabel("Enter your State:");
        JTextField ZIP = new JTextField();
            JLabel ZIPLabel = new JLabel("Enter your ZIP:");
        //Fields for drop down menus
        String [] Majors = {"CIT","Physics","Math","Plant Science","7-year plan"};
        String [] Classes = {"CIT2 255", "CIT 155", "Literature of Monty Python", "Presidency of Kanye West", "Jazz flute", "Theory of killer drones","N/A"};
        //Drop Down Menus - Class and Major
        JComboBox FavoriteClass = new JComboBox(Classes);
        JComboBox Major = new JComboBox(Majors);
        //Student Boxes
        JTextField GraduationDate = new JTextField();
            JLabel GradDateLabel = new JLabel();
        JToggleButton AttendedHogworts = new JToggleButton();
        //GradStudentBoxes
        JTextField AdvisorFirstName = new JTextField();
        JTextField AdvisorMiddlesInitial = new JTextField();
        JTextField AdvisorLastName = new JTextField();
        JTextField ThesisTitle = new JTextField();
        */
        /*
        public inputGUI(){
            /*
            GUIContainer.setLayout(new BorderLayout());

            GUIMain.setLayout(new GridLayout(3,1,4,4));
            GUIMain.setVisible(true);




            GUIMain.add(makePerson);
            GUIMain.add(makeStudent);
            GUIMain.add(makeGrad);

            //Set default Values for combo Boxes and add to panels

            FavoriteClass.setSelectedItem("Choose Favorite Class");
            GUIStudent.add(FavoriteClass);
            GUIGradStudent.add(FavoriteClass);

            Major.setSelectedItem("Choose Your Major");
            GUIStudent.add(Major);
            GUIGradStudent.add(Major);


            makePerson.addActionListener(this);
            makeStudent.addActionListener(this);
            makeGrad.addActionListener(this);
            */


        /*
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == makePerson){

            }
        }
    }
    */

    public class Person{
        int age;
        String birthDate;
        Name myName;
        Address myAddress;


        public Person(){}

       public Person(int age,String birthDate,String a,String b,String c, String d, String e, String f,String g,String h){
            this.myName = new Name(a,b,c);
            this.myAddress = new Address(d,e,f,g,h);
            this.age = age;
            this.birthDate = birthDate;
        }

        //ALL GETTERS

        int getAge(){
           return this.age;
        }
        String getBirthDate(){
            return this.birthDate;
        }


        //ALL SETTERS
        void setAge(int Age){
            this.age = Age;
        }

        void seBirthDate(String BirthDate){
            this.birthDate = BirthDate;
        }


    }

    public class Student extends Person{
        public Student(){}
        String Major,FavoriteClass,GradDate;
        boolean AttendedHogwarts;
        public Student(int age, String birthDate,String Major,String FavoriteClass,String GradDate,String a,String b,String c, String d, String e, String f,String g,String h){
            super(age,birthDate,a,b,c,d,e,f,g,h);
            this.Major = Major;
            this.FavoriteClass = FavoriteClass;
            this.GradDate = GradDate;
        }

        //getters
        String getMajor(){
            return this.Major;
        }
        String getFavoriteClass(){
            return this.FavoriteClass;
        }
        String getGradDate(){
            return this.GradDate;
        }

        //setters
        void setMajor(String Major){
            this.Major = Major;
        }
        void setFavoriteClass(String FavoriteClass){
            this.FavoriteClass = FavoriteClass;
        }
        void setGradDate(String gradDate){
            this.GradDate = gradDate;
        }
    }

    public class GradStudent extends Student{
        String thesisTitle;
        Name AdvisorName;
        public GradStudent(){}


        public GradStudent(int age, String birthDate, String thesisTitle,String advisorFN,String advisorMI,String advisorLN,String Major,String FavoriteClass,String GradDate,String a,String b,String c, String d, String e, String f,String g,String h){
         super(age,birthDate,Major,FavoriteClass,GradDate,a,b,c,d,e,f,g,h);
         AdvisorName = new Name(advisorFN,advisorMI,advisorLN);
         this.thesisTitle = thesisTitle;

        }

        //getters
        String getThesisTitle()
        {
            return this.thesisTitle;
        }

        void setThesisTitle(String thesisTitle){
            this.thesisTitle = thesisTitle;
        }
    }

    public class Name {
        String firstName = "";
        String middleInitial = "";
        String lastName = "";

        public Name(){}

        public Name(String fn, String mi, String ln){
            this.firstName = fn;
            this.middleInitial = mi;
            this.lastName = ln;
        }

        //NAme getters
        String getFirstName(){
            return this.firstName;
        }
        String getMiddleInitial(){
            return this.middleInitial;
        }
        String getLastName(){
            return this.lastName;
        }

        //Name Setters

        void setFirstName(String firstName){
            this.firstName = firstName;
        }

        void setMiddleInitial(String middleInitial){
            this.middleInitial = middleInitial;
        }
        void setLastName(String lastName){
            this.lastName = lastName;
        }


    }

    public class Address{

        String Address1,Address2,City,State,ZIP;
        public Address(){}

        public Address(String A1, String A2, String City, String State, String ZIP){

            this.Address1 = A1;
            this.Address2 = A2;
            this.City = City;
            this.State = State;
            this.ZIP = ZIP;
        }
        //All getters
        public String getAddress1(){
            return this.Address1;
        }
        public String getAddress2(){
            return this.Address2;
        }
        public String getCity(){
            return this.City;
        }
        public String getState(){
            return this.State;
        }
        public String getZIP(){
            return this.ZIP;
        }
        //Al setters
        public void setAddress1(String Address1){
            this.Address1 = Address1;
        }
        public void  setAddress2(String Address2){
            this.Address2 = Address2;
        }
        public void setCity(String City){
            this.City = City;
        }
        public void setState(String State){
            this.State = State;
        }
        public void setZIP(String ZIP){
            this.ZIP = ZIP;
        }

    }





    public static void main(String [] args){

    }


}
