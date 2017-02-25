
/* First created by JCasGen Thu Dec 29 14:58:23 KST 2016 */
package ids.intern.uima.tutorial;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Thu Dec 29 15:21:18 KST 2016
 * @generated */
public class Morpheme_Type extends Annotation_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = Morpheme.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("ids.intern.uima.tutorial.Morpheme");
 
  /** @generated */
  final Feature casFeat_objectString;
  /** @generated */
  final int     casFeatCode_objectString;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getObjectString(int addr) {
        if (featOkTst && casFeat_objectString == null)
      jcas.throwFeatMissing("objectString", "ids.intern.uima.tutorial.Morpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_objectString);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setObjectString(int addr, String v) {
        if (featOkTst && casFeat_objectString == null)
      jcas.throwFeatMissing("objectString", "ids.intern.uima.tutorial.Morpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_objectString, v);}
    
  
 
  /** @generated */
  final Feature casFeat_morpheme;
  /** @generated */
  final int     casFeatCode_morpheme;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public String getMorpheme(int addr) {
        if (featOkTst && casFeat_morpheme == null)
      jcas.throwFeatMissing("morpheme", "ids.intern.uima.tutorial.Morpheme");
    return ll_cas.ll_getStringValue(addr, casFeatCode_morpheme);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setMorpheme(int addr, String v) {
        if (featOkTst && casFeat_morpheme == null)
      jcas.throwFeatMissing("morpheme", "ids.intern.uima.tutorial.Morpheme");
    ll_cas.ll_setStringValue(addr, casFeatCode_morpheme, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public Morpheme_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_objectString = jcas.getRequiredFeatureDE(casType, "objectString", "uima.cas.String", featOkTst);
    casFeatCode_objectString  = (null == casFeat_objectString) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_objectString).getCode();

 
    casFeat_morpheme = jcas.getRequiredFeatureDE(casType, "morpheme", "uima.cas.String", featOkTst);
    casFeatCode_morpheme  = (null == casFeat_morpheme) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_morpheme).getCode();

  }
}



    