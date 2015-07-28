

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

/* 
 	 @Author : Karshan Karmur
 	 
 	Mapper(K1,V1,K2,V2)

	K1 - Key of input
	V1 - value of input
	K2 - Key of output
	V2 - value of output
	
	e.g. Word count of 5 Strings s1 = "I am Karshan Karmur",
								 s2 = "I am from Jamnagar",
								 s3 = "I did my bachelors from NIT Surat",
								 s4 = "I am working in RJIL,
								 s5 = "I live in Mumbai"
								 
		K1 - 1,2,3,4,5
		V1 - "I am Karshan Karmur","I am from Jamnagar","I did my bachelors from NIT Surat","I am working in RJIL,"I live in Mumbai"
		
		K2 - "I","am","from","in","Karshan","Karmur","Jamnagar","did","my","bachelors","NIT","Surat","working","RJIL","live","Mumbai"
		V2 - 5,3,2,2,1,1,1,1,1,1,1,1,1,1,1,1
*/

/*
 
 Map(key,value,output<text,IntWritable>,reporter)
 (<key,value> input of 3 mappers named 1,2,3)
 
 	key - 	1,2,3
 	value - "I am I Karshan I am Karmur","I am from I Jamnagar","I am Karshan and am lives in Surat"
 	
 	output - 1)	<"I", 1>,
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
 
 */

public class MyMapper extends MapReduceBase implements Mapper<IntWritable, Text, Text, IntWritable>{

	@Override
	public void map(IntWritable key, Text value,
			OutputCollector<Text, IntWritable> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		output.collect(value, key);
		
	}
	
	
}
