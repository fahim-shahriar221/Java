package com.myprojects;
import java.util.Scanner;
import java.util.LinkedList;

class Record {
    private String name;
    private int idNumber;
    private int contactNumber;

    public Record() {}

    public Record(String name, int idNumber, int contactNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.contactNumber = contactNumber;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Record [name='" + name + "', idNumber=" + idNumber + ", contactNumber=" + contactNumber + "]";
    }
}
public class StudentRecordLinkedList {

    public static void main(String[] args) {
        StudentRecordManagement hr = new StudentRecordManagement();
        Record record = new Record();
        record.setIdNumber(6862);
        record.setContactNumber(911);
        record.setName("Ankit");
        hr.add(record);

        Scanner input = new Scanner(System.in);
        int option = 0;

        while (true) {
            menu();
            option = input.nextInt();
            input.nextLine();
            switch (option) {
                case 1:
                    System.out.print("What is the Student id Number? ");
                    int idNumber = input.nextInt();

                    System.out.print("What is the Student contact Number? ");
                    int contactNumber = input.nextInt();
                    input.nextLine();

                    System.out.print("What is the Student Name? ");
                    String name = input.nextLine();

                    record = new Record(name, idNumber, contactNumber);
                    hr.add(record);
                    System.out.println(record.toString());
                    break;

                case 2:
                    System.out.print("What is the Student id number? ");
                    int rId = input.nextInt();
                    hr.delete(rId);
                    break;

                case 3:
                    System.out.print("What is the Student id number? ");
                    int rIdNo = input.nextInt();
                    hr.update(rIdNo, input);
                    break;

                case 4:
                    System.out.print("What is the Student id? ");
                    int bookId = input.nextInt();
                    if (!hr.find(bookId)) {
                        System.out.println("Student id does not exist\n");
                    }
                    break;

                case 5:
                    hr.display();
                    break;

                case 9:
                    System.out.println("\nThank you for using the program. Goodbye!\n");
                    input.close();
                    return;

                default:
                    System.out.println("\nInvalid input\n");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1: Add Student");
        System.out.println("2: Delete Student");
        System.out.println("3: Update Student");
        System.out.println("4: Search Student");
        System.out.println("5: Display Students");
        System.out.println("9: Exit program");
        System.out.print("Enter your selection: ");
    }
}

class StudentRecordManagement {
    LinkedList<Record> list;

    public StudentRecordManagement() {
        list = new LinkedList<>();
    }
    public void add(Record record) {
        if (!find(record.getIdNumber())) {
            list.add(record);
        } else {
            System.out.println("Record already exists in the list.");
        }
    }
    public boolean find(int idNumber) {
        for (Record l : list) {
            if (l.getIdNumber() == idNumber) {
                System.out.println(l);
                return true;
            }
        }
        return false;
    }
    public void delete(int recIdNumber) {
        Record recordDel = null;
        for (Record ll : list) {
            if (ll.getIdNumber() == recIdNumber) {
                recordDel = ll;
                break;
            }
        }
        if (recordDel == null) {
            System.out.println("Invalid record ID");
        } else {
            list.remove(recordDel);
            System.out.println("Successfully removed record from the list.");
        }
    }
    public Record findRecord(int idNumber) {
        for (Record l : list) {
            if (l.getIdNumber() == idNumber) {
                return l;
            }
        }
        return null;
    }
    public void update(int id, Scanner input) {
        if (find(id)) {
            Record rec = findRecord(id);
            System.out.print("What is the new Student id Number? ");
            int idNumber = input.nextInt();
            System.out.print("What is the new Student contact Number? ");
            int contactNumber = input.nextInt();
            input.nextLine(); 
            System.out.print("What is the new Student Name? ");
            String name = input.nextLine();
            rec.setIdNumber(idNumber);
            rec.setName(name);
            rec.setContactNumber(contactNumber);
            System.out.println("Record updated successfully.");
        } else {
            System.out.println("Record not found in the list.");
        }
    }
    public void display() {
        if (list.isEmpty()) {
            System.out.println("The list has no records.\n");
        } else {
            for (Record record : list) {
                System.out.println(record.toString());
            }
        }
    }
}

