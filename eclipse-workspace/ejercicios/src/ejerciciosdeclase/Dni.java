package ejerciciosdeclase;

import javax.swing.JOptionPane;

public class Dni {
       
        public static void main (String [] args) {
               
                String DNI  [] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
               
                String input_fnumber = JOptionPane.showInputDialog("Input first identification number");

                String input_snumber = JOptionPane.showInputDialog("Input second identification number");
               
                String input_tnumber = JOptionPane.showInputDialog("Input third identification number");
               
                String savedDNI [] = {input_fnumber, input_snumber, input_tnumber};
               
                int savedP [] = {0, 0, 0};
               
                for (int i = 0; i < savedDNI.length; i++) {
                       
                         savedP [i] = Integer.parseInt(savedDNI[i])%23;
                               
                }
               
                String result [] = {input_fnumber + DNI [savedP[0]], input_snumber+ DNI [savedP[1]], input_tnumber +  DNI [savedP[2]]};
               
                String resultmessage = "";
               
                for (int i = 0; i < result.length; i++) {
                       
                        resultmessage += result [i] + "\n" ;
                       
                }
               
                JOptionPane.showMessageDialog(null, resultmessage  + "\n");
       
        }

        }