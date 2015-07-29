import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;


/*
 @Author : Karshan Karmur
 
 Word count of string "she sells sea shells on the sea shore"
 
 Input - <key,value>
 		 key - 1
 		 value - "she sells sea shells on the sea shore"
 		 i.e. <1,she sells sea shells on the sea shore>
 
 Output - <key, value>
 		i.e.<she,1>
			<sells,1>
			<sea,1>
			<shells,1>
			<on,1>
			<the,1>
			<sea,1>
			<shore,1>
 */

public class WordCountMapper extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	public void map(LongWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		
		StringTokenizer st = new StringTokenizer(value.toString()," ");
		
		while(st.hasMoreTokens())
		{
			String s = st.nextToken();
			output.collect(new Text(s), new IntWritable(1));
		}
		
		
	}
	
	

}
