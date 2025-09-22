package qr_pass;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class Redondo extends JPanel {

    private int roundTopLeft = 75;
    private int roundTopRight = 75;
    private int roundBottomLeft = 75;
    private int roundBottomRight = 75;
    private Shape shape;
    
    public Redondo() {
        setOpaque(false);
        initializeMouseListeners();
    }
    
    private void initializeMouseListeners() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                if (shape != null && shape.contains(e.getPoint())) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(Cursor.getDefaultCursor());
            }
            
            @Override
            public void mousePressed(MouseEvent e) {
                if (shape != null && !shape.contains(e.getPoint())) {
                    e.consume(); // Ignorar clicks fuera del área redondeada
                }
            }
        });
        
        addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                if (shape != null) {
                    if (shape.contains(e.getPoint())) {
                        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                    } else {
                        setCursor(Cursor.getDefaultCursor());
                    }
                }
            }
        });
    }

    @Override
    public boolean contains(int x, int y) {
        if (shape == null) {
            return super.contains(x, y);
        }
        return shape.contains(x, y);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        // Crear la forma con bordes redondeados
        int width = getWidth();
        int height = getHeight();
        
        shape = new RoundRectangle2D.Double(
            0, 0, width, height, 
            getArc(width, roundTopLeft, roundTopRight), 
            getArc(height, roundTopLeft, roundBottomLeft)
        );
        
        // Pintar solo dentro de la forma
        g2.setColor(getBackground());
        g2.fill(shape);
        g2.dispose();
    }
    
    private int getArc(int size, int corner1, int corner2) {
        // Calcular el arco basado en las esquinas
        return Math.min(size, Math.max(corner1, corner2));
    }

    // Getters y Setters (igual que antes)
    public int getRoundTopLeft() {
        return roundTopLeft;
    }

    public void setRoundTopLeft(int roundTopLeft) {
        this.roundTopLeft = roundTopLeft;
        repaint();
    }

    public int getRoundTopRight() {
        return roundTopRight;
    }

    public void setRoundTopRight(int roundTopRight) {
        this.roundTopRight = roundTopRight;
        repaint();
    }

    public int getRoundBottomLeft() {
        return roundBottomLeft;
    }

    public void setRoundBottomLeft(int roundBottomLeft) {
        this.roundBottomLeft = roundBottomLeft;
        repaint();
    }

    public int getRoundBottomRight() {
        return roundBottomRight;
    }

    public void setRoundBottomRight(int roundBottomRight) {
        this.roundBottomRight = roundBottomRight;
        repaint();
    }
}