package com.brenda_braganca.docker_manager.services;

import java.util.List;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Image;

@Service
public class DockerService {
    @Autowired
    private DockerClient dockerClient;
    
    public DockerService(DockerClient client){
        this.dockerClient = client;
    }

    public List<Container> listContainers(boolean all) {
        return dockerClient.listContainersCmd().withShowAll(all).exec();
    }

    public List<Image> listImages(){
        return dockerClient.listImagesCmd().exec();
    }

    public void startContainer(String containerId){
        dockerClient.startContainerCmd(containerId).exec();
    }

    public void stopContainer(String containerId){
        dockerClient.stopContainerCmd(containerId).exec();
    }

    public void deleteContainer(String containerId){
        dockerClient.removeContainerCmd(containerId).exec();
    }
    
    public void createContainer(String imageName){
        dockerClient.createContainerCmd(imageName).exec();
    }

}
