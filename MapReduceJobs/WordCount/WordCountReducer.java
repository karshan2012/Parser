import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

/*
  
  Input - <key, value>
  		i.e. <on, 1>
			<sea, 1>
			<sea, 1>
			<sells, 1>
			<she, 1>
			<shells, 1>
			<shore, 1>
			<the, 1>
			
  Outout - <key, value>
		 i.e. <on, 1>
			 <sea, 2>
			 <sells, 1>
			 <she, 1>
			 <shells, 1>
			 <shore, 1>
			 <the, 1>
 */

public class WordCountReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {

	@Override
	public void reduce(Text key, Iterator<IntWritable> value,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		int count = 0;
		while(value.hasNext())
		{
			count+=value.next().get();
		}
		output.collect(key,new IntWritable(count));
		
	}

}
