package com.company;
import javax.swing.*;
import java.awt.*;
////////////////////////////////DOMINO//////////////////////////////////////
    public class Main extends JComponent {


        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.white);
            frame.setSize(900, 900);
            frame.setLocation(800, 800);
            frame.getContentPane().add(new Main());//подключает весь код
            frame.setVisible(true);
        }

        public void paint(Graphics painter) {
            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{20, 90, 90, 20}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{20, 90, 90, 20}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{20,90}, new int[]{130,130}, 2);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{110, 180, 180, 110}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{110, 180, 180, 110}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{110,180}, new int[]{130,130}, 2);
            Image image1 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
            painter.drawImage(image1, 110,130,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{200, 270, 270, 200}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{200, 270, 270, 200}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{200,270}, new int[]{130,130}, 2);
            Image image2 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image2, 200,130,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{290, 360, 360, 290}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{290, 360, 360, 290}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{290,360}, new int[]{130,130}, 2);
             Image image3 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
             painter.drawImage(image3, 290,130,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{380, 450, 450, 380}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{380, 450, 450, 380}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{380,450}, new int[]{130,130}, 2);
             Image image4 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
             painter.drawImage(image4, 380,130,this);
             
            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{470, 540, 540, 470}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{470, 540, 540, 470}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{470,540}, new int[]{130,130}, 2);
            Image image5 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image5, 470,130,this);

            painter.setColor(Color.red);////////////////////
            painter.fillPolygon(new int[]{560, 630, 630, 560}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{560, 630, 630, 560}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{560,630}, new int[]{130,130}, 2);
            Image image6 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image6, 560,130,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{650, 720, 720, 650}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{650, 720, 720, 650}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{650,720}, new int[]{130,130}, 2);
            Image image11 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
            painter.drawImage(image11, 650,130,this);
            Image image111 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
            painter.drawImage(image111, 650,30,this);
            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{740, 810, 810, 740}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{740, 810, 810, 740}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{740,810}, new int[]{130,130}, 2);
            Image image22 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image22, 740,130,this);
            Image image222 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
            painter.drawImage(image222, 740,30,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{830, 900, 900, 830}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{830, 900, 900, 830}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{830,900}, new int[]{130,130}, 2);
             Image image33 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
             painter.drawImage(image33, 830,130,this);
             Image image333 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
             painter.drawImage(image333, 830,30,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{920, 990, 990, 920}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{920, 990, 990, 920}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{920,990}, new int[]{130,130}, 2);
             Image image44 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
             painter.drawImage(image44, 920,130,this);
             Image image444 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
             painter.drawImage(image444, 920,30,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{1010, 1080, 1080, 1010}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{1010, 1080, 1080, 1010}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{1010,1080}, new int[]{130,130}, 2);
            Image image55 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image55, 1010,130,this);
            Image image555 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
            painter.drawImage(image555, 1010,30,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{1100, 1170, 1170, 1100}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{1100, 1170, 1170, 1100}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{1100,1170}, new int[]{130,130}, 2);
            Image image66 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image66, 1100,130,this);
            Image image666 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/1.jpg").getImage();
            painter.drawImage(image666, 1100,30,this);

            painter.setColor(Color.red);//22222222222222222222222222
            painter.fillPolygon(new int[]{1190,1260, 1260, 1190}, new int[]{30, 30, 230,230}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{1190,1260, 1260, 1190}, new int[]{30, 30, 230,230}, 4);
            painter.drawPolygon(new int[]{1190,1260}, new int[]{130,130}, 2);
            Image image2222 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image2222, 1190,130,this);
            Image image3333 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image3333, 1190,30,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{470, 540, 540, 470}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{470, 540, 540, 470}, new int[]{235, 235, 435,435}, 4);
            painter.drawPolygon(new int[]{470,540}, new int[]{335,335}, 2);
            Image image2424 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
            painter.drawImage(image2424, 470,335,this);
            Image image2444= new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image2444, 470,235,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{380, 450, 450, 380}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{380, 450, 450, 380}, new int[]{235, 235, 435,435}, 4);
            painter.drawPolygon(new int[]{380,450}, new int[]{335,335}, 2);
            Image image2525= new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image2525, 380,335,this);
            Image image2555= new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image2555, 380,235,this);


            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{290, 360, 360, 290}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{290, 360, 360, 290}, new int[]{235, 235, 435,435}, 4);
            painter.drawPolygon(new int[]{290,360}, new int[]{335,335}, 2);
            Image image2626 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image2626, 290,335,this);
            Image image2666= new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image2666, 290,235,this);


            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{200, 270, 270, 200}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{200, 270, 270, 200}, new int[]{235, 235, 435,435}, 4);
            painter.drawPolygon(new int[]{200,270}, new int[]{335,335}, 2);
            Image image1313 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
            painter.drawImage(image1313, 200,335,this);
            Image image33333= new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
            painter.drawImage(image33333, 200,235,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{110, 180, 180, 110}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{110, 180, 180, 110}, new int[]{235, 235, 435,435}, 4);
            painter.drawPolygon(new int[]{110,180}, new int[]{335,335}, 2);
            Image image3434= new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
            painter.drawImage(image3434, 110,335,this);
            Image image3344= new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
            painter.drawImage(image3344, 110,235,this);


            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{20, 90, 90, 20}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{20, 90, 90, 20}, new int[]{235, 235, 435,435}, 4);
            painter.drawPolygon(new int[]{20,90}, new int[]{335,335}, 2);
            Image image3535 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image3535, 20,335,this);
            Image image3355= new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
            painter.drawImage(image3355, 20,235,this);
            /////////////////////////////////////////////////////////////////

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{560, 630, 630, 560}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{560, 630, 630, 560}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{560,630}, new int[]{335,335}, 2);
            Image image3636 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image3636, 560,335,this);
            Image image3366= new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
            painter.drawImage(image3366, 560,235,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{650, 720, 720, 650}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{650, 720, 720, 650}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{650,720}, new int[]{335,335}, 2);
            Image image4444= new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
            painter.drawImage(image4444, 650,335,this);
            Image image44444= new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
            painter.drawImage(image44444, 650,235,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{740, 810, 810, 740}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{740, 810, 810, 740}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{740,810}, new int[]{335,335}, 2);
             Image image4545=  new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
             painter.drawImage(image4545, 740,335,this);
             Image image4455= new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
             painter.drawImage(image4455, 740,235,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{830, 900, 900, 830}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{830, 900, 900, 830}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{830,900}, new int[]{335,335}, 2);
            Image image4646 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image4646, 830,335,this);
            Image image4466= new ImageIcon("C:/Users/polin/OneDrive/Desktop/4.jpg").getImage();
            painter.drawImage(image4466, 830,235,this);

            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{920, 990, 990, 920}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{920, 990, 990, 920}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{920,990}, new int[]{335,335}, 2);
            Image image55555= new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image55555, 920,335,this);
            Image image5555= new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image5555, 920,235,this);


            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{1010, 1080, 1080, 1010}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{1010, 1080, 1080, 1010}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{1010,1080}, new int[]{335,335}, 2);
            Image image5656 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image5656, 1010,335,this);
            Image image5566= new ImageIcon("C:/Users/polin/OneDrive/Desktop/5.jpg").getImage();
            painter.drawImage(image5566, 1010,235,this);


            painter.setColor(Color.red);
            painter.fillPolygon(new int[]{1100, 1170, 1170, 1100}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{1100, 1170, 1170, 1100}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{1100,1170}, new int[]{335,335}, 2);
            Image image6666 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image6666, 1100,335,this);
            Image image66666= new ImageIcon("C:/Users/polin/OneDrive/Desktop/6.jpg").getImage();
            painter.drawImage(image66666, 1100,235,this);


            painter.setColor(Color.red);//22222222222222222222222222
            painter.fillPolygon(new int[]{1190,1260, 1260, 1190}, new int[]{235,235,435,435}, 4);
            painter.setColor(Color.black);
            painter.drawPolygon(new int[]{1190,1260, 1260, 1190}, new int[]{235,235,435,435}, 4);
            painter.drawPolygon(new int[]{1190,1260}, new int[]{335,335}, 2);
            Image image2323 = new ImageIcon("C:/Users/polin/OneDrive/Desktop/3.jpg").getImage();
            painter.drawImage(image2323, 1190,335,this);
            Image image2233= new ImageIcon("C:/Users/polin/OneDrive/Desktop/2.jpg").getImage();
            painter.drawImage(image2233, 1190,235,this);


        }
    }
