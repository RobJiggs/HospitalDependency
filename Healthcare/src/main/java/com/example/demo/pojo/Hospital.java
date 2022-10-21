/**
 * 
 */
package com.example.demo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 18, 2022
 */
@Component
public class Hospital {
	private Ambulance ambulance;
	@Autowired
	private Patient patient;
	private Doctor doctor;
	private Nurse nurse;
	/**
	 * @param nurse
	 */
	public Hospital(Nurse nurse) {
		super();
		this.nurse = nurse;
	}
	/**
	 * @return the ambulance
	 */
	
	/**
	 * @param ambulance the ambulance to set
	 */
	@Autowired
	public void setAmbulance(Ambulance ambulance) {
		this.ambulance = ambulance;
	}
	/**
	 * @return the doctor
	 */
	
	/**
	 * @param doctor the doctor to set
	 */
	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public void provideService() {
		patient.gotoHospital();
		ambulance.DriveToHospital();
		nurse.checkingIN();
		doctor.fixing();
		
		
		
	}
	

}
