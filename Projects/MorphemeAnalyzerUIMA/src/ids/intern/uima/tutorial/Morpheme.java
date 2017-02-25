

/* First created by JCasGen Thu Dec 29 14:58:23 KST 2016 */
package ids.intern.uima.tutorial;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Thu Dec 29 15:21:18 KST 2016
 * XML source: /Users/sanghwanbae/Documents/workspace/MorphemeAnalyzerUIMA/desc/MorphemeAnnotator.xml
 * @generated */
public class Morpheme extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(Morpheme.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected Morpheme() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public Morpheme(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public Morpheme(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public Morpheme(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: objectString

  /** getter for objectString - gets 
   * @generated
   * @return value of the feature 
   */
  public String getObjectString() {
    if (Morpheme_Type.featOkTst && ((Morpheme_Type)jcasType).casFeat_objectString == null)
      jcasType.jcas.throwFeatMissing("objectString", "ids.intern.uima.tutorial.Morpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Morpheme_Type)jcasType).casFeatCode_objectString);}
    
  /** setter for objectString - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setObjectString(String v) {
    if (Morpheme_Type.featOkTst && ((Morpheme_Type)jcasType).casFeat_objectString == null)
      jcasType.jcas.throwFeatMissing("objectString", "ids.intern.uima.tutorial.Morpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((Morpheme_Type)jcasType).casFeatCode_objectString, v);}    
   
    
  //*--------------*
  //* Feature: morpheme

  /** getter for morpheme - gets 
   * @generated
   * @return value of the feature 
   */
  public String getMorpheme() {
    if (Morpheme_Type.featOkTst && ((Morpheme_Type)jcasType).casFeat_morpheme == null)
      jcasType.jcas.throwFeatMissing("morpheme", "ids.intern.uima.tutorial.Morpheme");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Morpheme_Type)jcasType).casFeatCode_morpheme);}
    
  /** setter for morpheme - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setMorpheme(String v) {
    if (Morpheme_Type.featOkTst && ((Morpheme_Type)jcasType).casFeat_morpheme == null)
      jcasType.jcas.throwFeatMissing("morpheme", "ids.intern.uima.tutorial.Morpheme");
    jcasType.ll_cas.ll_setStringValue(addr, ((Morpheme_Type)jcasType).casFeatCode_morpheme, v);}    
  }

    