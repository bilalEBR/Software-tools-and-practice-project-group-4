package tools;

      import java.util.*;

class PharmacyApp {
    protected static List<String> drugRecords = new ArrayList<>();
       static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;

        while (running) {
            System.out.println("Select operation:");
            System.out.println("1. Create Drug Record");
            System.out.println("2. Read Drug Record");
            System.out.println("3. Update Drug Record");
            System.out.println("4. Delete Drug Record");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                	 System.out.println("Enter drug name:");
                     String drugName = scanner.nextLine();
                    createDrugRecord(drugName);
                    break;
                case 2:
                    readDrugRecords();
                    break;
                case 3:
                	   System.out.println("Enter drug name to update:");
                        drugName=scanner.nextLine();
                	   System.out.println("Enter new drug name:");
                       String newDrugName = scanner.nextLine();
                    
                    updateDrugRecord(drugName ,newDrugName);
                    break;
                case 4:
                	  System.out.println("Enter drug name to delete:");
                       drugName = scanner.nextLine();
                    deleteDrugRecord(drugName);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting Pharmacy Application. Goodbye!");
    }

    // Method to create a new drug record
    public static void createDrugRecord(String drugName) {
       
        drugRecords.add(drugName);
        System.out.println("Drug record created successfully: " + drugName);
    }

    // Method to read/display all drug records
    protected static  void readDrugRecords() {
        if (drugRecords.isEmpty()) {
            System.out.println("No drug records found.");
        } else {
            System.out.println("Drug Records:");
            for (String drug : drugRecords) {
                System.out.println(drug);
            }
        }
    }

    // Method to update an existing drug record
    protected static void updateDrugRecord(String newDrugName ,String drugName) {
       // readDrugRecords();
        int index = drugRecords.indexOf(drugName);
        if (index >= 0 && index < drugRecords.size()) {
       
            drugRecords.set(index, newDrugName);
            System.out.println("Drug record updated successfully.");
        } else {
            System.out.println("Invalid index. Update failed.");
        }
    }

    // Method to delete a drug record
    protected static void deleteDrugRecord(String drugName) {
       // readDrugRecords();
      
       int index= drugRecords.indexOf(drugName);

        if (index >= 0 && index < drugRecords.size()) {
            String deletedDrug = drugRecords.remove(index);
            System.out.println("Deleted Drug Record: " + deletedDrug);
        } else {
            System.out.println("Invalid index. Deletion failed.");
        }
    }
}


