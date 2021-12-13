/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mitutoyocat;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import jguiextensible.JFactory;
import jguiextensible.JGuiExtensible;
import jguiextensible.JGuiSimple;
import jguiextensible.JGuiTabbed;
import jguiextensible.JGuiTree;
import jguiextensible.JTipoGui;

/**
 *
 * @author a31r1z
 */
public class MitutoyoCat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
     javax.swing.SwingUtilities.invokeLater(() -> {
         init();
     });
    }
    
     private static JFrame crearFrame(Container gui) {
       
    JFrame frame;
    frame= new JFrame(gui.getName());
    
    frame.add(gui, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    frame.setMinimumSize(frame.getMinimumSize());
   
    return frame;
    
    }
     
    private static void init() {
        
        Micrometro micro = new Micrometro();
        Comparador comp = new Comparador();
        Calibre cal = new Calibre();
        Micrometro micro2 = new Micrometro();
        Palpador palp = new Palpador();
     
        JFactory factory = new JFactory();
        JGuiExtensible gui;
        JGuiExtensible gui2 = new JGuiTabbed();
        JGuiExtensible gui3 = new JGuiSimple();
        
        //gui= new JGuiSimple();
        
        //gui = factory.createDialog(JTipoGui.SIMPLE);
       
        //gui = factory.createDialog(JTipoGui.TABBED);
        gui = factory.createDialog(JTipoGui.TREE);
       
        gui.setName("GUI");
        gui2.setName("GUI2");
        gui3.setName("GUI3");
             
        //   gui.addExtensibleChild(comp);
       gui.addExtensibleChild(micro);
       // gui.addExtensibleChild(micro2);
        gui2.addExtensibleChild(cal);
       gui2.addExtensibleChild(palp);
       gui.addExtensibleChild(gui2);
    
       
       gui3.addExtensibleChild(comp);
       //gui.addExtensibleChild(micro);
       gui3.addExtensibleChild(micro2);
       //gui.addExtensibleChild(gui2);
       gui.addExtensibleChild(gui3);
                     
       crearFrame(gui);
    }
}
