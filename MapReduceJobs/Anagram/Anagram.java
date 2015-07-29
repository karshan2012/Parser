import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.FileInputFormat;
import org.apache.hadoop.mapred.FileOutputFormat;
import org.apache.hadoop.mapred.JobClient;
import org.apache.hadoop.mapred.JobConf;
import org.apache.hadoop.mapred.TextInputFormat;
import org.apache.hadoop.mapred.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

/*
   @Author : Karshan Karmur
   
  Configuration file to run Anagram Map-Reduce job
  
 */
public class Anagram extends Configured implements Tool{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int exitCode = ToolRunner.run(new Anagram(), args);
		
		System.exit(exitCode);
	}

	@Override
	public int run(String[] arg0) throws Exception {
		// TODO Auto-generated method stub
		
		JobConf conf = new JobConf(Anagram.class);
		conf.setJobName("anagramJob");
		
		conf.setOutputKeyClass(Text.class);
		conf.setOutputValueClass(Text.class);
		
		conf.setMapperClass(AnagramMapper.class);
		conf.setReducerClass(AnagramReducer.class);
		
		conf.setInputFormat(TextInputFormat.class);
		conf.setOutputFormat(TextOutputFormat.class);
		
		FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
		FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));
		
		JobClient.runJob(conf);
		return 0;
	}

}
