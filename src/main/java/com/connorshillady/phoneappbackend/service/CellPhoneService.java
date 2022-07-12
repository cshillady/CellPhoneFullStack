package com.connorshillady.phoneappbackend.service;

import com.connorshillady.phoneappbackend.dao.CellPhoneDAO;
import com.connorshillady.phoneappbackend.model.CellPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CellPhoneService {
  private final CellPhoneDAO cellPhoneDAO;
  
  @Autowired
  public CellPhoneService(@Qualifier("CellPhoneRepository") CellPhoneDAO cellPhoneDAO) {
    this.cellPhoneDAO = cellPhoneDAO;
  }
  
  public int insertCellPhone(int PhoneId, CellPhone cellPhone) {
    return cellPhoneDAO.insertCellPhone(PhoneId, cellPhone);
  }
  public int insertCellPhone(CellPhone cellPhone) {
    return cellPhoneDAO.insertCellPhone(cellPhone);
  }
  public int updateCellPhone(int PhoneId, CellPhone cellPhone) {
    return cellPhoneDAO.updateCellPhone(PhoneId, cellPhone);
  }
  public int deleteCellPhone(int PhoneId) {
    return cellPhoneDAO.deleteCellPhone(PhoneId);
  }
  public List<CellPhone> queryCellPhones() {
    return cellPhoneDAO.queryCellPhones();
  }
  public Optional<CellPhone> queryCellPhone(int PhoneId) {
    return cellPhoneDAO.queryCellPhone(PhoneId);
  }
}