package tools;

import java.util.*;

class PharmacyManagementSystem {
    protected static List<String> drugRecords = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRunning = true;

        while (isRunning) {
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
                    String drugNameToAdd = scanner.nextLine();
                    addDrugRecord(drugNameToAdd);
                    break;
                case 2:
                    displayDrugRecords();
                    break;
                case 3:
                    System.out.println("Enter drug name to update:");
                    String oldDrugName = scanner.nextLine();
                    System.out.println("Enter new drug name:");
                    String newDrugName = scanner.nextLine();
                    updateDrugRecord(oldDrugName, newDrugName);
                    break;
                case 4:
                    System.out.println("Enter drug name to delete:");
                    String drugNameToDelete = scanner.nextLine();
                    removeDrugRecord(drugNameToDelete);
                    break;
                case 5:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting Pharmacy Management System. Goodbye!");
    }

    // Method to add a new drug record
    public static void addDrugRecord(String drugName) {
        drugRecords.add(drugName);
        System.out.println("Drug record added successfully: " + drugName);
    }

    // Method to display all drug records
    protected static void displayDrugRecords() {
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
    protected static void updateDrugRecord(String oldDrugName, String newDrugName) {
        int index = drugRecords.indexOf(oldDrugName);
        if (index >= 0 && index < drugRecords.size()) {
            drugRecords.set(index, newDrugName);
            System.out.println("Drug record updated successfully.");
        } else {
            System.out.println("Drug record not found. Update failed.");
        }
    }

    // Method to remove a drug record
    protected static void removeDrugRecord(String drugName) {
        int index = drugRecords.indexOf(drugName);

        if (index >= 0 && index < drugRecords.size()) {
            String deletedDrug = drugRecords.remove(index);
            System.out.println("Deleted Drug Record: " + deletedDrug);
        } else {
            System.out.println("Drug record not found. Deletion failed.");
        }
    }
}
