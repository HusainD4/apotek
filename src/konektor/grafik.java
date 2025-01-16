package konektor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.sql.*;
import javax.swing.SwingUtilities;

public class grafik {

    // Method untuk membuat dataset dari database
    private static CategoryDataset createDataset(int selectedMonth, int selectedYear) {
        final String income = "Income"; // dalam juta
        final String QTY = "Item Terjual"; // Jumlah Produk yang Terjual
        final String TRS = "Jumlah Transaksi"; // Bisa digunakan jika Anda ingin menampilkan transaksi

        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Menggunakan koneksi dari kelas 'connect'
        Connection conn = connect.Go();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Query untuk mengambil data berdasarkan bulan dan tahun yang dipilih
            String sql = "SELECT SUM(total_harga) AS total_income, "
                    + "       SUM(jumlah_produk) AS total_qty, "
                    + "       MONTH(tanggal_transaksi) AS month, "
                    + "       YEAR(tanggal_transaksi) AS year "
                    + "FROM transaksi_detail "
                    + "WHERE MONTH(tanggal_transaksi) = ? "
                    + "AND YEAR(tanggal_transaksi) = ? "
                    + "GROUP BY YEAR(tanggal_transaksi), MONTH(tanggal_transaksi)";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, selectedMonth);  // Menetapkan nilai bulan ke parameter query
            stmt.setInt(2, selectedYear);   // Menetapkan nilai tahun ke parameter query
            rs = stmt.executeQuery();

            // Mengisi dataset dengan data dari query
            while (rs.next()) {
                String month = getMonthName(rs.getInt("month")); // Mendapatkan nama bulan
                dataset.addValue(rs.getDouble("total_income"), month, income);  // Menambahkan pendapatan
                dataset.addValue(rs.getInt("total_qty"), month, QTY);  // Menambahkan jumlah item terjual
                dataset.addValue(rs.getDouble("total_income"), month, TRS);  // Menambahkan jumlah transaksi
            }

        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

        return dataset;
    }

    // Mengambil nama bulan dari angka bulan (1 = Januari, 2 = Februari, dst)
    private static String getMonthName(int month) {
        String[] months = {
            "JANUARI", "FEBRUARI", "MARET", "APRIL", "MEI", "JUNI",
            "JULI", "AGUSTUS", "SEPTEMBER", "OKTOBER", "NOVEMBER", "DESEMBER"
        };
        return months[month - 1];
    }

    public static void main(String[] args) {
        // Membuat array yang berisi nama bulan dan tahun
        String[] months = {
            "JANUARI", "FEBRUARI", "MARET", "APRIL", "MEI", "JUNI",
            "JULI", "AGUSTUS", "SEPTEMBER", "OKTOBER", "NOVEMBER", "DESEMBER"
        };

        // Daftar tahun yang ingin ditampilkan (misalnya dari 2020 hingga 2025)
// Membuat array tahun dari 2020 hingga 2090
        String[] years = new String[2090 - 2020 + 1]; // 2090 - 2020 + 1 untuk memasukkan kedua tahun
        for (int i = 0; i < years.length; i++) {
            years[i] = String.valueOf(2020 + i); // Menambahkan tahun ke dalam array
        }

        // Membuat JComboBox untuk memilih bulan dan tahun
        JComboBox<String> monthComboBox = new JComboBox<>(months);
        JComboBox<String> yearComboBox = new JComboBox<>(years);

        JButton showButton = new JButton("Tampilkan Grafik");
        JButton backButton = new JButton("Kembali");

        showButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedMonthString = (String) monthComboBox.getSelectedItem(); // Mendapatkan bulan yang dipilih
                String selectedYearString = (String) yearComboBox.getSelectedItem();  // Mendapatkan tahun yang dipilih

                int selectedMonth = getMonthNumber(selectedMonthString);  // Mengonversi bulan ke angka (1 - 12)
                int selectedYear = Integer.parseInt(selectedYearString);  // Mengonversi tahun menjadi angka

                // Membuat grafik berdasarkan bulan dan tahun yang dipilih
                JFreeChart chart = ChartFactory.createBarChart(
                        "Grafik Pendapatan dan Penjualan Bulanan", // Chart title
                        "Bulan", // X-axis Label
                        "Nilai", // Y-axis Label
                        createDataset(selectedMonth, selectedYear),
                        PlotOrientation.VERTICAL, // Orientation (vertical)
                        true, // Include legend
                        true, // Tooltips
                        false // URLs
                );

                CategoryItemRenderer renderer = ((CategoryPlot) chart.getPlot()).getRenderer();
                renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator());
                renderer.setDefaultItemLabelsVisible(true);
                ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12,
                        TextAnchor.TOP_CENTER);
                renderer.setDefaultPositiveItemLabelPosition(position);

                ChartPanel chartPanel = new ChartPanel(chart);
                chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));

                // Membuat JFrame untuk menampilkan chart
                JFrame frame = new JFrame();
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Mengubah agar hanya menutup jendela
                frame.getContentPane().add(chartPanel, BorderLayout.CENTER);

                // Menjadikan jendela grafik selalu di atas
                frame.setAlwaysOnTop(true); // Menjadikan jendela selalu di atas

                // Menampilkan JFrame
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                // Menambahkan aksi untuk tombol "Kembali"
                backButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Menutup jendela grafik yang sedang tampil
                        JFrame chartFrame = (JFrame) SwingUtilities.getWindowAncestor(backButton);
                        chartFrame.dispose(); // Dispose jendela grafik yang dibuka
                    }
                });
            }
        });

// Menambahkan aksi untuk tombol Kembali
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Menutup jendela grafik yang sedang tampil
                JFrame chartFrame = (JFrame) SwingUtilities.getWindowAncestor(backButton);
                chartFrame.dispose(); // Menutup jendela grafik yang dibuka
            }
        });

        // Membuat JFrame dan menambahkan ComboBox dan Button
        JFrame frame = new JFrame("Pilih Bulan dan Tahun");

        // Panel untuk tombol "Kembali" di pojok kanan atas
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        backButton.setBackground(Color.RED);
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        topPanel.add(backButton);

        JPanel mainPanel = new JPanel();
        mainPanel.add(monthComboBox);
        mainPanel.add(yearComboBox);
        mainPanel.add(showButton);

        // Set JFrame menjadi undecorated dan fullscreen
        frame.setUndecorated(true); // Menghilangkan border dan title
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); // Menjadikan fullscreen
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Mengubah agar hanya menutup jendela

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(mainPanel, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    // Mengonversi nama bulan ke nomor bulan (1 = Januari, 2 = Februari, dst)
    private static int getMonthNumber(String month) {
        switch (month) {
            case "JANUARI":
                return 1;
            case "FEBRUARI":
                return 2;
            case "MARET":
                return 3;
            case "APRIL":
                return 4;
            case "MEI":
                return 5;
            case "JUNI":
                return 6;
            case "JULI":
                return 7;
            case "AGUSTUS":
                return 8;
            case "SEPTEMBER":
                return 9;
            case "OKTOBER":
                return 10;
            case "NOVEMBER":
                return 11;
            case "DESEMBER":
                return 12;
            default:
                return 0;
        }
    }
}
