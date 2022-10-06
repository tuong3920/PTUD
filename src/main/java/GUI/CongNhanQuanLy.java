package GUI;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CongNhanQuanLy extends JPanel {
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;
	private JLabel lblNewLabel_2;
	private JLabel lblNgySinh;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JCheckBox chckbxNewCheckBox;
	private JComboBox comboBox_2;
	private JComboBox comboBox_1;
	private JComboBox comboBox;
	private JTextField textField_4;
	private JLabel lblaCh;
	private JLabel lblPhi;
	private JLabel lblSinThoai;
	private JLabel lblTnCngNhn;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;

	/**
	 * Create the panel.
	 */
	public CongNhanQuanLy() {
		setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setLayout(null);
		setSize(1330, 722);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 224, 1330, 426);
		add(scrollPane);
		String[][] data = {
//                {"4031", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4032", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4033", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4034", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4035", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4036", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4037", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
//                {"4038", "Kundan Kumar Jha", "0901475930", "24 Nguyễn Văn Bảo, Gò Vấp, Hồ Chí Mình", "Nữ" },
        };
		String[] columnNames = { "Mã Công Nhân", "Tên Công Nhân","Giới Tính", "Số Điện Thoại","Địa Chỉ","Ngày Sinh" };
		
		table = new JTable(data,columnNames);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("Mã Công Nhân:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 124, 35);
		add(lblNewLabel);
		
		btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(791, 155, 100, 30);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(901, 155, 100, 30);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(1011, 155, 100, 30);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Tìm kiếm");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_3.setBounds(1185, 669, 114, 30);
		add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Nhập mã:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(879, 670, 85, 28);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(968, 671, 198, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(148, 10, 198, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblTnCngNhn = new JLabel("Tên Công Nhân:");
		lblTnCngNhn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnCngNhn.setBounds(372, 10, 124, 35);
		add(lblTnCngNhn);
		
		lblSinThoai = new JLabel("Số Điện Thoai:");
		lblSinThoai.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSinThoai.setBounds(10, 68, 124, 35);
		add(lblSinThoai);
		
		lblPhi = new JLabel("Giới Tính:");
		lblPhi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPhi.setBounds(1154, 10, 85, 35);
		add(lblPhi);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(523, 13, 604, 33);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(195, 68, 144, 33);
		add(textField_3);
		
		lblaCh = new JLabel("Địa Chỉ:");
		lblaCh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblaCh.setBounds(372, 68, 69, 35);
		add(lblaCh);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(451, 71, 235, 33);
		add(textField_4);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Quận / Huyện"}));
		comboBox.setBounds(696, 68, 135, 35);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"03"}));
		comboBox_1.setBounds(147, 68, 51, 33);
		add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Thành Phố"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_2.setBounds(841, 68, 135, 35);
		add(comboBox_2);
		
		chckbxNewCheckBox = new JCheckBox("Nữ");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(1245, 12, 85, 30);
		add(chckbxNewCheckBox);
		
		btnNewButton_4 = new JButton("<");
		btnNewButton_4.setBounds(619, 669, 85, 21);
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("<<");
		btnNewButton_5.setBounds(537, 669, 85, 21);
		add(btnNewButton_5);
		
		btnNewButton_6 = new JButton(">");
		btnNewButton_6.setBounds(702, 669, 85, 21);
		add(btnNewButton_6);
		
		btnNewButton_7 = new JButton(">>");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(783, 669, 85, 21);
		add(btnNewButton_7);
		
		lblNgySinh = new JLabel("Ngày Sinh:");
		lblNgySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNgySinh.setBounds(1007, 68, 82, 35);
		add(lblNgySinh);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(1095, 71, 144, 33);
		add(textField_5);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel_2.setBounds(1254, 68, 45, 35);
		add(lblNewLabel_2);
		
		
	
	}
	
}
