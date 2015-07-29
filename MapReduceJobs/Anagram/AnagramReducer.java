import java.io.IOException;
import java.util.Iterator;
import java.util.StringTokenizer;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

/*
   @Author : Karshan Karmur
   
  The Anagram reducer class groups the values of the sorted keys that came in and 
  checks to see if the values iterator contains more than one word. if the values 
  contain more than one word we have spotted a anagram.
  
  Iterate through a key and add all values matching with that key to outputValue separated by comma.
  
  Key : sorted word
  Value: list of words matching sorted word
  
  
  Input <key, value>
  	e.g. 1)<abimmu, mumbai>
  		 2)<abimmu, bummai>
  		 3)<abimmu, amibum>
  		 4)<dehil, delhi>
  		 5)<arstu, surat>
  		 
  Output <key, value>
  	e.g. 1)<abimmu, mumbai,bummai,amibum>
  		 2)<dehil, delhi>
  		 3)<arstu, surat>
 */

public class AnagramReducer extends MapReduceBase implements Reducer<Text, Text, Text, Text> {

	Text outputKey = new Text();
	Text outputValue = new Text();
	
	@Override
	public void reduce(Text anagramKey, Iterator<Text> anagramValue,
			OutputCollector<Text, Text> output, Reporter reporter) throws IOException {
		// TODO Auto-generated method stub
		
		String op = "";
		while(anagramValue.hasNext())
		{
			op = op + anagramValue.next().toString() + "~";
		}
		
		StringTokenizer st = new StringTokenizer(op,"~");
		
		if(st.countTokens()>=2)
		{
			op = op.replace("~", ",");
			outputKey.set(anagramKey);
			outputValue.set(op);
			output.collect(outputKey, outputValue);
		}
		
	}

}
