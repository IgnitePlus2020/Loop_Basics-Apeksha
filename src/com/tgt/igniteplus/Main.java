package com.tgt.igniteplus;
import java.util.*;

public class Main {

        static Map<String, List<IgniteMembers>> members = new HashMap<>();
        static List<String> departments = new ArrayList();
        static Set<String> skillSet = new HashSet<String>();

        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            char yes;
            do {
                System.out.println("Choose one among the following");
                System.out.println("*-----------------------------------------*\n" +
                    "Press:" +
                    "\n1:To display all the Departments " +
                    "\n2:Create a new Department " +
                    "\n3:Delete a Department " +
                    "\n4:Display all the members as per Department" +
                    "\n5:Create a member and add the member to the Department" +
                    "\n*-----------------------------------------*");
                int choice = in.nextInt();
                switch (choice) {
                    case 1: displayDepartments();
                            break;
                    case 2: createDepartment();
                            break;
                    case 3: deleteDepartment();
                            break;
                    case 4: displayMembers();
                            break;
                    case 5: createMember();
                            break;
                    default: System.out.println("Choose a valid number");
                }
                System.out.println("\n*-------------------------------------------------*");
                System.out.println("Press Y/y to continue");
                yes = in.next().charAt(0);
            } while (Character.toUpperCase(yes) == 'Y');
        }

        public static void displayDepartments(){
            for(String dept : members.keySet())
                System.out.println("Department Name: " + dept);
        }

        public static void createDepartment(){
            char choice = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the name of the department");
            String dept = in.nextLine();
            inner:
            if(departments.contains(dept)){
                System.out.println("Department already exists");
                return;
            }
            members.put(dept,null);
            departments.add(dept);
           /* System.out.println("*----------------------------------------------*");
            System.out.println("Do you wish to know if the department was added?" +
                    "\n Press Y/y to display departments ");
            choice = in.next().charAt(0);
            if( Character.toUpperCase(choice) == 'Y')displayDepartments();*/
        }

        public static void deleteDepartment(){
            char choice;
            Scanner in = new Scanner(System.in);
            System.out.println("*-----------------------------------------------*");
            System.out.println("The list of departments: ");
            displayDepartments();
            System.out.println("Enter the name of the department you wish to delete");
            String dept = in.nextLine();
            if(departments.contains(dept)){
                departments.remove(dept);
                members.remove(dept);
            }
            else
                System.out.println("Department not in the list");
            /*System.out.println("*------------------------------------------------*");
            System.out.println("Do you wish to know if the department was deleted?" +
                    "\n Press Y/y to display departments ");
            choice = in.next().charAt(0);
            if( Character.toUpperCase(choice) == 'Y')displayDepartments();*/
        }

        public static void displayMembers(){
            for(String dept : members.keySet()){
                System.out.println("Department name: " +dept);
                System.out.println("*----------------------------------------------------------*");
                for(IgniteMembers member: members.get(dept))
                    System.out.println(member.toString());
                System.out.println("*----------------------------------------------------------*");
            }
        }

        public static void createMember(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Name: ");
            String name = in.nextLine();
            System.out.println("Enter the College Name");
            String college = in.nextLine();
            System.out.println("Enter the Age");
            int age = in.nextInt();
            String dept;
            System.out.println("Enter the number of skills");
            int count = in.nextInt();
            System.out.println("Enter the skills");
            for( int i = 0; i <= count;i++) {
                String skill = in.nextLine();
                skillSet.add(skill);
            }
            List<IgniteMembers> departmentMember = new ArrayList<>();
            departmentMember.add(new IgniteMembers(name,college,age,skillSet));
            System.out.println("*-----------------------------------------*");
            System.out.println("The list of departments:");
            displayDepartments();
            System.out.println("*-----------------------------------------*");
            System.out.println("Enter a department you wish to add the member to");
            dept =in.nextLine();
            if(departments.contains(dept))
                members.put(dept,departmentMember);
            else
                System.out.println("Department does not exist");
        }

}