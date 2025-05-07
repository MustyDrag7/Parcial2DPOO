package parcial2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz_grafica extends JFrame {
    private JTextField txtBase;
    private JTextField txtExponente;
    private JButton btnCalcular;
    private JLabel lblResultado;
    
    public Interfaz_grafica() {
        
        setTitle("Calculadora de Potencias");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        
        JLabel lblBase = new JLabel("Base (b):");
        txtBase = new JTextField();
        
        
        JLabel lblExponente = new JLabel("Exponente (e):");
        txtExponente = new JTextField();
        
        
        btnCalcular = new JButton("Calcular b^e");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPotencia();
            }
        });
        
      
        JLabel lblTitulo = new JLabel("Resultado:");
        lblResultado = new JLabel("---");
        lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
        
        
        panel.add(lblBase);
        panel.add(txtBase);
        panel.add(lblExponente);
        panel.add(txtExponente);
        panel.add(lblTitulo);
        panel.add(lblResultado);
        panel.add(new JLabel());
        panel.add(btnCalcular);
        
        
        add(panel);
    }
    
    private void calcularPotencia() {
        try {
            
            int base = Integer.parseInt(txtBase.getText().trim());
            int exponente = Integer.parseInt(txtExponente.getText().trim());
            
            
            int resultado = Parcial.potencia(base, exponente);
            
        
            lblResultado.setText(String.valueOf(resultado));
            lblResultado.setForeground(Color.BLUE);
            
        } catch (NumberFormatException e) {
            lblResultado.setText("Error: Ingrese números enteros válidos");
            lblResultado.setForeground(Color.RED);
        } catch (ParcialException e) {
            lblResultado.setText("Error: " + e.getMessage());
            lblResultado.setForeground(Color.RED);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Interfaz_grafica().setVisible(true);
            }
        });
    }
}