package tools;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class PharmacyAppParametrizedTest {

    @SuppressWarnings("static-access")
	@ParameterizedTest
    @CsvSource({
            "Paracetamol",
            "Ibuprofen",
            "Aspirin"
    })
    void testCreateDrugRecord(String drugName) {
        PharmacyApp pharmacyApp = new PharmacyApp();
        PharmacyApp.createDrugRecord(drugName);
        
        assertTrue(pharmacyApp.drugRecords.contains(drugName));
    }

    @SuppressWarnings("static-access")
	@ParameterizedTest
    @CsvSource({
            "Ibuprofen, Aspirin",
            "Paracetamol, Tylenol"
    })
    void testUpdateDrugRecord(String newDrugName, String oldDrugName) {
        PharmacyApp pharmacyApp = new PharmacyApp();
        pharmacyApp.createDrugRecord(oldDrugName);
        System.out.println(oldDrugName);
        pharmacyApp.updateDrugRecord(newDrugName, oldDrugName);
        pharmacyApp.readDrugRecords();
        assertTrue(pharmacyApp.drugRecords.contains(newDrugName));
       
    }
    @SuppressWarnings("static-access")
    @ParameterizedTest
    @CsvSource({
            "Cough Syrup",
            "Antibiotics",
            "Pain Relief"
    })
    void testDeleteDrugRecord(String  drugName) {
        PharmacyApp pharmacyApp = new PharmacyApp();
        pharmacyApp.createDrugRecord(drugName);
        pharmacyApp.deleteDrugRecord(drugName);
        assertFalse(pharmacyApp.drugRecords.contains(drugName));
    }
}


