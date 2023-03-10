/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App.View;

import App.Dao.BookDao;
import App.Model.book;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

public class FreeChart extends JPanel {

    private ChartPanel chartPanel;

    public FreeChart() throws Exception {
          this.init();
          
          this.setVisible(true);
    }

    public void init() throws Exception {
        this.chartPanel = new ChartPanel(createChart());
        this.chartPanel.setPreferredSize(new java.awt.Dimension(850, 550));
        this.add(this.chartPanel);
        this.chartPanel.setEnabled(true);
    }
    
    public JFreeChart createChart() throws Exception {
        JFreeChart chart = ChartFactory.createPieChart(
                "Biểu Đồ Quản Lí Sách", createDataset(), true, true, true);
        return chart;
    }
    
     public PieDataset createDataset() throws Exception{
        BookDao dao = new BookDao();
        ArrayList<book> list = new ArrayList<>();
        try {
            list = dao.selectBook();
        } catch (Exception ex) {
            Logger.getLogger(FreeChart.class.getName()).log(Level.SEVERE, null, ex);
        }
        int con = 0, het = 0, sum = 0;
        for(book b : list){
            if(b.isStatus()) het++;
            else con++;
            sum++;
        }
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Sách đã thuê: " + het * 100 / sum + '%',het * 100 / sum);
        dataset.setValue("Sách chưa thuê: " + con * 100 / sum + '%',con * 100 / sum);
        return dataset;
    }
}
