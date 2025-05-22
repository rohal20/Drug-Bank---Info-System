package Drugs;

/** this the main drug class where all the
 * data is stored through various names assigned
 * to them and inputs all the desired information
 * required for the bank.
 *
 */

public class Drug {
    String drugBankId;
    String GenericName;
    String SMILES;
    String url;
    String drugGroups;
    String score;

    public Drug (String Name, String smi, String drugId, String Url, String DrugGro, Double sc) {
        GenericName = Name;
        drugBankId = drugId;
        url = Url;
        score = String.valueOf(sc);
        drugGroups = DrugGro;
        SMILES = smi;

    }

    /** this class basically just displays
     * the information regarding the drug.
     *
     */

    public void displayDrug() {
        System.out.println(GenericName);
        System.out.println(drugBankId);
        System.out.println(url);
        System.out.println(score);
        System.out.println(SMILES);
        System.out.println(drugGroups);
    }
}
