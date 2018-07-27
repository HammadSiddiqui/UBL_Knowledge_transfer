package com.company;

import com.sun.tools.internal.xjc.runtime.JAXBContextFactory;
import mypackage.*;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.Marshaller;
import java.io.File;



public class Main {

    public static void main(String[] args) {

        //unmarshall();
        marshall();

    }

    public static void unmarshall () {
        try {

            File file = new File("/Users/hammadsiddiqui/IdeaProjects/jaxb_tutorial/src/com/company/index.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(IBMXType.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            IBMXType obj = (IBMXType) jaxbUnmarshaller.unmarshal(file);
            System.out.println(obj);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void marshall() {
        try {
            //Add
            FDTStatusType fdtstatus = new FDTStatusType();
            fdtstatus.setSTAN("21");
            fdtstatus.setHostStatusCode("4042");
            fdtstatus.setPostingDate("Blah");
            fdtstatus.setHostStatusDesc("121");
            fdtstatus.setTxnReference("pop");
            fdtstatus.setStatusCode("23");
            fdtstatus.setStatusDesc("55");

            FDTListType fdtList = new FDTListType();
            fdtList.setFDTStatus(fdtstatus);

            RSPType rsp = new RSPType();
            rsp.setFDTList(fdtList);
            rsp.setBatchReferenceNo("01213123");
            rsp.setSTAN("Christmas");

            FDTRspType fdtRsp = new FDTRspType();
            fdtRsp.setRSP(rsp);

            IBMXType ibmx = new IBMXType();
            ibmx.setFDTRsp(fdtRsp);


            File file = new File("/Users/hammadsiddiqui/IdeaProjects/jaxb_tutorial/src/com/company/generated.xml");
            JAXBContext context = JAXBContext.newInstance(IBMXType.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

            // Write to System.out
            m.marshal(ibmx, System.out);


    } catch (JAXBException e) {
        e.printStackTrace();
    }





    }
}

