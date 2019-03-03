package aa224fn_assign1.Chart;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.PieStyler;

public class Histogram {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Integer> list;
		list = Read();
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0,
				other = 0;

		for (int j = 0; j < list.size(); j++) {

			if (list.get(j) <= 10) {
				one++;
			} else if (list.get(j) > 10 && list.get(j) <= 20) {
				two++;
			} else if (list.get(j) > 20 && list.get(j) <= 30) {
				three++;
			} else if (list.get(j) > 30 && list.get(j) <= 40) {
				four++;
			} else if (list.get(j) > 40 && list.get(j) <= 50) {
				five++;
			} else if (list.get(j) > 50 && list.get(j) <= 60) {
				six++;
			} else if (list.get(j) > 60 && list.get(j) <= 70) {
				seven++;
			} else if (list.get(j) > 70 && list.get(j) <= 80) {
				eight++;
			} else if (list.get(j) > 80 && list.get(j) <= 90) {
				nine++;
			} else if (list.get(j) > 90 && list.get(j) <= 100) {
				ten++;
			} else {
				other++;
			}
		}
		histogram(one, two, three, four, five, six, seven, eight, nine, ten, other);
		showPieChart(one, two, three, four, five, six, seven, eight, nine, ten, other);
	}

	public static ArrayList<Integer> Read() throws FileNotFoundException {
		ArrayList<Integer> temp = new ArrayList<>();
		File file = new File("C:\\\\Users\\\\Seiya\\\\Documents\\\\lNU Workspace\\\\Histogram.txt");
		Scanner scan = new Scanner(file);
		while (scan.hasNext()) {
			int digit = scan.nextInt();
			temp.add(digit);
		}
		scan.close();

		return temp;
	}

	public static void histogram(int one, int two, int three, int four, int five, int six, int seven, int eight,
			int nine, int ten, int other) {

		CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Histogram")
				.xAxisTitle("Interval").yAxisTitle("Amount").build();

		chart.getStyler().setHasAnnotations(true);
		chart.getStyler().setLegendVisible(false);

		chart.addSeries("Numbers",
				Arrays.asList(new String[] { "0-10", "11-20", "21-30", "31-40", "41-50", "51-60", "61-70", "71-80",
						"81-90", "91-100", "Other" }),
				Arrays.asList(new Integer[] { one, two, three, four, five, six, seven, eight, nine, ten, other }));
		new SwingWrapper(chart).displayChart();
	}

	public static void showPieChart(int one, int two, int three, int four, int five, int six, int seven, int eight,
			int nine, int ten, int other) {
		PieChart chart = new PieChartBuilder().width(800).height(600).title("How many in each?").build();
		chart.getStyler().setLegendVisible(false);
		chart.getStyler().setAnnotationDistance(.82);
		chart.getStyler().setPlotContentSize(.9);
		chart.getStyler().setAnnotationType(PieStyler.AnnotationType.LabelAndPercentage);
		chart.addSeries("0-10", one);
		chart.addSeries("11-20", two);
		chart.addSeries("21-30", three);
		chart.addSeries("31-40", four);
		chart.addSeries("41-50", five);
		chart.addSeries("51-60", six);
		chart.addSeries("61-70", seven);
		chart.addSeries("71-80", eight);
		chart.addSeries("81-90", nine);
		chart.addSeries("91-100", ten);
		chart.addSeries("Other", other);
		new SwingWrapper(chart).displayChart();
	}

}