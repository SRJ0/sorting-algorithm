package com.abc.sorting.web;


import com.abc.sorting.web.dto.sortingResultDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SelectController {
    @GetMapping("/select")
    public sortingResultDto select(@RequestParam("method") String method) {
        sortingResultDto result = new sortingResultDto(method);
        return result;
    }

}
