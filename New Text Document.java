import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PharmacyManagementSystemTest {

    @Test
    void testAddDrugRecord() {
        PharmacyManagementSystem.drugRecords.clear(); 
        PharmacyManagementSystem.addDrugRecord("Paracetamol");
        assertEquals(1, PharmacyManagementSystem.drugRecords.size());
        assertTrue(PharmacyManagementSystem.drugRecords.contains("Paracetamol"));
    }

    @Test
    void testDisplayDrugRecords() {
        PharmacyManagementSystem.drugRecords.clear();
        PharmacyManagementSystem.drugRecords.add("Ibuprofen");
        PharmacyManagementSystem.drugRecords.add("Aspirin");
        PharmacyManagementSystem.displayDrugRecords();
    
    }

    @Test
    void testUpdateDrugRecord() {
        PharmacyManagementSystem.drugRecords.clear();
        PharmacyManagementSystem.drugRecords.add("Acetaminophen");
        PharmacyManagementSystem.updateDrugRecord("Acetaminophen", "Tylenol");
        assertEquals(1, PharmacyManagementSystem.drugRecords.size());
        assertTrue(PharmacyManagementSystem.drugRecords.contains("Tylenol"));
    }

    @Test
    void testRemoveDrugRecord() {
        PharmacyManagementSystem.drugRecords.clear();
        PharmacyManagementSystem.drugRecords.add("Codeine");
        PharmacyManagementSystem.removeDrugRecord("Codeine");
        assertEquals(0, PharmacyManagementSystem.drugRecords.size());
        assertFalse(PharmacyManagementSystem.drugRecords.contains("Codeine"));
    }

    @Test
    void testInvalidChoice() {
        PharmacyManagementSystem.main(new String[] {}); 
        
    }

    @Test
    void testExit() {
        PharmacyManagementSystem.main(new String[] {}); 
    }
}