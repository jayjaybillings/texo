/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.emf.texo.example1.rcp.music;

import org.eclipse.emf.texo.example1.rcp.identifiable.Identifiable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Song</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Song#getTrack <em>Track</em>}</li>
 *   <li>{@link org.eclipse.emf.texo.example1.rcp.music.Song#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getSong()
 * @model
 * @generated
 */
public interface Song extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Track</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track</em>' attribute.
	 * @see #setTrack(int)
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getSong_Track()
	 * @model
	 * @generated
	 */
	int getTrack();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.music.Song#getTrack <em>Track</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Track</em>' attribute.
	 * @see #getTrack()
	 * @generated
	 */
	void setTrack(int value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.texo.example1.rcp.music.MusicPackage#getSong_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.texo.example1.rcp.music.Song#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Song
