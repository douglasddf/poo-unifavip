/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package valida;
    import java.awt.*;  
    import javax.swing.*;  
      
    public class PainelTransparente extends JPanel {  
      
        public PainelTransparente() {  
            super();  
            setOpaque( false );  
        }  
      
        public void paintComponent( Graphics g ) {  
      
            super.paintComponent( g );  
      
            // setando a cor para um branco semitransparente  
            g.setColor( new Color( 255, 255, 255, 150 ));  
              
            // desenha um retângulo em toda a extensão do painel  
            g.fillRect( 20, 20, getWidth(), getHeight() );  
      
        } 
      
    }  