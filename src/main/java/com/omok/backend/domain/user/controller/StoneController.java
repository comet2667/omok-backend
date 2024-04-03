package com.omok.backend.domain.user.controller;

import com.omok.backend.domain.user.model.StoneRequest;
import com.omok.backend.domain.user.service.StoneService;
import com.omok.backend.global.common.CommonResponse;
import com.omok.backend.global.common.StatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class StoneController {
    @Autowired
    StoneService stoneService;

    @PostMapping("/insertStone")
    @ResponseBody
    public ResponseEntity<CommonResponse> insertStone(@RequestBody StoneRequest stoneRequest){
        CommonResponse response = new CommonResponse();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
        System.out.println(stoneRequest.getX());
        int result = 0;
        try {
            result = stoneService.insertStone(stoneRequest);
        }catch (Exception e){
            System.out.println(e);
        }

        response.setStatus(StatusEnum.OK);
        response.setMessage("success");
        response.setData(result);

        return new ResponseEntity<>(response, headers, HttpStatus.OK);
    }
}
