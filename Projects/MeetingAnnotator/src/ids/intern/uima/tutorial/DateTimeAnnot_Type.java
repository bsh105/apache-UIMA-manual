
/* First created by JCasGen Wed Dec 28 15:42:54 KST 2016 */
package ids.intern.uima.tutorial;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Wed Dec 28 15:55:17 KST 2016
 * @generated */
public class DateTimeAnnot_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = DateTimeAnnot.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("ids.intern.uima.tutorial.DateTimeAnnot");
 
  /** @generated */
  final Feature casFeat_shortDateString;
  /** @generated */
  final int     casFeatCode_shortDateString;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getShortDateString(int addr) {
        if (featOkTst && casFeat_shortDateString == null)
      jcas.throwFeatMissing("shortDateString", "ids.intern.uima.tutorial.DateTimeAnnot");
    return ll_cas.ll_getStringValue(addr, casFeatCode_shortDateString);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setShortDateString(int addr, String v) {
        if (featOkTst && casFeat_shortDateString == null)
      jcas.throwFeatMissing("shortDateString", "ids.intern.uima.tutorial.DateTimeAnnot");
    ll_cas.ll_setStringValue(addr, casFeatCode_shortDateString, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public DateTimeAnnot_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_shortDateString = jcas.getRequiredFeatureDE(casType, "shortDateString", "uima.cas.String", featOkTst);
    casFeatCode_shortDateString  = (null == casFeat_shortDateString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_shortDateString).getCode();

  }
}



    