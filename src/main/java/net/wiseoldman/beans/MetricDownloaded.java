package net.wiseoldman.beans;

import java.util.List;
import lombok.Value;

@Value
public class MetricDownloaded
{
	double version;
	List<MetricName> metrics;

	@Value
	private static class MetricName {
		String metric;
		String name;
	}
}
