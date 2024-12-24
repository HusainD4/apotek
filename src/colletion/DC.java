/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colletion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author HUSAIN
 */
public class DC {
    public static void main(String[] args) {
//        List L = new ArrayList();
        Set L = new HashSet();
        L.add("1");
        L.add(1);
        L.add("Poltek harber");
        L.add(2);
        L.remove(1);
        
        for (Object O : L) {
//            System.out.println(O);
        }
        
        for (int i = 0; i < L.size(); i++) {
//            System.out.println(L.getClass(i));
            
        }
        
        
        
        Map<String,String> M = new HashMap<>();
        M.put("id","123123132");
        M.put("fullname","Husain Mulyansyah");
        M.put("username","Husain");
        M.remove("fullname");
//        System.out.println(M.get("fullname"));



        for (String s: M.keySet()) {
            String value = M.get(s);
            System.out.println(value);
            
        }
             
    }
    
}
