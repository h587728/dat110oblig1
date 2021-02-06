package no.hvl.dat110.messaging;

import java.util.Arrays;

import no.hvl.dat110.TODO;

public class Message {

	private byte[] payload;

	public Message(byte[] payload) {
		this.payload = payload; // TODO: check for length within boundary
	}

	public Message() {
		super();
	}

	public byte[] getData() {
		return this.payload;
	}

	public byte[] encapsulate() {

		byte[] encoded;

		// TODO
		// encapulate/encode the payload of this message in the
		// encoded byte array according to message format
<<<<<<< Updated upstream
		
		if (true)
		   throw new UnsupportedOperationException(TODO.method());
=======

		encoded = new byte[MessageConfig.SEGMENTSIZE];
		Integer recievedLength = payload.length;
		encoded[0] = recievedLength.byteValue();

		for (int i = 0; i < payload.length; i++) {
			encoded[i + 1] = payload[i];
		}
>>>>>>> Stashed changes

		return encoded;

	}

	public void decapsulate(byte[] received) {

		// TODO
		// decapsulate the data contained in the received byte array and store it
		// in the payload of this message
<<<<<<< Updated upstream
		
		throw new UnsupportedOperationException(TODO.method());
		
=======

		this.payload = new byte[received[0]];
		for (int i = 0; i < received[0]; i++) {
			this.payload[i] = received[i + 1];
		}

>>>>>>> Stashed changes
	}
}
