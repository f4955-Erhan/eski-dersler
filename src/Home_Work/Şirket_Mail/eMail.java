package Home_Work.Şirket_Mail;

import java.util.Scanner;

public class eMail {
    String firtsName;
    String lastName;
    String passWord;
    String department;
    String email;
    String emailSuffix = "@clarusWay.com";
    int mailBoxCapasity = 1000;
    int defaultpassWordLenght = 12;

    public eMail(String firtsName, String lastName, String department) {
        this.firtsName = firtsName;
        this.lastName = lastName;
        this.department = department;
    }

    public String setDepartment() {
        email = lastName + firtsName;

        String depArr[] = {"Test Automation", "Full Stack Developer", "Sales Force"};

        if (department.equalsIgnoreCase(depArr[0])) {
            email += "QA";
        } else if (department.equalsIgnoreCase(depArr[1])) {
            email += "FS";
        } else if (department.equalsIgnoreCase(depArr[2])) {
            email += "SF";
        }
        email += emailSuffix;

        return email;
    }

    public String SetRandomPassword() {

        String AlphaNumericString = "ABCDEFGHIJKLMNOPRSTUVYZ1234567890?*!'+abcdefghıjklmanoprstuvyi";

        StringBuilder password = new StringBuilder(defaultpassWordLenght);

        for (int i = 0; i < defaultpassWordLenght; i++) {

            int randomSayı = (int) (AlphaNumericString.length() * Math.random());// 0 ile alfasayı arasında rastgele bir sayı oluşturduk.
            // charAt(int index) kullanabilmek için int casting yaptık.
            password.append(AlphaNumericString.charAt(randomSayı));//SB'nin sonunda karakteri tek tek ekledik

        }

        passWord = password.toString();
        return passWord;
    }


    public String showInfo() {
        setDepartment();
        SetRandomPassword();
        return "eMail{" +
                "firtsName='" + firtsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



