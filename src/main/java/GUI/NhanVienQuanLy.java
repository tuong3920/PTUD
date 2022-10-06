package GUI;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class NhanVienQuanLy extends JPanel{
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
	private JLabel lblChcV;
	private JLabel lblSinThoai_1;
	private JTextField textField_6;

	/**
	 * Create the panel.
	 */
	public NhanVienQuanLy() {
		setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setLayout(null);
		setSize(1330,722);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 270, 1320, 383);
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
		String[] columnNames = { "Mã Nhân Viên", "Tên Nhân Viên","Chức vụ","Giới Tính", "Số Điện Thoại","Hệ Số Lương","Địa Chỉ","Ngày Sinh" };
		
		table = new JTable(data,columnNames);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		lblNewLabel = new JLabel("Mã Nhân Viên:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 10, 124, 35);
		add(lblNewLabel);
		
		btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(743, 219, 100, 30);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(853, 219, 100, 30);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(963, 219, 100, 30);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Tìm kiếm");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_3.setBounds(1191, 663, 114, 30);
		add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Nhập mã:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(896, 663, 85, 28);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(975, 667, 198, 25);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(144, 10, 202, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		lblTnCngNhn = new JLabel("Tên Nhân Viên:");
		lblTnCngNhn.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnCngNhn.setBounds(372, 10, 124, 35);
		add(lblTnCngNhn);
		
		lblSinThoai = new JLabel("Số Điện Thoai:");
		lblSinThoai.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSinThoai.setBounds(372, 73, 124, 35);
		add(lblSinThoai);
		
		lblPhi = new JLabel("Giới tính");
		lblPhi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPhi.setBounds(1162, 10, 77, 35);
		add(lblPhi);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(506, 13, 612, 33);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(554, 75, 198, 33);
		add(textField_3);
		
		lblaCh = new JLabel("Địa Chỉ:");
		lblaCh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblaCh.setBounds(375, 138, 69, 35);
		add(lblaCh);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(506, 141, 360, 33);
		add(textField_4);
		
		comboBox = new JComboBox();
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Quận / Huyện"}));
		comboBox.setBounds(896, 138, 167, 35);
		add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"03"}));
		comboBox_1.setBounds(506, 75, 51, 33);
		add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Thành Phố"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		comboBox_2.setBounds(1097, 138, 188, 35);
		add(comboBox_2);
		
		chckbxNewCheckBox = new JCheckBox("Nữ");
		chckbxNewCheckBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(1245, 12, 85, 30);
		add(chckbxNewCheckBox);
		
		btnNewButton_4 = new JButton("<");
		btnNewButton_4.setBounds(588, 663, 85, 21);
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("<<");
		btnNewButton_5.setBounds(506, 663, 85, 21);
		add(btnNewButton_5);
		
		btnNewButton_6 = new JButton(">");
		btnNewButton_6.setBounds(671, 663, 85, 21);
		add(btnNewButton_6);
		
		btnNewButton_7 = new JButton(">>");
		btnNewButton_7.setBounds(752, 663, 85, 21);
		add(btnNewButton_7);
		
		lblNgySinh = new JLabel("Ngày Sinh:");
		lblNgySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNgySinh.setBounds(808, 73, 82, 35);
		add(lblNgySinh);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(921, 76, 293, 33);
		add(textField_5);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\PTUD\\QuanLyLuong\\image\\schedule.png"));
		lblNewLabel_2.setBounds(1245, 73, 45, 35);
		add(lblNewLabel_2);
		
		lblChcV = new JLabel("Chức vụ:");
		lblChcV.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblChcV.setBounds(10, 74, 77, 35);
		add(lblChcV);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		comboBox_1_1.setBounds(144, 75, 202, 33);
		add(comboBox_1_1);
		
		lblSinThoai_1 = new JLabel("Hệ Số Lương");
		lblSinThoai_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSinThoai_1.setBounds(10, 137, 124, 35);
		add(lblSinThoai_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(144, 140, 202, 33);
		add(textField_6);
}
}
