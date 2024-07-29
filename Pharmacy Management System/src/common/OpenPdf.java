/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import java.io.File;
import javax.swing.JOptionPane;
import dao.PharmacyUtils;

/**
 *
 * @author fhnab
 */
public class OpenPdf {
    public static void openBy(String id){
        try{
            if((new File (PharmacyUtils.billpath+id+".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler"+PharmacyUtils.billpath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File is not Exists.");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
