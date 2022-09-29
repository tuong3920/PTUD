package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import ulti.ImageAvatar;
import ulti.RoundedBorder;
import javax.swing.JSeparator;

public class TrangChu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Object CongNhan;
	private JPanel pnlChinh;
	private JPopupMenu popupMenu;
	private JPanel pnlTong;
	private JScrollPane scrollPane;
	private JPanel pnlLeft;
	private JPanel pnlMenu;
	private JPanel pnlLeft1;
	private RoundedBorder pnlInfor;
	private JMenuBar menuBar;
	private JMenu mnCongNhan;
	private JDesktopPane desktop;
	private JInternalFrame nhanvienFrm;
	private JPanel pnlContent;
	private JMenu mnNhanVien;
	private JMenuItem itemHopDong;
	private JMenuItem itemSanPham;
	private JMenuItem itemCongDoan;
	private JRadioButtonMenuItem itemQLCN;
	private JRadioButtonMenuItem itemCCCN;
	private JRadioButtonMenuItem itemTKCN;
	private JRadioButtonMenuItem itemQLNV;
	private JRadioButtonMenuItem itemCCNV;
	private JRadioButtonMenuItem itemTKNV;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrangChu frame = new TrangChu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public TrangChu() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
		

		pnlTong = new JPanel();
		pnlTong.setBackground(new Color(255, 255, 255));
		setContentPane(pnlTong);
		pnlTong.setLayout(null);

		pnlLeft = new JPanel();
		pnlLeft.setBackground(new Color(255, 255, 204));
		pnlLeft.setBounds(0, 0, 200, 848);
		pnlTong.add(pnlLeft);
		pnlLeft.setLayout(null);

		pnlLeft1 = new JPanel();
		pnlLeft1.setBackground(new Color(255, 255, 204));
		pnlLeft1.setBounds(0, 0, 200, 149);
		pnlLeft.add(pnlLeft1);
		pnlLeft1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\suit.png"));
		lblNewLabel.setBounds(0, 5, 200, 144);
		pnlLeft1.add(lblNewLabel);

		pnlMenu = new JPanel();
		pnlMenu.setBackground(new Color(255, 255, 204));
		pnlMenu.setBounds(0, 150, 200, 658);
		pnlLeft.add(pnlMenu);
		pnlMenu.setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(255, 255, 255));
		menuBar.setBounds(0, 0, 200, 678);
		pnlMenu.add(menuBar);
		menuBar.setLayout(new GridLayout(0, 1));

		mnCongNhan = new JMenu("CÔNG NHÂN");
		mnCongNhan.setIcon(new ImageIcon("image\\worker.png"));
		mnCongNhan.setHorizontalAlignment(SwingConstants.CENTER);
		mnCongNhan.setForeground(Color.BLACK);
		mnCongNhan.setFont(new Font("SansSerif", Font.BOLD, 17));
		menuBar.add(mnCongNhan);

		itemQLCN = new JRadioButtonMenuItem("Quản Lý Công Nhân");
		itemQLCN.setIcon(new ImageIcon("image\\engineering.png"));
		mnCongNhan.add(itemQLCN);

		itemCCCN = new JRadioButtonMenuItem("Chấm Công Công Nhân");
		itemCCCN.setIcon(new ImageIcon("image\\worker (2).png"));
		mnCongNhan.add(itemCCCN);

		itemTKCN = new JRadioButtonMenuItem("Thống Kê Công Nhân");
		itemTKCN.setIcon(new ImageIcon("image\\data.png"));
		mnCongNhan.add(itemTKCN);

		mnNhanVien = new JMenu("NHÂN VIÊN");
		mnNhanVien.setIcon(new ImageIcon("image\\employees.png"));
		mnNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		mnNhanVien.setForeground(Color.BLACK);
		mnNhanVien.setFont(new Font("SansSerif", Font.BOLD, 17));
		menuBar.add(mnNhanVien);
		
		itemQLNV = new JRadioButtonMenuItem("Quản Lý Nhân Viên");
		itemQLNV.setIcon(new ImageIcon("image\\management.png"));
		mnNhanVien.add(itemQLNV);
		
		itemCCNV = new JRadioButtonMenuItem("Chấm Công Nhân Viên");
		itemCCNV.setIcon(new ImageIcon("image\\salary (2).png"));
		mnNhanVien.add(itemCCNV);
		
		itemTKNV = new JRadioButtonMenuItem("Thống Kê Nhân Viên");
		itemTKNV.setIcon(new ImageIcon("image\\businessman.png"));
		mnNhanVien.add(itemTKNV);

		itemHopDong = new JMenuItem("HỢP ĐỒNG");
		itemHopDong.setIcon(new ImageIcon("image\\contract (1).png"));
		itemHopDong.setBackground(new Color(255, 255, 255));
		itemHopDong.setHorizontalAlignment(SwingConstants.CENTER);
		itemHopDong.setForeground(Color.BLACK);
		itemHopDong.setFont(new Font("SansSerif", Font.BOLD, 17));
		menuBar.add(itemHopDong);

		itemSanPham = new JMenuItem("SẢN PHẨM");
		itemSanPham.setIcon(new ImageIcon("image\\wedding.png"));
		itemSanPham.setBackground(new Color(255, 255, 255));
		itemSanPham.setHorizontalAlignment(SwingConstants.CENTER);
		itemSanPham.setForeground(Color.BLACK);
		itemSanPham.setFont(new Font("SansSerif", Font.BOLD, 17));
		menuBar.add(itemSanPham);

		itemCongDoan = new JMenuItem("CÔNG ĐOẠN");
		itemCongDoan.setIcon(new ImageIcon("image\\cutting.png"));
		itemCongDoan.setBackground(new Color(255, 255, 255));
		itemCongDoan.setHorizontalAlignment(SwingConstants.CENTER);
		itemCongDoan.setForeground(Color.BLACK);
		itemCongDoan.setFont(new Font("SansSerif", Font.BOLD, 17));
		menuBar.add(itemCongDoan);

		pnlInfor = new RoundedBorder();
		pnlInfor.setRoundBottomLeft(500);
		pnlInfor.setBackground(new Color(255, 255, 204));
		pnlInfor.setBounds(740, 10, 802, 70);
		pnlTong.add(pnlInfor);

		JLabel lblUser = new JLabel("Xin chào: Trần Văn Tường");
		lblUser.setBackground(new Color(51, 0, 0));
		lblUser.setForeground(new Color(0, 0, 0));
		lblUser.setFont(new Font("Times New Roman", Font.BOLD, 20));

		final ImageAvatar lblAvatar = new ImageAvatar();
		lblAvatar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				popupMenu.show(lblAvatar, e.getX(), e.getX());
			}
		});

		lblAvatar.setForeground(Color.WHITE);
		lblAvatar.setBorderSize(2);
		lblAvatar.setIcon(new ImageIcon("D:\\Mai-Shiranui-4.jpg"));
		GroupLayout gl_pnlInfor = new GroupLayout(pnlInfor);
		gl_pnlInfor.setHorizontalGroup(gl_pnlInfor.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlInfor.createSequentialGroup().addGap(448).addComponent(lblUser)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(lblAvatar, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_pnlInfor.setVerticalGroup(gl_pnlInfor.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlInfor.createSequentialGroup().addContainerGap()
						.addGroup(gl_pnlInfor.createParallelGroup(Alignment.LEADING)
								.addComponent(lblUser, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
								.addComponent(lblAvatar, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
						.addContainerGap()));

		popupMenu = new JPopupMenu();

		JMenuItem mInfor = new JMenuItem("Thông tin cá nhân");
		popupMenu.add(mInfor);

		JMenuItem mLogout = new JMenuItem("Đăng xuất");
		popupMenu.add(mLogout);
		pnlInfor.setLayout(gl_pnlInfor);

		pnlContent = new JPanel();
		pnlContent.setBackground(new Color(255, 255, 255));
		pnlContent.setBounds(210, 94, 1330, 755);
		pnlTong.add(pnlContent);
		pnlContent.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\production.png"));
		pnlContent.add(lblNewLabel_1, BorderLayout.NORTH);
		
		lblNewLabel_2 = new JLabel("QUẢN LÝ SẢN XUẤT");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 50));
		pnlContent.add(lblNewLabel_2);

		itemQLCN.addActionListener(this);
		itemCCCN.addActionListener(this);
		itemTKCN.addActionListener(this);
		itemQLNV.addActionListener(this);
		itemTKNV.addActionListener(this);
		itemCCNV.addActionListener(this);
		itemHopDong.addActionListener(this);
		itemSanPham.addActionListener(this);
		itemCongDoan.addActionListener(this);
	}

	class VerticalMenuBar extends JMenuBar {
		private final LayoutManager grid = new GridLayout(0, 1);

		public VerticalMenuBar() {
			setLayout(grid);
		}
	}

	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o.equals(itemQLCN)) {

			Panels(new CongNhanQuanLy());
		}
		else if (o.equals(itemCCCN)) {
			Panels(new CongNhanChamCong());
		}
		else if (o.equals(itemTKCN)) {

			Panels(new CongNhanThongKe());
		}
		else if (o.equals(itemQLNV)) {

			Panels(new NhanVienQuanLy());
		}
		else if (o.equals(itemTKNV)) {

			Panels(new NhanVienThongKe());
		}
		else if (o.equals(itemCCNV)) {

			Panels(new NhanVienChamCong());
		}
		else if (o.equals(itemHopDong)) {

			Panels(new HopDong());
		}
		else if (o.equals(itemSanPham)) {

			Panels(new SanPham());
		}
		else if (o.equals(itemCongDoan)) {

			Panels(new CongDoan());
		}
	}

	public void Panels(JPanel panel) {
		pnlContent.removeAll();
		pnlContent.add(panel, BorderLayout.CENTER);
		pnlContent.validate();
		pnlContent.setBackground(null);
	}
}
