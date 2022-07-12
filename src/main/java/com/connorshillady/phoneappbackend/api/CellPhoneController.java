package com.connorshillady.phoneappbackend.api;

import com.connorshillady.phoneappbackend.model.CellPhone;
import com.connorshillady.phoneappbackend.service.CellPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "cellphones/")
public class CellPhoneController {
  private final CellPhoneService cellPhoneService;
  
  @Autowired
  public CellPhoneController(CellPhoneService cellPhoneService) {
    this.cellPhoneService = cellPhoneService;
  }
  
  @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE)
  int insertCellPhone(@RequestBody CellPhone cellPhone) {
    return cellPhoneService.insertCellPhone(cellPhone);
  }
  @PutMapping(value = "{PhoneId}")
  int updateCellPhone(@PathVariable("PhoneId") int PhoneId, @RequestBody CellPhone cellPhone) {
    return cellPhoneService.updateCellPhone(PhoneId, cellPhone);
  }
  @DeleteMapping(value = "{PhoneId}")
  int deleteCellPhone(@PathVariable("PhoneId") int PhoneId) {
    return cellPhoneService.deleteCellPhone(PhoneId);
  }
  @GetMapping
  List<CellPhone> queryCellPhones() {
    return cellPhoneService.queryCellPhones();
  }
  @GetMapping(value = "{PhoneId}")
  Optional<CellPhone> queryCellPhone(@PathVariable("PhoneId") int PhoneId) {
    return cellPhoneService.queryCellPhone(PhoneId);
  }
}