import java.io.IOException;

import javax.xml.soap.Text;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;

/*
  @Author : Karshan Karmur
 */

public class MyDriver {

		
	
	public static void main(String args[]) throws IOException
		{
	
		//create the JobConf object	
		JobConf conf = new JobConf(MyDriver.class);
		
		//set job name
		conf.setJobName("FirstJobName");
		
		//set output key type for mapper
		conf.setMapOutputKeyClass(Text.class);
		
		//set output value for mapper
		conf.setOutputValueClass(IntWritable.class);
		
		//set output key type for reducer
		conf.setOutputKeyClass(Text.class);
		
		//set output value for mapper
		conf.setOutputValueClass(IntWritable.class);
		
		//set mapper class
		conf.setMapperClass(Mapper.class);
		
		//set reducer class
		conf.setReducerClass(Reducer.class);
		
		//set format of the input that will be provided to the program
		conf.setInputFormat(TextInputFormat.class);
		
		//set format of the output that will be provided to the program
		conf.setOutputFormat(TextOutputFormat.class);
		
		//set location from where mapper will read the input
		FileInputFormat.setInputPaths(conf, new Path(args[0]));
		
		//set location where reducer will write output 
		FileOutputFormat.setOutputPath(conf, new Path(args[1]));
		
		//run the job on the cluster
		JobClient.runJob(conf);
			
		}

}