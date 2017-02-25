/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package ids.intern.uima.tutorial;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;

/** 
 * Updated by JCasGen Wed Dec 28 15:55:17 KST 2016
 * XML source: /Users/sanghwanbae/Documents/workspace/MeetingAnnotator/desc/MeetingDetectorTAE.xml
 * @generated */
public class Meeting extends Annotation {
  /**
   * @generated
   * @ordered
   */
  public final static int typeIndexID = JCasRegistry.register(Meeting.class);

  /**
   * @generated
   * @ordered
   */
  public final static int type = typeIndexID;

  /** @generated */
  public int getTypeIndexID() {return typeIndexID;}
 
  /**
   * Never called. Disable default constructor
   * 
   * @generated
   */
  protected Meeting() {/* intentionally empty block */}
    
  /**
   * Internal - constructor used by generator
   * 
   * @generated
   */
  public Meeting(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public Meeting(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  public Meeting(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }

  /** 
   * <!-- begin-user-doc --> Write your own initialization here <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {
  }

  // *--------------*
  // * Feature: room

  /**
   * getter for room - gets
   * 
   * @generated
   */
  public RoomNumber getRoom() {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_room == null)
      jcasType.jcas.throwFeatMissing("room", "ids.intern.uima.tutorial.Meeting");
    return (RoomNumber)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_room)));}
    
  /**
   * setter for room - sets
   * 
   * @generated
   */
  public void setRoom(RoomNumber v) {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_room == null)
      jcasType.jcas.throwFeatMissing("room", "ids.intern.uima.tutorial.Meeting");
    jcasType.ll_cas.ll_setRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_room, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  // *--------------*
  // * Feature: date

  /**
   * getter for date - gets
   * 
   * @generated
   */
  public DateAnnot getDate() {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "ids.intern.uima.tutorial.Meeting");
    return (DateAnnot)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_date)));}
    
  /**
   * setter for date - sets
   * 
   * @generated
   */
  public void setDate(DateAnnot v) {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_date == null)
      jcasType.jcas.throwFeatMissing("date", "ids.intern.uima.tutorial.Meeting");
    jcasType.ll_cas.ll_setRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_date, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  // *--------------*
  // * Feature: startTime

  /**
   * getter for startTime - gets
   * 
   * @generated
   */
  public TimeAnnot getStartTime() {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "ids.intern.uima.tutorial.Meeting");
    return (TimeAnnot)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_startTime)));}
    
  /**
   * setter for startTime - sets
   * 
   * @generated
   */
  public void setStartTime(TimeAnnot v) {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_startTime == null)
      jcasType.jcas.throwFeatMissing("startTime", "ids.intern.uima.tutorial.Meeting");
    jcasType.ll_cas.ll_setRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_startTime, jcasType.ll_cas.ll_getFSRef(v));}    
   
    
  // *--------------*
  // * Feature: endTime

  /**
   * getter for endTime - gets
   * 
   * @generated
   */
  public TimeAnnot getEndTime() {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "ids.intern.uima.tutorial.Meeting");
    return (TimeAnnot)(jcasType.ll_cas.ll_getFSForRef(jcasType.ll_cas.ll_getRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_endTime)));}
    
  /**
   * setter for endTime - sets
   * 
   * @generated
   */
  public void setEndTime(TimeAnnot v) {
    if (Meeting_Type.featOkTst && ((Meeting_Type)jcasType).casFeat_endTime == null)
      jcasType.jcas.throwFeatMissing("endTime", "ids.intern.uima.tutorial.Meeting");
    jcasType.ll_cas.ll_setRefValue(addr, ((Meeting_Type)jcasType).casFeatCode_endTime, jcasType.ll_cas.ll_getFSRef(v));}    
          /** Custom constructor taking all parameters */
  public Meeting(JCas jcas, int start, int end, RoomNumber room, DateAnnot date,
          TimeAnnot startTime, TimeAnnot endTime) {
    this(jcas, start, end);
    setRoom(room);
    setDate(date);
    setStartTime(startTime);
    setEndTime(endTime);
  }

  public String toString() {
    return "Meeting in " + getRoom().getCoveredText() + " on " + getDate().getCoveredText() + ", "
            + getStartTime().getCoveredText() + " - " + getEndTime().getCoveredText();
  }

}
