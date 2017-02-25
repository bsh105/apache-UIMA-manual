package ids.intern.uima.tutorial.morpheme;

import java.util.List;
import java.util.StringTokenizer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
import ids.intern.uima.tutorial.Morpheme;

import org.snu.ids.ha.ma.MExpression;
import org.snu.ids.ha.ma.MorphemeAnalyzer;
import org.snu.ids.ha.ma.Sentence;


/**
 * Example annotator that detects room numbers using Java 1.4 regular expressions.
 */
public class MorphemeAnnotator extends JCasAnnotator_ImplBase {
  
  /**
   * @see JCasAnnotator_ImplBase#process(JCas)
   */
  public void process(JCas aJCas) {
    // get document text
    String docText = aJCas.getDocumentText();
    
    
    // init MorphemeAnalyzer
 	MorphemeAnalyzer ma = new MorphemeAnalyzer();

 	// create logger, null then System.out is set as a default logger
 	ma.createLogger(null);

 	try{
 		// analyze morpheme without any post processing 
 		List<MExpression> ret = ma.analyze(docText);

 		// refine spacing
 		ret = ma.postProcess(ret);

 		// leave the best analyzed result
 		ret = ma.leaveJustBest(ret);

 		// divide result to setences
 		List<Sentence> stl = ma.divideToSentences(ret);
 			
 		// print the result
 		for( int i = 0; i < stl.size(); i++ ) {
 			Sentence st = stl.get(i);
 			System.out.println("===>  " + st.getSentence());
 			for( int j = 0; j < st.size(); j++ ) {
 				System.out.println(st.get(j));
 				
 				String result = st.get(j).toString();
 				
 				int beginIndex = result.indexOf("[") + 1;
 				int endIndex = result.indexOf("]");
 				String trimedResult = result.substring(beginIndex, endIndex);
 				
 				StringTokenizer tokenizer1 = new StringTokenizer(trimedResult, "+");
 				
 				while(tokenizer1.hasMoreTokens())
 				{
 					StringTokenizer tokenizer2 = new StringTokenizer(tokenizer1.nextToken(), "/");
 					Morpheme annotation = new Morpheme(aJCas);
 					
 					int begin = Integer.parseInt(tokenizer2.nextToken());
 					String objectString = tokenizer2.nextToken();
 					String morpheme = tokenizer2.nextToken();
 					
 					int end = begin + objectString.length();
 				
 					annotation.setBegin(begin);
 					annotation.setEnd(end);
 					annotation.setObjectString(objectString);
 					annotation.setMorpheme(morpheme);
 					annotation.addToIndexes();
 				}
 				
 			}
 		}

 		ma.closeLogger();

 	}
 	catch(Exception e)
 	{
 		e.printStackTrace();
 	}
 		
  }
}
