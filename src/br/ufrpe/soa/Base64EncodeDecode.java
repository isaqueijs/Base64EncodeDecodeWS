package br.ufrpe.soa;

import java.util.Base64;

import javax.jws.WebService;

@WebService(targetNamespace = "http://soa.ufrpe.br/", portName = "Base64EncodeDecodePort", serviceName = "Base64EncodeDecodeService")
public class Base64EncodeDecode {

	public String encodeString(String value) {
		return Base64.getEncoder().encodeToString(value.getBytes());
	}
	
	public String decodeString(String encodedString) {
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		return new String(decodedBytes);
	}
}
