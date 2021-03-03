package FormUI;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
/**
 * @author  Administrator
 * @created March 3, 2021
 */
public class Form extends JFrame
{
    static Form theForm;

    /**
     * @author  Administrator
     * @created March 3, 2021
     */
    class Panel0 extends JPanel implements ActionListener
    {
        JButton btAddBtn;
        JButton btDeleteBtn;
        JLabel lbNameLbl;
        JLabel lbSurnameLbl;
        JTextField tfNameTbx;
        JTextField tfSurnameTbx;
        JTable tbTablo;

        /**
         *Constructor for the Panel0 object
         */
        public Panel0()
        {
            super();
            setBorder( BorderFactory.createTitledBorder( "" ) );

            GridBagLayout gbPanel0 = new GridBagLayout();
            GridBagConstraints gbcPanel0 = new GridBagConstraints();
            setLayout( gbPanel0 );

            btAddBtn = new JButton( "Ekle"  );
            btAddBtn.addActionListener( this );
            gbcPanel0.gridx = 1;
            gbcPanel0.gridy = 6;
            gbcPanel0.gridwidth = 8;
            gbcPanel0.gridheight = 2;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 0;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( btAddBtn, gbcPanel0 );
            add( btAddBtn );

            btDeleteBtn = new JButton( "Sil"  );
            btDeleteBtn.setActionCommand( "Ekle" );
            btDeleteBtn.addActionListener( this );
            gbcPanel0.gridx = 11;
            gbcPanel0.gridy = 6;
            gbcPanel0.gridwidth = 8;
            gbcPanel0.gridheight = 2;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 0;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( btDeleteBtn, gbcPanel0 );
            add( btDeleteBtn );

            lbNameLbl = new JLabel( "Name"  );
            gbcPanel0.gridx = 1;
            gbcPanel0.gridy = 1;
            gbcPanel0.gridwidth = 4;
            gbcPanel0.gridheight = 1;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 1;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( lbNameLbl, gbcPanel0 );
            add( lbNameLbl );

            lbSurnameLbl = new JLabel( "Surname"  );
            gbcPanel0.gridx = 1;
            gbcPanel0.gridy = 3;
            gbcPanel0.gridwidth = 4;
            gbcPanel0.gridheight = 1;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 1;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( lbSurnameLbl, gbcPanel0 );
            add( lbSurnameLbl );

            tfNameTbx = new JTextField( );
            gbcPanel0.gridx = 6;
            gbcPanel0.gridy = 1;
            gbcPanel0.gridwidth = 13;
            gbcPanel0.gridheight = 1;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 0;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( tfNameTbx, gbcPanel0 );
            add( tfNameTbx );

            tfSurnameTbx = new JTextField( );
            gbcPanel0.gridx = 6;
            gbcPanel0.gridy = 3;
            gbcPanel0.gridwidth = 13;
            gbcPanel0.gridheight = 1;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 0;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( tfSurnameTbx, gbcPanel0 );
            add( tfSurnameTbx );

            String [][]dataTablo = new String[][] { new String[] {"11", "21"},
                    new String[] {"12", "22"},
                    new String[] {"13", "23"} };
            String []colsTablo = new String[] { "", "" };
            tbTablo = new JTable( dataTablo, colsTablo );
            gbcPanel0.gridx = 1;
            gbcPanel0.gridy = 10;
            gbcPanel0.gridwidth = 18;
            gbcPanel0.gridheight = 9;
            gbcPanel0.fill = GridBagConstraints.BOTH;
            gbcPanel0.weightx = 1;
            gbcPanel0.weighty = 1;
            gbcPanel0.anchor = GridBagConstraints.NORTH;
            gbPanel0.setConstraints( tbTablo, gbcPanel0 );
            add( tbTablo );
        }

        /**
         */
        public void actionPerformed( ActionEvent e )
        {
            if ( e.getSource() == btAddBtn )
            {
                // Action for btAddBtn
            }
            if ( e.getSource() == btDeleteBtn )
            {
                // Action for btDeleteBtn
            }
        }
    }

    Panel0 pnPanel0;
    /**
     */
    public static void main( String args[] )
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.mac.MacLookAndFeel");
        }
        catch ( ClassNotFoundException e )
        {
        }
        catch ( InstantiationException e )
        {
        }
        catch ( IllegalAccessException e )
        {
        }
        catch ( UnsupportedLookAndFeelException e )
        {
        }
        theForm = new Form();
    }

    /**
     */
    public Form()
    {
        super( "TITLE" );

        pnPanel0 = new Panel0();

        setDefaultCloseOperation( EXIT_ON_CLOSE );

        setContentPane( pnPanel0 );
        pack();
        setVisible( true );
    }
}
