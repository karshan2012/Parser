import java.io.IOException;
import java.util.Arrays;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

/*
   @Author : Karshan Karmur
   
  The Anagram mapper class gets a word as a line from the HDFS input and sorts the
  letters in the word and writes it back to the output collector.
  
  Key : sorted word
  Value: word itself as the value
  
  Input <key, value>
  	e.g. 1)<1, mumbai>
  		 2)<2, bummai>
  		 3)<3, surat>
  		 4)<4, amibum>
  		 5)<5, delhi>
  		 
  	Output <key, value>
  	e.g. 1)<abimmu, mumbai>
  		 2)<abimmu, bummai>
  		 3)<arstu, surat>
  		 4)<abimmu, amibum>
  		 5)<dehil, delhi>
 */
public class AnagramMapper extends MapReduceBase implements Mapper<IntWritable, Text, Text, Text>{
	
	Text originalText = new Text();
	Text sortedText = new Text();

	@Override
	public void map(IntWritable key, Text value,
			OutputCollector<Text, Text> output, Reporter reporter)
			throws IOException {
		// TODO Auto-generated method stub
		
		String word = value.toString();
		char[] charWord = word.replaceAll("[\\s]", "").toCharArray();
		Arrays.sort(charWord);
		String sortedWord = new String(charWord);
		sortedText.set(sortedWord);
		originalText.set(word);
		output.collect(sortedText, originalText);
		
		
		
	}

}
