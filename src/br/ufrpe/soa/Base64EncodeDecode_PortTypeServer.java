
package br.ufrpe.soa;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.5.3
 * 2022-08-15T20:00:40.519-03:00
 * Generated source version: 3.5.3
 *
 */

public class Base64EncodeDecode_PortTypeServer{

    protected Base64EncodeDecode_PortTypeServer() throws Exception {
        System.out.println("Starting Server");
        Object implementor = new br.ufrpe.soa.Base64EncodeDecode();
        String address = "http://localhost:9090/Base64EncodeDecode";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws Exception {
        new Base64EncodeDecode_PortTypeServer();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}

