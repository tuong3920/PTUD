package GUI;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CongDoan extends JPanel {
	private JTable table;
	private JTextField textField;
	private JButton btnNewButton_7;
	private JButton btnNewButton_6;
	private JButton btnNewButton_5;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JScrollPane scrollPane_1;
	private JTable table1;
	private JTable table_1;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JButton btnNewButton_8;
	private JLabel lblMSnPhm;
	private JTextField textField_2;
	private JLabel lblTnSnPhm;
	private JTextField textField_3;
	private JLabel lblSLng;
	private JTextField textField_4;

	/**
	 * Create the panel.
	 */
	public CongDoan() {
		setFont(new Font("Times New Roman", Font.PLAIN, 18));
		setLayout(null);
		setSize(1330,755);
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 319, 1330, 368);
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
		String[] columnNames = { "Mã Công Đoạn","Tên Công Đoạn","Tiền Công","Mã Sản Phẩm"};
		
		table = new JTable(data,columnNames);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Thêm");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(768, 262, 100, 33);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sửa");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_1.setBounds(878, 262, 100, 33);
		add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Xóa");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_2.setBounds(988, 262, 100, 33);
		add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Tìm kiếm");
		btnNewButton_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_3.setBounds(1185, 697, 114, 33);
		add(btnNewButton_3);
		
		lblNewLabel_1 = new JLabel("Nhập mã công đoạn:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(806, 702, 163, 28);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(975, 699, 198, 33);
		add(textField);
		textField.setColumns(10);
		
		btnNewButton_4 = new JButton("<");
		btnNewButton_4.setBounds(533, 698, 85, 21);
		add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("<<");
		btnNewButton_5.setBounds(451, 698, 85, 21);
		add(btnNewButton_5);
		
		btnNewButton_6 = new JButton(">");
		btnNewButton_6.setBounds(616, 698, 85, 21);
		add(btnNewButton_6);
		
		btnNewButton_7 = new JButton(">>");
		btnNewButton_7.setBounds(697, 698, 85, 21);
		add(btnNewButton_7);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 10, 885, 163);
		add(scrollPane_1);
		String[] columnNames1 = { "Mã Sản Phẩm","Mã Hợp Đồng", "Tên Sản Phẩm","Số Lượng Cần Làm"};
		table_1 = new JTable(data,columnNames1);
		scrollPane_1.setViewportView(table_1);
		
		lblNewLabel = new JLabel("Mã sản phẩm:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel.setBounds(905, 121, 114, 28);
		add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(1019, 121, 218, 33);
		add(textField_1);
		
		btnNewButton_8 = new JButton("Tìm");
		btnNewButton_8.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton_8.setBounds(1247, 119, 73, 30);
		add(btnNewButton_8);
		
		lblMSnPhm = new JLabel("Mã Công Đoạn");
		lblMSnPhm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMSnPhm.setBounds(10, 185, 114, 28);
		add(lblMSnPhm);
		
		textField_2 = new JTextField();
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(134, 186, 217, 33);
		add(textField_2);
		
		lblTnSnPhm = new JLabel("Tên Công Đoạn:");
		lblTnSnPhm.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTnSnPhm.setBounds(361, 182, 124, 36);
		add(lblTnSnPhm);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(498, 188, 397, 33);
		add(textField_3);
		
		lblSLng = new JLabel("Tiền Công:");
		lblSLng.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblSLng.setBounds(905, 191, 104, 28);
		add(lblSLng);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(1019, 189, 301, 33);
		add(textField_4);
		
		
	
	}
}
