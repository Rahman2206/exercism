import java.util.Map;
import java.util.HashMap;
public class DialingCodes {

    private Map<Integer, String> dialing = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return dialing;
    }

    public void setDialingCode(Integer code, String country) {
       dialing.put(code, country);

    }

    public String getCountry(Integer code) {

        return dialing.get(code);
        
    }

    public void addNewDialingCode(Integer code, String country) {
    // If the code (Key) already exists, we stop immediately.
    if (dialing.containsKey(code)) {
        return; 
    }

    else if (dialing.containsValue(country)){
        return;
    }
    
    // If we reach this line, the code is brand new!
    setDialingCode(code, country);
}

    public Integer findDialingCode(String country) {
    // We look at every pair (Key + Value) in the map
    for (Map.Entry<Integer, String> entry : dialing.entrySet()) {
        
        // If the Value of this entry matches the country we want...
        if (entry.getValue().equals(country)) {
            // ...return the Key (the dialing code)
            return entry.getKey();
        }
    }
    
    // If we checked everything and found nothing, return null
    return null; 
}
public void updateCountryDialingCode(Integer code, String country) {
    // 1. Guard Clause: If the country doesn't exist, we can't update it!
    if (!dialing.containsValue(country)) {
        return; 
    }

    // 2. Guard Clause: If the NEW code is already taken by someone else, stop.
    // (Optional, but keeps your data "Squeaky Clean"!)
    if (dialing.containsKey(code)) {
        return;
    }

    // 3. Find where the country is currently "living" (its old code)
    Integer oldCode = findDialingCode(country);

    // 4. "Move out" - Remove the old entry
    if (oldCode != null) {
        dialing.remove(oldCode);
    }

    // 5. "Move in" - Add the country with its new code
    dialing.put(code, country);
}

}
