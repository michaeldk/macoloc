package com.macoloc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.macoloc.service.contract.CoinService;

/**
 * The coins controller.
 */
@Controller
@RequestMapping("/coins")
public class CoinController {

    @Autowired
    public CoinController(final CoinService service) {
    }
}
