/**
 * Copyright (c) 2008 Severin Smith
 *
 * This file is part of a library called The MidiBus - http://www.smallbutdigital.com/themidibus.php.
 *
 * The MidiBus is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The MidiBus is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with the MidiBus. If not, see <http://www.gnu.org/licenses/>.
*/

package themidibus;

/**
 * A SimpleMidiListener can be notified of incomming NoteOn, NoteOff and ControllerChange Midi messages, usually by a MidiBus object which it is connected to. Typically it would analyse and react to incomming Midi messages in some useful way.
 *
 * @version 004
 * @author Severin Smith
 * @see MidiListener
 * @see RawMidiListener
 * @see StandardMidiListener
 * @see MidiBus
*/

public interface SimpleMidiListener extends MidiListener {
	
	/**
	 * Objects notifying this SimpleMidiListener of a new NoteOn Midi message call this method.
	 * 
	 * @param channel the channel on which the NoteOn arrived
	 * @param pitch the pitch associated with the NoteOn
	 * @param velocity the velocity associated with the NoteOn
	*/
	public void noteOn(int channel, int pitch, int velocity);
	
	/**
	 * Objects notifying this SimpleMidiListener of a new NoteOff Midi message call this method.
	 * 
	 * @param channel the channel on which the NoteOff arrived
	 * @param pitch the pitch associated with the NoteOff
	 * @param velocity the velocity associated with the NoteOff
	*/
	public void noteOff(int channel, int pitch, int velocity);
	
	/**
	 * Objects notifying this SimpleMidiListener of a new ControllerChange Midi message call this method.
	 * 
	 * @param channel the channel on which the ContollerChange arrived
	 * @param number the controller number associated with the ContollerChange
	 * @param value the controller value associated with the ContollerChange
	*/
	public void controllerChange(int channel, int number, int value);
	
}