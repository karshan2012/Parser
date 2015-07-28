import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

/*
 	
 	@Author : Karshan Karmur
 	
 	Reducer(K1,V1,K2,V2)
   
   	K1 - Key as input from output of different mappers(intermediate keys)
   	V1 - Values as input from output of different mappers)intermediate values)
   	K2 - Key of final output
   	V2 - Value of final output
   	
   	eg. Total 3 Mappers
   		1)Word count of 3 Strings s1 = "I am I Karshan I am Karmur",
								 s2 = "I am from I Jamnagar",
								 s3 = "I am Karshan and am lives in Surat"
	
								 
		
		
		Output from 3 Mappers is:
			1)	<"I", 1>,
 			 	<"am", 1>,
 			 	<"I", 1>,
 			 	<"Karshan", 1>,
 			 	<"I", 1>,
 			 	<"am", 1>,
 			 	<"Karmur", 1>
 			 
 			 2)	<"I", 1>,
 			 	<"am", 1>,
 			 	<"from", 1>,
 			 	<"I", 1>,
 			 	<"Jamnagar", 1>
 			 	
 			 3) <"I", 1>,
 			 	<"am", 1>,
 			 	<"Karshan", 1>,
 			 	<"and", 1>,
 			 	<"am", 1>,
 			 	<"lives", 1>,
 			 	<"in", 1>,
 			 	<"Surat", 1>
 			 	
 			 	
 		Input to reducer is output from mappers but in sorted order
 		
 			 1)	<"am", 1>,
 			 	<"am", 1>,
 			 	<"I", 1>,
 			 	<"I", 1>,
 			 	<"Karmur", 1>,
 			 	<"Karshan", 1>
 			 	
 			 
 			 2)	<"am", 1>,
 			 	<"from", 1>,
 			 	<"I", 1>,
				<"I", 1>,
 			 	<"Jamnagar", 1>
 			 	
 			 3) <"am", 1>,
 			 	<"am", 1>,
 			 	<"and", 1>,
 			 	<"I", 1>,
 			 	<"in", 1>,
 			 	<"Karshan", 1>,
				<"lives", 1>,
 			 	<"Surat", 1>
 			 
 			 
 			 Output from reducer corresponding to each mapper input is
 			 
 			 1)	<"am", 2>,
 			 	<"I", 2>,
 			 	<"Karmur", 1>,
 			 	<"Karshan", 1>
 			 	
 			 
 			 2)	<"am", 1>,
 			 	<"from", 1>,
 			 	<"I", 2>,
 			 	<"Jamnagar", 1>
 			 	
 			 3) <"am", 2>,
 			 	<"and", 1>,
 			 	<"I", 1>,
 			 	<"in", 1>,
 			 	<"Karshan", 1>,
				<"lives", 1>,
 			 	<"Surat", 1>
 		
								 
  
  
 */

public class MyReducer extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {
	
	@Override
	public void reduce(Text key, Iterator<IntWritable> values,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		while(values.hasNext())
		{
		output.collect(key, values.next());
		}
		
	}

}
