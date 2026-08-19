package soa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import soa.service.GatewayService;

@RestController
@RequestMapping("/")
public class GatewayController {
	GatewayService GS;
	public GatewayController(GatewayService GS) {
		this.GS = GS;
	}
	@GetMapping("{service}/{endpoint}")
	public Object getService(@PathVariable("service") String service, @PathVariable("endpoint") String endpoint) {
		return GS.invokeService(service, endpoint);
	}

}
