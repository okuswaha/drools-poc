package org.prakash.drools;

import org.kie.api.KieServices;
import org.kie.api.builder.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

public class DroolsBeanFactory {
    private KieServices kieServices = KieServices.Factory.get();



//    public KieContainer getKieContainer() {
//        getKieRepository();
//        KieBuilder kieBuilder = kieServices.newKieBuilder(getKieFileSystem());
//        kieBuilder.buildAll();
//
//        KieModule kieModule = kieBuilder.getKieModule();
//        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());
//        return kieContainer;
//    }

//    private void getKieRepository() {
//        final KieRepository kieRepository = kieServices.getRepository();
//        kieRepository.addKieModule(new KieModule() {
//            public ReleaseId getReleaseId() {
//                return  kieRepository.getDefaultReleaseId();
//            }
//        });
//    }

//    private KieFileSystem getKieFileSystem(){
//        return kieServices.newKieFileSystem().write(ResourceFactory.newClassPathResource("rules.drl"));
//    }

    public KieSession getKieSession(){
        //getKieRepository();

        final KieRepository kieRepository = kieServices.getRepository();
        kieRepository.addKieModule(new KieModule() {
            public ReleaseId getReleaseId() {
                return  kieRepository.getDefaultReleaseId();
            }
        });

        KieFileSystem kieFileSystem = kieServices.newKieFileSystem();

        kieFileSystem.write(ResourceFactory.newClassPathResource("com/prakash/drools/rules/rules.drl"));

        KieBuilder kieBuilder =  kieServices.newKieBuilder(kieFileSystem);
        kieBuilder.buildAll();
        KieModule kieModule = kieBuilder.getKieModule();

        KieContainer kieContainer = kieServices.newKieContainer(kieModule.getReleaseId());

        return kieContainer.newKieSession();
    }
}
