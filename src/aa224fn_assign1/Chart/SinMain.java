package aa224fn_assign1.Chart;

import java.util.ArrayList;
import java.util.List;

import org.knowm.xchart.QuickChart;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.XYChart;

public class SinMain {

	public static void main(String[] args) {
		List<Double> xAxis = new ArrayList<>();
		List<Double> yAxis = new ArrayList<>();
		for (double x = 0; x < 2 * Math.PI; x += 2 * Math.PI / 1000) {
			xAxis.add(x);
		}
		for (int i = 0; i < xAxis.size(); i++) {
			yAxis.add((1 + xAxis.get(i) / Math.PI) * Math.cos(xAxis.get(i)) * Math.cos(40 * xAxis.get(i)));
		}
		XYChart chart = QuickChart.getChart("Sin Curve", "X", "Y", " ", xAxis, yAxis);
		chart.getStyler().setMarkerSize(16);
		chart.getStyler().setHasAnnotations(true);
		new SwingWrapper<>(chart).displayChart();

	}
}
