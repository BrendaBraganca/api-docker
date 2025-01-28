package com.brenda_braganca.docker_manager.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.brenda_braganca.docker_manager.services.DockerService;
import com.github.dockerjava.api.model.Image;

@Controller
@RequestMapping("/api/images")
public class DockerImagesController {

    private final DockerService dockerService;

    private DockerImagesController (DockerService service){
        this.dockerService = service;
    }

    @GetMapping("")
    public List<Image> listImages(){
        return dockerService.listImages();
    }

    @GetMapping("/filter")
    public List<Image> listImages(@RequestParam(required = false, defaultValue = "image-") String filter){
        return dockerService.filterImages(filter);
    }
}
