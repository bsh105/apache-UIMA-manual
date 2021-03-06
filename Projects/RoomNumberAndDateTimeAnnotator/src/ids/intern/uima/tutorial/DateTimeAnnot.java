

/* First created by JCasGen Wed Dec 28 14:18:35 KST 2016 */
package ids.intern.uima.tutorial;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Dec 28 14:32:34 KST 2016
 * XML source: /Users/sanghwanbae/Documents/workspace/RoomNumberAndDateTimeAnnotator/desc/RoomNumberAndDateTimeAnnotator.xml
 * @generated */
public class DateTimeAnnot extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(DateTimeAnnot.class);
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
  protected DateTimeAnnot() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public DateTimeAnnot(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public DateTimeAnnot(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public DateTimeAnnot(JCas jcas, int begin, int end) {
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
  //* Feature: shortDateString

  /** getter for shortDateString - gets 
   * @generated
   * @return value of the feature 
   */
  public String getShortDateString() {
    if (DateTimeAnnot_Type.featOkTst && ((DateTimeAnnot_Type)jcasType).casFeat_shortDateString == null)
      jcasType.jcas.throwFeatMissing("shortDateString", "ids.intern.uima.tutorial.DateTimeAnnot");
    return jcasType.ll_cas.ll_getStringValue(addr, ((DateTimeAnnot_Type)jcasType).casFeatCode_shortDateString);}
    
  /** setter for shortDateString - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setShortDateString(String v) {
    if (DateTimeAnnot_Type.featOkTst && ((DateTimeAnnot_Type)jcasType).casFeat_shortDateString == null)
      jcasType.jcas.throwFeatMissing("shortDateString", "ids.intern.uima.tutorial.DateTimeAnnot");
    jcasType.ll_cas.ll_setStringValue(addr, ((DateTimeAnnot_Type)jcasType).casFeatCode_shortDateString, v);}    
  }

    